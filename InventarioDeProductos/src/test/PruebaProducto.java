package test;
import java.util.Scanner;
import java.util.ArrayList;
import producto.Producto;

public class PruebaProducto {
    public static ArrayList<Producto> productosList = new ArrayList<>();
    public static Producto productos[] = new Producto[20];
    public static int contadorProductos = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("******"
                    + "\nMENU"
                    + "\n******"
                    + "\n1. Agregar un producto."
                    + "\n2. Listar todos los productos."
                    + "\n3. Buscar un producto por su código de barras."
                    + "\n4. Promedio de los precios de los productos."
                    + "\n5. Salir.");
            int respuesta = Integer.parseInt(sc.nextLine());
            if (respuesta == 1) {
                System.out.println("Ingrese el código del producto:");
                long codProducto = Long.parseLong(sc.nextLine());
                System.out.println("Ingrese el nombre del producto:");
                String nameProducto = sc.nextLine();
                System.out.println("Ingrese la cantidad del producto:");
                int cantProducto = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese el precio del producto:");
                int precioProducto = Integer.parseInt(sc.nextLine());
                agregarProducto(codProducto, nameProducto, cantProducto, precioProducto);
            }else if(respuesta == 2){
                listarProductos();
            }else if(respuesta == 3){
                System.out.println("Ingrese el código del producto: ");
                long codigo = Long.parseLong(sc.nextLine());
                buscarProducto(codigo);
            }else if(respuesta == 4){
                promedioProductos();
            }else if(respuesta == 5){
                break;
            }else{
                System.out.println("-----ERROR-----"
                        + "\nIngrese un número valido.\n");
            }
        }
    }
    
    public static void agregarProducto(long codigoProducto, String nombre, int cantidad, int precio){
        boolean error = false;
        for (int i = 0; i < productosList.size(); i++) {
            if (codigoProducto == productosList.get(i).getCodigoProducto() ) {
                System.out.println("-----ERROR-----"
                        + "\nEse código ya se encuentra registrado.\n");
                error = true;
            }
        }       
        if(!error){
            if (PruebaProducto.contadorProductos < 20) {
                productos[PruebaProducto.contadorProductos] = new Producto(codigoProducto, nombre, cantidad, precio);
                productosList.add(productos[PruebaProducto.contadorProductos]);
            }else{
                System.out.println("El limite de productos es 20."
                                + "\nProductos creados: " + PruebaProducto.contadorProductos);
            }
        }
    }
    
    public static void listarProductos(){
        int listado = 1;
        int cantidad = 0;
        System.out.println("\n-----LISTADO #" + listado + "-----");
        for (int i = cantidad; i < productosList.size(); i++) {
            System.out.println(productosList.get(i));
            cantidad++;
            if(cantidad % 5 == 0){
                listado++;
                System.out.println("\n-----LISTADO #" + listado + "-----");
            }
        }
    }
    
    public static void buscarProducto(long codigoProducto){
        for (int i = 0; i < productosList.size(); i++) {
            if (codigoProducto == productosList.get(i).getCodigoProducto() ) {
                System.out.println(productosList.get(i));
            }
        }  
    }
    
    public static void promedioProductos(){
        double totalPrecios = 0;
        for (int i = 0; i < productosList.size(); i++) {
            totalPrecios += productosList.get(i).getPrecio();
        }
        
        totalPrecios /= productosList.size();
        System.out.println("-----PROMEDIO-----"
                + "\n$" + totalPrecios);
    }
}
