package mx.com.gm.controller;

import javax.validation.Valid;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControladorInicio {

    @Autowired
    private PersonaService servicio;

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user) {
        var personas = servicio.finAll();
        System.out.println("Usuario que hizo login: " + user);
        model.addAttribute("objetoPersonas", personas);
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        
        servicio.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model){
        persona = servicio.encontrarPersona(persona.getIdPersona());
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar/{idPersona}")
    public String eliminar(Persona persona){
        servicio.eliminar(persona);
        return "redirect:/";
    }
}
