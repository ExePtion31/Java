package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Suponemos que el usuario entro por primera vez al sitio
        boolean nuevoUsuario = true;

        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();

        //Buscar si existe alguna cookie creada con anterioridad
        //llamada visitanteRecurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    //Si existe la cookie, el usuario ya ha visitado el sitio
                    nuevoUsuario = false;
                    break;
                }
            }
        }

        String mensaje = null;
        if (nuevoUsuario) {
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez.";
        } else {
            mensaje = "Gracias por visitar nuevamente nuestro sitio";
        }
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje: " + mensaje);
        out.close();
    }
}
