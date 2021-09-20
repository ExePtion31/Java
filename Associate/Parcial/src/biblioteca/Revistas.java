package biblioteca;

public class Revistas extends AlmacenBiblioteca{
    private int numero;
    private String editorial;

    public Revistas(int anio, String titulo, int numero, String editorial) {
        super(anio, titulo);
        this.numero = numero;
        this.editorial = editorial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public String toString() {
        return "\n---REVISTA---"
                + super.toString()
                + "\nAutor: " + this.numero
                + "\nEditorial: " + this.editorial;
    }
}
