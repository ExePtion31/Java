package mx.com.gm.peliculas.negocio;

public interface ICatalogoPeliculas {
    void agregarPelicula(String nombreArchivo, String pelicula);
    
    void listarPeliculas(String nombreArchivo);
    
    void buscarPelicula(String nombreArchivo, String buscar);
    
    void iniciarArchivo(String nombreArchivo);
}
