package com.uninpahu.tallerarchivos.negocio;

public interface IDatosPersona {
    public static final String NOMBRE_RECURSO = "Personas.txt";
    
    void iniciarArchivo();
    
    void agregarEmpleado();
    
    void listarEmpleados();
    
    void buscarEmpleado();
}
