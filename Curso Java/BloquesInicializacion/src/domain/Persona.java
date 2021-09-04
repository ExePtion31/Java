package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        System.out.println("Ejecución bloque estatico.");
        ++Persona.contadorPersonas;
    }
    
    {
        System.out.println("Ejecución bloque no estatico.");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecución del constructor.");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
