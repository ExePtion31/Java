package test;

import datos.*;
import entity.Persona;
import java.sql.*;

public class TestManejoPersonas {

    public static void main(String[] args) {
        
        Connection conexion = null;
        try {
            conexion = ConexionDB.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            
            IPersonaDAO personaDao = new PersonaDAO(conexion);
            
            //Actualizar
            Persona persona = new Persona();
            persona.setIdPersona(3);
            persona.setNombre("Pablito");
            persona.setApellido("Amaril");
            persona.setEmail("pablito@gmail.com");
            persona.setTelefono("3102202245");
            personaDao.actualizar(persona);
            
            //Nuevo
            Persona personaNueva = new Persona("Pablito", "Rodriguez", "jrodriguez@gmail.com", "3116758454");
            personaDao.insertar(personaNueva);
            
            conexion.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error al realizar las acciones.");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }

}
