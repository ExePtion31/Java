package web;

import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class GeneracionExcelServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //tipo de respuesta al navegador.
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=Ejemplo.xls");
        
        //no guarda caché y expira de manera inmediata.
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);
        
        //desplegamos la informacion al cliente.
        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(b2:b3)");
        out.close();
    }
}
