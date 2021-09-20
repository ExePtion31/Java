package tallerassociate;

public class Programador extends Empleado{
    private int lineadDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador() {
    }

    public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineadDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, cedula, edad, casado, salario);
        this.lineadDeCodigoPorHora = lineadDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    } 
    
    @Override
    public String toString() {
        clasificacion(edad);
        String estadoCasado = (casado) ? "Casado" : "Soltero";
        return "\n---------DATOS DEL EMPLEADO-----------" 
                +"\nNombre: " + nombre + "\nCedula: " + cedula + "\nEdad: " + edad 
                + "\nCasado: " + estadoCasado + "\nSalario: " + salario 
                + "\nClasificación: " + clasificacion(edad)
                + "\nNúmero de lineas por hora: " + this.lineadDeCodigoPorHora
                + "\nLenguaje Dominante: " + this.lenguajeDominante;        
    }
}
