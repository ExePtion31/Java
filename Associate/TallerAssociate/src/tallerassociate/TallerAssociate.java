package tallerassociate;
import java.util.Scanner;

public class TallerAssociate {
    public static String nombre;
    public static String cedula;
    public static int edad;
    public static boolean casado;
    public static double salario;
    
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("-------BIENVENIDO--------"
                           + "\n¿Usted es programador o empleado?"
                           + "\n1.Programador"
                           + "\n2.Empleado");
        
        int resp1 = Integer.parseInt(sc.nextLine());
        if(resp1 == 1){
            capturarData();
            System.out.println("Lineas de codigo por hora:");
            int lineascod = Integer.parseInt(sc.nextLine());
            System.out.println("Lenguaje que domina:");
            String lenguajeD = sc.nextLine();
            Programador programador = new Programador(nombre, cedula, edad, casado, salario, lineascod, lenguajeD);
            menuUserProg(programador);
        }else{
            capturarData();
            Empleado empleado = new Empleado(nombre, cedula, edad, casado, salario);
            menuUserEmp(empleado);
        } 
    }
    
    public static void capturarData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------BIENVENIDO-------" 
                            + "\nPOR FAVOR, INGRESE SUS DATOS" 
                            + "\nIngrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese su cedula:");
        cedula = sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("¿Usted es casado? (true/false):");
        casado = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Ingrese su salario:");
        salario = Double.parseDouble(sc.nextLine());
    }
    
    public static void menuUserProg(Programador programador){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("\n------MENÚ PRINCIPAL------" 
                + "\n1. Ver datos del empleado. "
                + "\n2. Aumentar salario."
                + "\n3. Salir.");

        int resp = Integer.parseInt(sc.nextLine());

        if(resp == 1){
            System.out.println(programador);
        }else if(resp == 2){
            System.out.println("Ingrese el porcentaje que desea aumentar: ");
            double aumento = Double.parseDouble(sc.nextLine());
            programador.aumentoSalarial(aumento);
        }else if(resp == 3){
            break;
            }    
        } 
    }
    
    public static void menuUserEmp(Empleado empleado){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("\n------MENÚ PRINCIPAL------" 
                + "\n1. Ver datos del empleado. "
                + "\n2. Aumentar salario."
                + "\n3. Salir.");

        int resp = Integer.parseInt(sc.nextLine());

        if(resp == 1){
            System.out.println(empleado);
        }else if(resp == 2){
            System.out.println("Ingrese el porcentaje que desea aumentar: ");
            double aumento = Double.parseDouble(sc.nextLine());
            empleado.aumentoSalarial(aumento);
        }else if(resp == 3){
            break;
            }    
        } 
    }
}
