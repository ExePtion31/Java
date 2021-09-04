package mundopc;
import com.gm.mundopc.*;
import java.util.Scanner;

public class mundoPC {
    public static void main(String[] args) {
       
    Monitor monitorHP = new Monitor("HP", 13);
    Teclado tecladoHP = new Teclado("Bluethoot", "HP");
    Raton ratonHP = new Raton("Bluethoot", "HP");
    Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
      
    Orden orden1 = new Orden();
    orden1.agregarComputadora(computadoraHP);
    orden1.mostrarOrden();
    }
}
