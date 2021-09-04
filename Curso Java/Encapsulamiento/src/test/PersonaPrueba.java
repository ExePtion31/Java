package test;
import dominio.Persona;
import java.util.Scanner;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        while(true){
            Scanner datos = new Scanner(System.in);
            System.out.println("Ingrese su nombre: ");
            String nombre = datos.nextLine();
            System.out.println("Ingrese su sueldo: ");
            int sueldo = Integer.parseInt(datos.nextLine());
            
            estadoCuenta(nombre, sueldo);
            System.out.println("¿Desea continuar?");
            String respuesta = datos.nextLine();
            if(respuesta.toUpperCase().equals("NO")){
                break;
            }
        }
    }
    
    public static void estadoCuenta(String nombre, int sueldo){
        Persona objeto = new Persona(nombre, sueldo, false);
        System.out.println(objeto);
    }
}
