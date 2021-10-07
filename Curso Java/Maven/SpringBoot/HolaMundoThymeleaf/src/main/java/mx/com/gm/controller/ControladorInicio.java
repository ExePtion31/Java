package mx.com.gm.controller;

import mx.com.gm.repository.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControladorInicio {

    @Autowired
    private PersonaDao personaDao;

    @GetMapping("/inicio")
    public String inicio(Model model) {
        var personas = personaDao.findAll();
        model.addAttribute("objetoPersonas", personas);
        return "index";
    }
}
