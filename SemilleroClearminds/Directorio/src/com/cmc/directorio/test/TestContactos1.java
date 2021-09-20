package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestContactos1 {
    public static void main(String[] args) {
        Telefono telf1 = new Telefono("movi", "654654540", 20);
        Telefono telf2 = new Telefono("claro", "54658844", 10);
        
        Contacto[] contactos = new Contacto[2];
        contactos[0] = new Contacto("Giovanni", "Baquero", telf1, 52.3);
        contactos[1] = new Contacto("Andrez", "Lozano", telf2, 57.3);
        
        AdminContactos adm = new AdminContactos();
        
        System.out.println(adm.buscarMasPesado(contactos));
        System.out.println("Operadores iguales: " + adm.compararOperadoras(contactos));
    }
}
