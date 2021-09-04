package Operaciones;

public class Aritmetica {
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica(){
        System.out.println("Esto es un constructor");
    }
    
    //Constructor con argumentos
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Usando constructor con Argumentos");
    }
    
    public void sumar(){
        int suma = a + b;
        System.out.println("suma: " + suma);
    }
    
    public int sumarConRetorno(){
        int suma = a + b;
        return suma;
    }  
    
    public int sumaConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        
        int suma = this.a + this.b;
        return suma;
    }
}
