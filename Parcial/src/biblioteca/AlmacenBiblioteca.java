package biblioteca;

public class AlmacenBiblioteca {
   private int anio;
   private String titulo;
   private final int codigo;
   private static int contadorArticulos = 0;

    public AlmacenBiblioteca() { 
        this.codigo = ++AlmacenBiblioteca.contadorArticulos;
    }

   
    public AlmacenBiblioteca(int anio, String titulo) {
        this();
        this.anio = anio;
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int año) {
        this.anio = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "\nCódigo: " + this.codigo
                + "\nTitulo: " + this.titulo
                + "\nAño: " + this.anio;
    }
   
   
}
