package ProyectoCaja;

public class Caja {
    int ancho, alto, profundo;

    public Caja() {
        System.out.println("Constructor Vacio.");
    }
    
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        
        int volumen = volumen(this.ancho, this.alto, this.profundo);
        System.out.println("volumen = " + volumen);
    }
    
    public int volumen(int ancho, int alto, int profundo){
        int volumen = ancho * alto * profundo;
        return volumen;
    }
}
