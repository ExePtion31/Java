package com.cm.colecciones;

import com.cm.entidades.Contacto;
import java.util.*;

public class DirectorioLista extends Directorio {

    private List<Contacto> contactos = new ArrayList<>();

    @Override
    public void agregarContacto(Contacto contactoNuevo) {
        int contador = 0;

        for (Contacto contacto : contactos) {
            if (contacto.getCedula().equals(contactoNuevo.getCedula())) {
                System.out.println("El contacto ya existe");
            } else {
                contador++;
            }
        }

        if (contador == contactos.size()) {
            contactos.add(contactoNuevo);
        }
    }

    @Override
    public Contacto buscarContacto(String cedula) {
        System.out.println("\n|---CONTACTOS ENCONTRADO---|");
        for (Contacto contacto : this.contactos) {
            if (contacto.getCedula().equals(cedula)) {
                return contacto;
            }
        }

        return null;
    }

    @Override
    public Contacto eliminarContacto(String cedula) {
        System.out.println("\n|---CONTACTO ELIMINADO---|");
        for (Contacto contacto : this.contactos) {
            if (contacto.getCedula().equals(cedula)) {
                contactos.remove(contacto);
                return contacto;
            }
        }

        return null;
    }

    public void imprimir() {
        System.out.println("\n|---CONTACTOS GUARDADOS---|");
        contactos.forEach(contacto -> {
            System.out.println(contacto);
        });
    }
}
