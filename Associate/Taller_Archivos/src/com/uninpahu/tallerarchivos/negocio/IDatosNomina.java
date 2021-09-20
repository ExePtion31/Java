package com.uninpahu.tallerarchivos.negocio;

public interface IDatosNomina {
    public static final String NOMBRE_ARCHIVO = "liquidacionNomina.txt";
    
    void iniciarArchivo();
    
    void liquidarNomina();
    
    void buscarNominas();
}
