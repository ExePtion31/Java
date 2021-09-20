package web;

import java.io.*;
import java.util.*;
import javax.servlet.http.*;

public class ServletCarrito extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        //recuperamos el objeto HttpSession
        HttpSession sesion = request.getSession();

        //recuperamos la lista de articulos agregados
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //Verifiacmos si existe la lista de articulos
        if (articulos == null) {
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //procesamos el articulo
        String nuevoArticulo = request.getParameter("articulo");

        //revisamos el articulo nuevo
        if (nuevoArticulo != null && !nuevoArticulo.trim().equals("")) {
            articulos.add(nuevoArticulo);
        }

        try (
            //imprimimos la lista de articulso
            PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de articulos</h1><br>");
            for (String a : articulos) {
                out.print("<li>" + a + "</li>   ");
            }
            out.print("<br>");
            out.print("<a href='/CarritoCompras'>Regresar al inicio</a>");
        }
    }
}
