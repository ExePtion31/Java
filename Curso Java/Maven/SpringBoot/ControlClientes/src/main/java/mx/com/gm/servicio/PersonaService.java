package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Persona;

public interface PersonaService {
    
    public List<Persona> finAll();
    
    public void actualizar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(long id);
    
    public void guardar(Persona persona);
}
