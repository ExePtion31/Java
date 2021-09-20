package com.cm.colecciones;

import com.cm.entidades.Contacto;
import java.util.*;

public class DirectorioMapa extends Directorio {

    private Map<String, Contacto> contactos = new HashMap<>();

    @Override
    public void agregarContacto(Contacto contactoAgregar) {
        int contador = 0;

        for (Contacto contacto : contactos.values()) {
            if (contacto.equals(contacto.getCedula())) {
                System.out.println("El contacto ya existe");
            } else {
                contador++;
            }
        }

        if (contador == contactos.size()) {
            contactos.put(contactoAgregar.getCedula(), contactoAgregar);
        }
    }

    @Override
    public Contacto eliminarContacto(String cedula) {
        System.out.println("\n|---CONTACTO ELIMINADO---|");
        for (String key : contactos.keySet()) {
            if (key.equals(cedula)) {
                Contacto contactoEliminado = contactos.get(key);
                contactos.remove(cedula);
                return contactoEliminado;
            }
        }

        return null;
    }

    @Override
    public Contacto buscarContacto(String cedula) {
        System.out.println("\n|---CONTACTO ENCONTRADO---|");
        for (String key : contactos.keySet()) {
            if (key.equals(cedula)) {
                return contactos.get(key);
            }
        }

        return null;
    }

    @Override
    public void imprimir() {
        Collection<Contacto> valores = contactos.values();

        System.out.println("\n|---LISTA DE CONTACTOS---|");
        valores.forEach(valor -> {
            System.out.println(valor);
        });
    }
}
