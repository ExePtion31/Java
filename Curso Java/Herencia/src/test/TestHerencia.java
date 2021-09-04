package test;
import domain.Cliente;
import domain.Empleado;
import java.util.Date;
import java.util.Scanner;

public class TestHerencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su genero: ");
        String genero = sc.nextLine();
        char genero1 = genero.charAt(0);
        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese su direccion: ");
        String direccion = sc.nextLine();
        
        Cliente cliente1 = new Cliente(nombre, genero1 ,edad, direccion, new Date(), true);
        System.out.println(cliente1);
    }
}
