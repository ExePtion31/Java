package pasoporreferencia;
import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juanita";
        persona1.apellido = "La guerfanita";
        persona1.desplegarInformacion();
        persona1 = cambiarNombre(persona1);
        persona1.desplegarInformacion();
    }
    
    
    //retornar objeto junto a sus valores.
    public static Persona cambiarNombre(Persona persona){
        persona.nombre = "Armando";
        persona.apellido = "Casas";
        return persona;
    }
}
