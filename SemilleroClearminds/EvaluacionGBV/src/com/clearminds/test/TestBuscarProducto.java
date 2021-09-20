package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProducto {

    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        Producto producto = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(producto, "B1", 4);

        Producto productoEncontrado = maquina.mostrarProductoEnCelda("B1");
        System.out.println("Producto encontrado:" + productoEncontrado.getNombre());

        Producto prod = maquina.mostrarProductoEnCelda("A1");
        System.out.println("Producto encontrado:" + prod);

    }
}
