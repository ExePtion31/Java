package test;
import biblioteca.*;
import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<Libros> libros = new ArrayList<>();
        libros.add(new Libros(2021, "50 Sombras de Grey", "Gabriel Garcia", "Normal"));
        libros.add(new Libros(2019, "Cinco horas con Mario", "Miguel", "Normal"));
        libros.add(new Libros(2015, "Lolita", "Vladimir Navokov", "Pascal"));
        
        ArrayList<Peliculas> peliculas = new ArrayList<>();
        peliculas.add(new Peliculas(2015, "Rapido y Furioso 9", "Acción", "Disney", "Checo"));
        peliculas.add(new Peliculas(2015, "Rapunsel", "Fantasia", "Disney", "Alemán"));
        peliculas.add(new Peliculas(2015, "SAW", "Terror", "No recuerdo :c", "Ingles"));
        
        ArrayList<Revistas> revistas = new ArrayList<>();
        revistas.add(new Revistas(2017, "Semana", 1522, "Panamericana"));
        revistas.add(new Revistas(2015, "El Tiempo", 1262, "Nacho"));
        revistas.add(new Revistas(2018, "Semana", 2722, "Panamericana"));

        //Acciones del usuario 1
        Usuario usuario1 = new Usuario("Giovanni Baquero");
        usuario1.prestarLibro(libros.get(2), "11-02-2000");
        usuario1.prestarPelicula(peliculas.get(1), "10-10-2021");
        usuario1.prestarPelicula(peliculas.get(2), "11-02-2021");
        usuario1.datosUsuario();
        usuario1.devolucionLibro(libros.get(2));
        usuario1.devolucionPelicula(peliculas.get(1));
        usuario1.datosUsuario();
        
        //Acciones usuario2
        Usuario usuario2 = new Usuario("Giovanni Vargas");
        usuario2.prestarLibro(libros.get(2), "11-02-2000");
        usuario2.datosUsuario();
        
        
        articulosPrestados(libros, peliculas);
        
    }
    
    public static void articulosPrestados(ArrayList<Libros> libros, ArrayList<Peliculas> peliculas){
        System.out.println("\n___________________________________________________"
                + "\n|---LIBROS PRESTADOS---|");
        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).isPrestamo()){
                System.out.println(libros.get(i));
            }
        }
        
        System.out.println("\n|---PELICULAS PRESTADAS---|");
        for (int i = 0; i < peliculas.size(); i++) {
            if(peliculas.get(i).isPrestamo()){
                System.out.println(peliculas.get(i));
            }
        }
    }
}
