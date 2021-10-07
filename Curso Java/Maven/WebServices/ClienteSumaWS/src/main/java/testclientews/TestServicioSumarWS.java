package testclientews;

import clientews.servicio.*;

public class TestServicioSumarWS {
    public static void main(String[] args) {
        ServicioSumarWS servicioSumar = new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutando servicio.");
        
        System.out.println("Resultado de la suma: " + servicioSumar.sumar(5, 7));
    }
}
