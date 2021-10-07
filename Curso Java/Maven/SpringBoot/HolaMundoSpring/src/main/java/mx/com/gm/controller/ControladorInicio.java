package mx.com.gm.controller;

import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
//Libreria de logs
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/inicio")
    public List<String> inicio(){
        log.info("Cargando....");
        List<String> datos = new ArrayList<>();
        datos.add("DATO 1");
        datos.add("DATO 2");
        datos.add("DATO 3");
        log.info("Datos cargados exitosamente");
        return datos;
    }
}
