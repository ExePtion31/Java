package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.agregarCelda("A1");
        maquina.agregarCelda("A2");
        maquina.agregarCelda("B1");
        maquina.agregarCelda("B2");

        Producto producto = new Producto("KE34", "Papitas", 0.85);
        maquina.cargarProducto(producto, "A1", 4);

        Producto producto2 = new Producto("D456", "Doritos", 0.70);
        maquina.cargarProducto(producto2, "A2", 6);

        Producto producto3 = new Producto("G236", "Chicles", 0.20);
        maquina.cargarProducto(producto3, "B1", 6);

        Producto producto4 = new Producto("F409", "Toallas", 2.70);
        maquina.cargarProducto(producto4, "B2", 6);
        
        System.out.println(maquina.buscarMenores(0.7));
    }
}
