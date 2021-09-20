package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestTelefono3 {

    public static void main(String[] args) {
        Telefono[] telefonos = new Telefono[3];
        telefonos[0] = new Telefono("movi","524654545",20);
        telefonos[1] = new Telefono("movi","545421245",20);
        telefonos[2] = new Telefono("movi","5465454654",20);
        
        AdminTelefono at = new AdminTelefono();
        System.out.println(at.contarMovi(telefonos));
    }
}
