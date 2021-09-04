package domain;

public class Persona{
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //Constructors
    public Persona(){
        
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    
    //Getters and Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre: ").append(getNombre());
        sb.append(", Genero:").append(getGenero());
        sb.append(", Edad:").append(getEdad());
        sb.append(", Direccion:").append(getDireccion());
        return sb.toString();
    }
}
