package com.cm.test;


import com.cm.colecciones.DirectorioMapa;
import com.cm.entidades.Contacto;
import com.cm.entidades.Telefono;

public class ContactoMapTest {

    public static void main(String[] args) {
        Telefono telefono = new Telefono("movi", "94385349");
        Telefono telefono2 = new Telefono("claro", "5435377645");
        Telefono telefono3 = new Telefono("tigo", "532523523");

        Contacto contacto = new Contacto("1010046823", "Giovanni", "Baquero Vargas");
        Contacto contacto2 = new Contacto("79796904", "Pepe", "Baquero Vargas");
        Contacto contacto3 = new Contacto("79796904", "Pedro", "Baquero");
        Contacto contacto4 = new Contacto("79796904", "Andrea", "Torres");
        Contacto contacto5 = new Contacto("43534534", "Juanita", "Vargas");

        contacto.agregarTelefono(telefono);
        contacto2.agregarTelefono(telefono2);
        contacto3.agregarTelefono(telefono3);
        contacto4.agregarTelefono(telefono3);
        contacto5.agregarTelefono(telefono3);

        DirectorioMapa dr = new DirectorioMapa();
        dr.agregarContacto(contacto);
        dr.agregarContacto(contacto2);
        dr.agregarContacto(contacto3);
        dr.agregarContacto(contacto4);
        dr.agregarContacto(contacto5);
        System.out.println(dr.buscarContacto("1010046823"));
        System.out.println(dr.eliminarContacto("1010046823"));
        dr.imprimir();
    }
}
