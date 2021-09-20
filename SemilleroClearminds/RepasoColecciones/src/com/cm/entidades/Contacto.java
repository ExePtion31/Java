package com.cm.entidades;

import java.util.*;

public class Contacto {

    private String cedula;
    private String nombre;
    private String apellido;
    private List<Telefono> telefonos = new ArrayList<>();

    public Contacto(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void agregarTelefono(Telefono telefono) {
        telefonos.add(telefono);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        System.out.println("\n|---CONTACTO---|");
        this.telefonos.forEach(telefono -> {
            System.out.println(telefono);
        });

        return "\nCédula: " + this.cedula
                + "\nNombre: " + this.nombre
                + "\nApellido: " + this.apellido;
    }
}
