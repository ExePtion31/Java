package web;

import java.io.*;
import javax.servlet.http.*;

public class SesionesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession sesion = request.getSession();
        String titulo = null;

        //Pedir el atributo contadorVisitas a la sesion
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");

        //Si es nulo es la primera vez que accedemos a la app
        if (contadorVisitas == null) {
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez.";
        } else {
            contadorVisitas++;
            titulo = "Bienvenido de nuevo.";
        }

        //agregamos el nuevo valor a la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);

        PrintWriter out = response.getWriter();
        out.print("No. de visitas a la web: " + contadorVisitas);
        out.print("<br>");
        out.print(titulo);
        out.print("<br>");
        out.print("ID de la sesión: " + sesion.getId());
        out.close();
    }
}
