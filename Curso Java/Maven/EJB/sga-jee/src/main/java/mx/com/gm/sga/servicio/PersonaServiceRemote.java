package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Persona;

@Remote
public interface PersonaServiceRemote {

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaId(Persona persona);

    public Persona encontrarPersonaEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
