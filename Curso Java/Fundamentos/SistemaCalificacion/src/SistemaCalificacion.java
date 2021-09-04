import java.util.Scanner;

public class SistemaCalificacion {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        var nota = Integer.parseInt(consola.nextLine());
        
        switch(nota){
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println("F");
                break;
        }
    }
}
