package com.uninpahu.tallerarchivos.datos;

import com.uninpahu.tallerarchivos.NominaBuscadores;
import com.uninpahu.tallerarchivos.entity.Nomina;
import com.uninpahu.tallerarchivos.entity.Persona;
import java.util.List;

public interface IAccesoNomina {

    boolean existeArchivo(String nombreArchivo);

    void crearArchivo(String nombreArchivo);

    void liquidarNomina(String nombreArchivo, boolean anexar, List<Long> empleadosBuscar, List<Persona> empleados);

    void liquidarNominaAll(String nombreArchivo, boolean anexar, List<Persona> empleados);

    List<Nomina> listarNominas(String nombreArchivo);
    
    List<Nomina> listarNominasBuscador(String nombreArchivo, boolean opcion);
    
    List<Nomina> listarNominasBuscador(String nombreArchivo, double valor1, double valor2);
    
    List<Nomina> listarNominasBuscador(String nombreArchivo, long nIdentificacion);
}
