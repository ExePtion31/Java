package reto1;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] data = string.split(" ");
        double masa = Double.parseDouble(data[0]);
        double altura = Double.parseDouble(data[1]);
        int edad = Integer.parseInt(data[2]);
        double imc = 0;
        
        if(masa < 0 || masa > 150){
            System.out.println("ERROR");
        }else if(altura < 0.1 || altura > 2.5){
            System.out.println("ERROR");
        }else if(edad < 0 || edad > 110){
            System.out.println("ERROR");
        }else{
            imc = masa / (altura*altura);
            imc = Math.round(imc*1000.0)/1000.0;
            
            if(imc < 22 && edad < 45){
                System.out.println(imc + " BAJO");
            }else if(imc < 22 && edad >= 45){
                System.out.println(imc + " MODERADO");
            }else if(imc >= 22 && edad < 45){
                System.out.println(imc + " MODERADO");
            }else if(imc >= 22 && edad >= 45){
                System.out.println(imc + " ALTO");
            }
        }
    }
}
