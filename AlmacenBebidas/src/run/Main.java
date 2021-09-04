package run;
import com.herencia.almacen.*;
import java.util.Scanner;

public class Main {
    public static int contadorbebidasAzucar = 0;
    public static int contadorbebidasAgua = 0;
    public static Almacen almacen = new Almacen();
    public static BebidaAzucarada bebidasAzucar[] = new BebidaAzucarada[10];
    public static BebidaAgua bebidasAgua[] = new BebidaAgua[10];
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---BIENVENIDO---"
                            + "\nSolo puede crear 10 bebidas de cada tipo"
                            + "\nCantidad de bebidas Azucaradas: " + almacen.getContadorBebidasAzucar()
                            + "\nCantidad de bebidas Agua: " + almacen.getContadorBebidasAgua() + "\n"
                            + "\nSeleccione una opción: "
                            + "\n1. Agregar una bebida."
                            + "\n2. Eliminar una bebida."
                            + "\n3. Mostrar información de las bebidas."
                            + "\n4. Precio total de las bebidas."
                            + "\n5. Precio total de una marca"
                            + "\n6. Salir.");
            int respuesta = Integer.parseInt(sc.nextLine());
            
            if(respuesta == 1){
                System.out.println("---CANTIDAD DE BEBIDAS---");
                int nbebidas = Integer.parseInt(sc.nextLine());
                System.out.println("---TIPO DE BEBIDA---"
                                    + "\n1. Bebida Azucarada."
                                    + "\n2. Agua.");
                int respuesta2 = Integer.parseInt(sc.nextLine());
                
                if(respuesta2 == 1){
                    for (int i = 0; i < nbebidas; i++) {
                        System.out.println("\n------NUEVA BEBIDA------"
                                            + "\nMarca:");
                        String marca = sc.nextLine();
                        System.out.println("Cantidad de Litros:");
                        double cLitros = Double.parseDouble(sc.nextLine());
                        System.out.println("Precio:");
                        double precio = Double.parseDouble(sc.nextLine());
                        System.out.println("Promoción: (true/false)");
                        boolean promocion = Boolean.parseBoolean(sc.nextLine());
                        System.out.println("Porcentaje de Azucar:");
                        double pAzucar = Double.parseDouble(sc.nextLine());
                        guardarBebidasAzucar(marca, cLitros, precio, promocion, pAzucar, nbebidas);
                    }
                }else{
                    for (int i = 0; i < nbebidas; i++) {
                        System.out.println("\n------NUEVA BEBIDA------"
                                            + "\nMarca:");
                        String marca = sc.nextLine();
                        System.out.println("Cantidad de Litros:");
                        double cLitros = Double.parseDouble(sc.nextLine());
                        System.out.println("Precio:");
                        double precio = Double.parseDouble(sc.nextLine());
                        System.out.println("Promoción: (true/false)");
                        boolean promocion = Boolean.parseBoolean(sc.nextLine());
                        System.out.println("Origen de la bebida: ");
                        String oBebida = sc.nextLine();
                        guardarBebidasAgua(marca, cLitros, precio, promocion, oBebida, nbebidas);
                    }
                }
            }else if(respuesta == 2){
                System.out.println("---INGRESE ID BEBIDA---");
                int idBebida = Integer.parseInt(sc.nextLine());
                almacen.eliminarBebida(idBebida);
            }else if(respuesta == 3){
                almacen.mostrarOrden();
            }else if(respuesta == 4){
                almacen.precioTotalBebidas();
            }else if(respuesta == 5){
                System.out.println("---INGRESE MARCA BEBIDA---");
                String marca = sc.nextLine();
                almacen.precioMarca(marca);
            }else{
                break;
            }          
        } 
    }
    
    public static void guardarBebidasAzucar(String marca, double cLitros, double precio, boolean promocion, double pAzucar, int nbebidas){
        if(Main.contadorbebidasAzucar < 10){
            bebidasAzucar[Main.contadorbebidasAzucar] = new BebidaAzucarada(marca, cLitros, precio, promocion, pAzucar);
            almacen.agregarBebidaAzucar(bebidasAzucar[Main.contadorbebidasAzucar]);
            Main.contadorbebidasAzucar++;
        }else{
            System.out.println("El limite de bebidas azucaradas es 10."
                                + "\nBebidas azucaradas creadas: " + Main.contadorbebidasAzucar);
        }

    }
    
    public static void guardarBebidasAgua(String marca, double cLitros, double precio, boolean promocion, String oBebida, int nbebidas){
        if(Main.contadorbebidasAgua < 10){
            bebidasAgua[Main.contadorbebidasAgua] = new BebidaAgua(marca, cLitros, precio, promocion, oBebida);
            almacen.agregarBebidaAgua(bebidasAgua[Main.contadorbebidasAgua]);
            Main.contadorbebidasAgua++; 
        }else{
            System.out.println("El limite de bebidas azucaradas es 10."
                                + "\nBebidas azucaradas creadas: " + Main.contadorbebidasAgua);
        }

    }
}
