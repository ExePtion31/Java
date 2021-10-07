package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;
import javax.naming.NamingException;

public class TestHolaMundoEjb {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundo = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundo.sumar(5, 10);
            System.out.println("resultado: " + resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
