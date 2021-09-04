package test;
import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        
        //Guarda orden y se pueden duplicar elementos
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        
        //No guarda orden y no se pueden duplicar elementos
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        
        Map miMap = new HashMap();
        miMap.put(1, "Carne");
        miMap.put(2, "Pollo");
        miMap.put(3, "Costillas");
        miMap.put(4, "Salchica");
        
        imprimir(miMap.keySet());
        imprimir(miMap.values());
    }
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach(objeto ->{
            System.out.println(objeto);
        });
    }
   
}
