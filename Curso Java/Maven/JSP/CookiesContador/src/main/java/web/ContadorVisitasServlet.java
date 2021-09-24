package web;

import java.io.*;
import javax.servlet.http.*;

public class ContadorVisitasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //variable contador
        int contador = 0;

        //Revisamos si existe la variable de contador en nuestras cookies
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("contadorVisitas")) {
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }

        //incrementar el contador +1
        contador++;
        //Agregamos una nueva cookie 
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        //la cookie se almacena por 1 hora(3600s)
        c.setMaxAge(3600);
        response.addCookie(c);

        //Mandamos el mensaje al navegador
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);
    }
}
