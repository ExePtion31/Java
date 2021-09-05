package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImp();

        while (true) {
            System.out.println("Elige una opcion:"
                    + "\n1.-Iniciar catalogo de peliculas."
                    + "\n2.-Agregar pelicula."
                    + "\n3.-Listar peliculas."
                    + "\n4-Buscar pelicula."
                    + "\n0.-Salir.");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    catalogo.iniciarArchivo();
                    break;
                case 2:
                    System.out.println("Escriba el nombre de la pelicula:");
                    String nombrePelicula = sc.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Nombre de la pelicula a buscar");
                    String buscar = sc.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }
}
