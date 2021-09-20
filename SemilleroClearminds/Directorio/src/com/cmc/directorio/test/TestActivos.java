package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestActivos {
    public static void main(String[] args) {
        Telefono telf1 = new Telefono("movi", "654654540", 20);
        Contacto contacto = new Contacto("Giovanni", "Baquero", telf1, 52.3);
        AdminContactos c = new AdminContactos();
        telf1.setTieneWhatsapp(true);
        c.ActivarUsuario(contacto);
        System.out.println(contacto);
    }
}
