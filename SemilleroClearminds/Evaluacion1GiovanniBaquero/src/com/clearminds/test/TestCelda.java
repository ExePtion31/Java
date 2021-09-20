package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {

    public static void main(String[] args) {
        /*
            El error el gracias a que no hemos creado un objeto de tipo Producto pero,
            aunque lo creemos no lo estamos seteando en nuestro metodo ingresarProducto,
            así que, la variable de tipo producto es null y no tiene informacion para 
            mostrar.
        */

        Celda celda = new Celda("A1");
        System.out.println(celda.getProducto().getNombre());

        System.out.println("CELDA:" + celda.getProducto());
        System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
        System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
        System.out.println("Código Producto:" + celda.getProducto().getCodigo());
        System.out.println("STOCK:" + celda.getStock());
        System.out.println("*************************************");
    }
}
