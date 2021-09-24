package datos;

import entity.Persona;
import java.sql.SQLException;
import java.util.List;

public interface IPersonaDAO {
   public List<Persona> seleccionar() throws SQLException;
   
   public void insertar(Persona persona) throws SQLException;
   
   public void actualizar(Persona persona) throws SQLException;
   
   public void eliminar(Persona persona) throws SQLException;
}
