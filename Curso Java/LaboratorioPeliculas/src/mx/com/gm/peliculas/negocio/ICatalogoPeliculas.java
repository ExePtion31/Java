package mx.com.gm.peliculas.negocio;

public interface ICatalogoPeliculas {

    String NOMBRE_RECURSO = "Peliculas.txt";

    void agregarPelicula(String pelicula);

    void listarPeliculas();

    void buscarPelicula(String buscar);

    void iniciarArchivo();
}
