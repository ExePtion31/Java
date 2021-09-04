package test;
import enumeracion.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 7: " +Dias.DOMINGO);
//        indicarDiaDeLaSemana(Dias.LUNES);

        System.out.println("Continente #4: " + Continentes.AMERICA);
        System.out.println("Paises en continente #4: " + Continentes.AMERICA.getPaises());
        System.out.println("Paises en continente #4: " + Continentes.AMERICA.getPoblacion());
        
        System.out.println("Continente #1: " + Continentes.AFRICA);
        System.out.println("Paises en continente #4: " + Continentes.AFRICA.getPaises());
        System.out.println("Paises en continente #4: " + Continentes.AFRICA.getPoblacion());
    }
    
    private static void indicarDiaDeLaSemana(Dias dias){
       switch(dias){
           case LUNES:
               System.out.println("Primer día de la semana.");
               break;
           case MARTES:
               System.out.println("Segundo día de la semana.");
       }    
    }
}
