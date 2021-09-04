package dominio;

public class Persona {
    private String nombre;
    private int sueldo;
    private boolean eliminado;
    
    public Persona(String nombre, int sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
    public String toString(){
        String estadoCuenta = (this.eliminado == true) ? "Activo" : "Inactivo";
        return  "|--------------------|\nDATOS DE LA CUENTA" + 
                "\nNombre: " + this.nombre +
                "\nSueldo: " + this.sueldo + 
                "\nEstado cuenta: " + estadoCuenta;
                
    }
}
