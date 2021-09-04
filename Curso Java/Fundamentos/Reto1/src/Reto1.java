import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nombre = scanner.nextLine();
        int edad = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Hola " + nombre + " tienes " + edad + " años");
    }
}
