package mx.com.gm.sga.servicio;

import java.util.*;
import javax.ejb.Stateless;
import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote {

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", "Perez", "jperez@gmail.com", "3102202183"));
        personas.add(new Persona(2, "Martha", "Suarez", "msuarez@gmail.com", "3115132734"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
