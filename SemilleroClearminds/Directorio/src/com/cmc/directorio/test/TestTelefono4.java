package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestTelefono4 {

    public static void main(String[] args) {
        Telefono[] telefonos = new Telefono[4];
        telefonos[0] = new Telefono("claro", "524654545", 20);
        telefonos[1] = new Telefono("claro", "545421245", 20);
        telefonos[2] = new Telefono("claro", "5465454654", 20);
        telefonos[3] = new Telefono("movi", "512384546", 20);
        
        AdminTelefono at = new AdminTelefono();
        System.out.println(at.contarClaro(telefonos));
    }
}
