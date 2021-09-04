package test;
import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 2);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(1.4, 3.7);
        System.out.println("resultado2 = " + resultado2);
    }
}
