package test;
import java.util.Scanner;
import persona.Persona;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su usuario");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su usuario");
        String nombre2 = sc.nextLine();
        imprimir(nombre, nombre2);
        
    }
    
    public static void imprimir(String nombre1, String nombre2){
        Persona persona1 = new Persona(nombre1);
        Persona persona2 = new Persona(nombre2);
    }
}
