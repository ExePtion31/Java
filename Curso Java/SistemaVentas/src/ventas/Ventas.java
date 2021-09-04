package ventas;
import mx.com.gm.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 100.00);
        Producto producto2 = new Producto("Pantalon", 500.00);
        
        Orden orden = new Orden();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
    }
}
