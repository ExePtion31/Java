import java.util.Scanner;

public class TiendaLibros {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        
        //Entradas
        System.out.println("Proporciona el nombre:");
        var nombreLibro = consola.nextLine();
        System.out.println("Proporciona el id:");
        var idLibro = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio:");
        var precioLibro = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        var envioLibro = consola.nextLine();
        
        //Salidas
        System.out.println(nombreLibro + " #" + idLibro);
        System.out.println("Precio: $" + precioLibro);
        System.out.println("Envio gratuito: " + envioLibro);
    }
}
