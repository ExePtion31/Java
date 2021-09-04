package palabrathis;
import java.util.Scanner;

public class PalabraThis {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese un nombre:");
        String nombre = datos.nextLine();
        System.out.println("Ingrese un apellido:");
        String apellido = datos.nextLine();
        Persona objeto = new Persona(nombre, apellido);
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        String nCompleto = nombre + " " +apellido;
        new Imprimir().imprimir(nCompleto);
    }
}

class Imprimir{
    String nombre;
    public void imprimir(String nombre){
        this.nombre = nombre;
        System.out.println("Hola " + nombre);
    }
}
