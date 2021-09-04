package test;

public class ArgumentosVariablesTest {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        
        imprimirVarios(1, "Juanito", "Pepito", "Lupita");
        imprimirVarios(2, "Camilo", "Lupita");
    }
    
    public static void imprimirVarios(int numero, String... nombres){
        System.out.println(numero);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
        }
    }
    
    public static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
    }
}
