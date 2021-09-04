package condicionales;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double numero = Double.parseDouble(sc.nextLine());
        cualitativo(numero);  
    }
    
    
    
    public static void cualitativo(double numero){
        if(numero >=4.0 && numero <=5.0){
            System.out.println("Promedio: Excelente");
        }else if(numero >=3.0 && numero <=3.9){
            System.out.println("Promedio: Aceptable");
        }else if(numero >=2.0 && numero <=2.9){
            System.out.println("Promedio: Regular");
        }else{
            System.out.println("Promedio: Deficiente");
        }
    }
}
