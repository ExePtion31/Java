package biblioteca;

public class Peliculas extends AlmacenBiblioteca{
    private String tema;
    private String productora;
    private String idioma;
    private String fechaPrestamo;
    private boolean prestamo = false;

    public Peliculas(int anio, String titulo, String tema, String productora, String idioma) {
        super(anio, titulo);
        this.tema = tema;
        this.productora = productora;
        this.idioma = idioma;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString() {
        String convertPrestamo = (this.prestamo) ? "Prestado" : "No prestado"; 
        String prestamo = (this.fechaPrestamo == null) ? "Aún no se ha prestado" : this.fechaPrestamo;
        return "\n---PELICULA---"
                + super.toString()
                + "\nTema: " + this.tema
                + "\nProductora: " + this.productora
                + "\nIdioma: " + this.idioma
                + "\nPrestamo: " + convertPrestamo
                + "\nFecha de prestamo: " + prestamo;
    }
    
    
}
