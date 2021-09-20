package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {

    public static void main(String[] args) {
        
        /*
            El error es simple, ya que, creamos un producto pero se lo asignamos a la celda B1
            pero, estamos es buscando el nombre de la celda A1 e imprimimos el Producto. Me va
            a imprimir null ya que en esa celda no hay productos asignado, entonces, el metodo
            getNombre me trae un null.
        */
        
        
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        Producto producto = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(producto, "B1", 4);

        Producto prod = maquina.mostrarProductoEnCelda("A1");
        System.out.println("Producto encontrado:" + prod.getNombre());

    }
}
