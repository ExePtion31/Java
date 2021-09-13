package web;

import java.io.*;
import jakarta.servlet.http.*;

public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String usuarioOk = "ExePtion";
        String passOk = "acm1ptchonta";
        PrintWriter out = response.getWriter();
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        if(usuarioOk.equals(usuario) && passOk.equals(password)){
            out.print("<h1>Datos correctos</h1>");
            out.print("Usuario: " + usuario);
            out.print("<br>Password: " + password);
        }else{
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas.");
        }
        out.close();
    }
}
