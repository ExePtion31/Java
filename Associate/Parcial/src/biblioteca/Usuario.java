package biblioteca;
import java.util.ArrayList;

public class Usuario{
    private final int codigo;
    private String nombre;
    private static int contadorEstudiantes;
    private ArrayList<Libros> prestamoLibros = new ArrayList<>();
    private ArrayList<Peliculas> prestamoPeliculas = new ArrayList<>();
    
    //Constructors
    public Usuario() {
        this.codigo = ++Usuario.contadorEstudiantes;
    }

    public Usuario(String nombre) {
        this();
        this.nombre = nombre;
    } 

    
    //Methods
    public void prestarLibro(Libros libro, String fechaPrestamo){
        libro.setPrestamo(true);
        libro.setFechaPrestamo(fechaPrestamo);
        this.prestamoLibros.add(libro);
    }
    
    public void devolucionLibro(Libros libro){
        for (int i = 0; i < this.prestamoLibros.size(); i++) {
            if(this.prestamoLibros.get(i).getCodigo() == libro.getCodigo()){
                this.prestamoLibros.get(i).setPrestamo(false);
                this.prestamoLibros.remove(i);
            }
        }
    }
    
    public void prestarPelicula(Peliculas pelicula, String fechaPrestamo){
        pelicula.setPrestamo(true);
        pelicula.setFechaPrestamo(fechaPrestamo);
        this.prestamoPeliculas.add(pelicula);
    }
    
    public void devolucionPelicula(Peliculas pelicula){
        for (int i = 0; i < this.prestamoPeliculas.size(); i++) {
            if(this.prestamoPeliculas.get(i).getCodigo() == pelicula.getCodigo()){
                this.prestamoPeliculas.get(i).setPrestamo(false);
                this.prestamoPeliculas.remove(i);
            }
        }
    }
    
    public void datosUsuario(){
        System.out.println("___________________________________________________\n"
                + "\n||---USUARIO---||"
                + "\nCódigo: " + this.codigo
                + "\nNombre: " + this.nombre);
        if(this.prestamoLibros.size() > 0){
            System.out.println("\n||---LIBROS PRESTADOS---||");
            for (int i = 0; i < this.prestamoLibros.size(); i++) {
                System.out.println(this.prestamoLibros.get(i));
            }
        }else{
            System.out.println("\n---ALERTA---"
                    + "\nEl usuario no ha solicitado prestamos de Libros.");
        }
        
        if(this.prestamoPeliculas.size() > 0){
            System.out.println("\n||---PELICULAS PRESTADOS---||");
            for (int i = 0; i < this.prestamoPeliculas.size(); i++) {
                System.out.println(this.prestamoPeliculas.get(i));
            }
        }else{
            System.out.println("\n---ALERTA---"
                    + "\nEl usuario no ha solicitado prestamos de Peliculas.");
        }
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
