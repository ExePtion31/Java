package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Cheetos", 2500);
        producto.setPrecio(-2500);
        System.out.println(producto.calcularPrecioProm(50));
    }
}
