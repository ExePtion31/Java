package test;

import accesodatos.*;

public class TestInterface {
    public static void main(String[] args) {
        IAccesoDatos acceso = new ImplementacionMySql();
        imprimir(acceso);
        
        acceso = new ImplementacionOracle();
        imprimir(acceso);
    }
    
    public static void imprimir(IAccesoDatos acceso){
        acceso.insertar();
    }
}
