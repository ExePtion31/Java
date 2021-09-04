package cpjlaboratoriofinal;
import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImp;

public class CPJLaboratorioFinal {
    public static void main(String[] args) {
        int opcion;
        String nombreArchivo;
        Scanner sc = new Scanner(System.in);
        CatalogoPeliculasImp catalogoPeliculas; 
        
        while(true){
            System.out.println("Elige una opcion:"
                    + "\n1.-Iniciar catalogo de peliculas."
                    + "\n2.-Agregar pelicula."
                    + "\n3.-Listar peliculas."
                    + "\n4-Buscar pelicula."
                    + "\n0.-Salir.");
            opcion = Integer.parseInt(sc.nextLine());
            if (opcion == 1) {
                
            }else if(opcion == 2){
                
            }else if(opcion == 3){
                
            }else if(opcion == 4){
            
            }else{
                break;
            }
        }
    }
}
