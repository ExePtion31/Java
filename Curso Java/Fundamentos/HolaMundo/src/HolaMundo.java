import java.util.Scanner;

//Clase HolaMundo
public class HolaMundo {
    public static void main(String args[]){
        //Print en consola
        System.out.println("Hola Mundo");
        
        //Variables Int
        int miVariableInt = 10;
        System.out.println("Variable Entera: " + miVariableInt);
        
        //Variables String
        String miVariableString = "Hola";
        System.out.println("Variable String: " + miVariableString);
        
        //Var - Inferencia de tipos en Java
        var miVaribaleVar = 15;
        System.out.println("Inferencia: " + miVaribaleVar);
        
        //Concatenacion
        var usuario = "Pedro";
        var titulo = "Ingeniero";
        var union = usuario + " " + titulo;
        
        System.out.println("Union: " + union);
        
        var i = 9;
        var j = 8;
        System.out.println(i + j + " " + union);
        
        //Caracteres especiales
        System.out.println("Nueva linea: \n" + union);
        System.out.println("Tabulador: \t" + union);
        System.out.println("Retroceso: \b" + union);
        System.out.println("Comillas simples: \'" + union + "\'");
        System.out.println("Comillas dobles: \"" + union + "\"");
        
        //Scanner
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        System.out.println("nombre: " + nombre);
        
        //Ej Scanner
        System.out.println("Proporciona el titulo: ");
        var tituloLibro = consola.nextLine();
        System.out.println("Proporciona el autor: ");
        var autorLibro = consola.nextLine();
        System.out.println(tituloLibro + " Fue escrito por " + autorLibro);           
    }
}
