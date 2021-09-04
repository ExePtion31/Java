package test;
import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        
        //Guarda orden y se pueden duplicar elementos
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //String fecha = miLista.get(0);
        //System.out.println(fecha);
        //imprimir(miLista);
        
        //No guarda orden y no se pueden duplicar elementos
        Set<Integer> miSet = new HashSet<>();
        miSet.add(1);
        miSet.add(2);
        miSet.add(3);
        miSet.add(4);
        miSet.add(5);
        miSet.add(6);
        miSet.add(7);
        //imprimir(miSet);
        
        
        Map<Integer, String> miMap = new HashMap<>();
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
