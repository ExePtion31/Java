package tallerassociate;

public class Empleado {
    protected String nombre;
    protected String cedula; 
    protected int edad;
    protected boolean casado;
    protected double salario;

    
    //Contructors
    public Empleado() {
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public String clasificacion(int edad){
        String clasificacion = "";
        if(edad <= 21){
            clasificacion = "Principiante";
        }else if(edad >= 21 && edad <= 35){
            clasificacion = "intermedio";
        }else{
            clasificacion = "Senior";
        }
        
        return clasificacion;
    }
    
    public void aumentoSalarial(double aumento){
        this.salario += (aumento * this.salario)/100; 
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        clasificacion(edad);
        String estadoCasado = (casado) ? "Casado" : "Soltero";
        return "\n---------DATOS DEL EMPLEADO-----------" 
                +"\nNombre: " + nombre + "\nCedula: " + cedula + "\nEdad: " + edad 
                + "\nCasado: " + estadoCasado + "\nSalario: " + salario 
                + "\nClasificación: " + clasificacion(edad);        
    }
}
