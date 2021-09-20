package web;

import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HoraServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh", "1");
        Date fecha = new Date();
        SimpleDateFormat format = new SimpleDateFormat("'Hora: ' HH:mm:ss");
        String horaFormato = format.format(fecha);
        
        PrintWriter out = response.getWriter();
        out.print(horaFormato);
        out.close();
    }
}
