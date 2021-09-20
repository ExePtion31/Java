package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestContacto1 {
    public static void main(String[] args) {
        Telefono telf = new Telefono("movi", "09941234123", 10);
        Contacto c = new Contacto("Giovanni", "Baquero", telf, 3.5);
        System.out.println(c);
    }
}
