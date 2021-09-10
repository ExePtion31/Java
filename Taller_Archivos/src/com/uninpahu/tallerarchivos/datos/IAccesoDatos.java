package com.uninpahu.tallerarchivos.datos;

import com.uninpahu.tallerarchivos.entity.Persona;
import java.util.List;

public interface IAccesoDatos {
    boolean existeArchivo(String nombreArchivo);
    
    void crearArchivo(String nombreArchivo);
    
    void agregarEmpleado(String nombreArchivo, Persona persona, boolean anexarInformacion);
    
    List<Persona> listarEmpleados(String nombreArchivo);
    
    List<Persona> buscarEmpleado(String nombreArchivo, String buscar);
}
