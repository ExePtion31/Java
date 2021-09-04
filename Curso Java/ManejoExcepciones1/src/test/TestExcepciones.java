package test;
import aritmetica.Aritmetica;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        try{
            resultado = Aritmetica.division(10, 0);
        }catch(Exception e){
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se revisó la división.");
        }
        System.out.println("Resultado: " + resultado);
    }
}
