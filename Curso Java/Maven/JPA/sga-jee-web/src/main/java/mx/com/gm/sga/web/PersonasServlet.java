package mx.com.gm.sga.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.*;

@WebServlet("/PersonasServlet")
public class PersonasServlet extends HttpServlet {

    PersonaService personaService = new PersonaServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Persona> personas = personaService.listarPersonas();
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
    }
}
