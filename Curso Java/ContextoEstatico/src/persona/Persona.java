package persona;

public class Persona {
    
    public String nombre;
    public static int sumatoria;
    
    public Persona(String nombre){
        this.nombre = nombre;
        Persona.sumatoria++;
        System.out.println("Nombre: " + nombre + "\nID: " + sumatoria);
    } 
}
