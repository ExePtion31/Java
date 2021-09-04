package genericos;

public class ClaseGenerica<T> {
    T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + this.objeto.getClass().getSimpleName());
    }
}
