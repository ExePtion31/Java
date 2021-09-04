package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica objeto = new Aritmetica();
        objeto.a = 3;
        objeto.b = 5;
        objeto.sumar();
        
        //Constructor con argumentos
        Aritmetica objeto2 = new Aritmetica(5, 6);
        System.out.println("Constructor con Argumentos a: " + objeto2.a);
        System.out.println("Constructor con Argumentos b: " + objeto2.b);
        
        //Retorno de metodo
        int resultado = objeto.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        //Retorno con argumentos
        int resultado2 = objeto.sumaConArgumentos(10, 5);
        System.out.println("resultado2 = " + resultado2);
    }
}
