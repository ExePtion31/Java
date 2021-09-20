package biblioteca;

public class Libros extends AlmacenBiblioteca{
    private String autor;
    private String editorial;
    private String fechaPrestamo;
    private boolean prestamo = false;

    public Libros(int anio, String Titulo, String autor, String editorial) {
        super(anio, Titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
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
        return "\n---LIBRO---"
                + super.toString()
                + "\nAutor: " + this.autor
                + "\nEditorial: " + this.editorial
                + "\nPrestamo: " + convertPrestamo
                + "\nFecha de prestamo: " + prestamo;
    }
}
