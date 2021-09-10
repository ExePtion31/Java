package com.uninpahu.tallerarchivos.negocio;

public interface IDatosPersona {
    String NOMBRE_RECURSO = "Personas.txt";
    
    void iniciarArchivo();
    
    void agregarEmpleado();
    
    void listarEmpleados();
    
    void buscarEmpleado();
}
