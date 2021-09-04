
import java.util.Scanner;

public class tiposDatos {
    public static void main(String args[]){
        //Asignar unicode a tipos int
        int letra1 = 'A';
        int letra2 = 'a';
        int suma = letra1 + letra2;
        System.out.println("suma = " + suma);
        
        //Booleanos
        int edad = 15;
        Boolean mayorEdad = edad >= 18;
        if(mayorEdad){
            System.out.println("Usted es mayor de edad.");
        }else{
            System.out.println("Usted es menor de edad.");
        }
        
        //Tipo Byte 8 bits
        System.out.println("\n|----Tipos Byte----|");
        System.out.println("Valor Maximo: " + Byte.MAX_VALUE);
        System.out.println("Valor Minimo: " + Byte.MIN_VALUE);
        
        //Tipo Short 16 bits
        System.out.println("\n|----Tipos Short----|");
        System.out.println("Valor Maximo: " + Short.MAX_VALUE);
        System.out.println("Valor Minimo: " + Short.MIN_VALUE);
        
        //Tipo Int 32 bits
        System.out.println("\n|----Tipos Integer----|");
        System.out.println("Valor Maximo: " + Integer.MAX_VALUE);
        System.out.println("Valor Minimo: " + Integer.MIN_VALUE);
        
        //Tipo Long 64 bits
        System.out.println("\n|----Tipos Long----|");
        System.out.println("Valor Maximo: " + Long.MAX_VALUE);
        System.out.println("Valor Minimo: " + Long.MIN_VALUE);
        
        //Tipo Float 32 bits
        System.out.println("\n|----Tipos Float----|");
        System.out.println("Valor Maximo: " + Float.MAX_VALUE);
        System.out.println("Valor Minimo: " + Float.MIN_VALUE);
        
        //Tipo Double 64 bits
        System.out.println("\n|----Tipos Double----|");
        System.out.println("Valor Maximo: " + Double.MAX_VALUE);
        System.out.println("Valor Minimo: " + Double.MIN_VALUE);
        
        
        //Caracter x caracter
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        var nombre = consola.nextLine();
        
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println("Letra: " + nombre.charAt(i));
        }
    }
}
