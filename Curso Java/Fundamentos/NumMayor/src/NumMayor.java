import java.util.Scanner;

public class NumMayor {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporcionar el numero 1:");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporcionar el numero 2:");
        var num2 = Integer.parseInt(consola.nextLine());
        var numMayor = (num1 > num2) ? "El numero mayor es: " + num1 : "El numero mayor es: " + num2;
        System.out.println(numMayor);
        
    }
}
