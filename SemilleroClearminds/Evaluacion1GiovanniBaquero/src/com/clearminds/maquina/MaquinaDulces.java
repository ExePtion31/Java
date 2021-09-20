package com.clearminds.maquina;

import com.clearminds.componentes.*;
import java.util.*;

public class MaquinaDulces {

    private List<Celda> celdas = new ArrayList<>();
    private double saldo;

    public MaquinaDulces() {
    }

    public void agregarCelda(String codigoCelda) {
        this.celdas.add(new Celda(codigoCelda));
    }

    public void mostrarConfiguracion() {
        celdas.forEach(celda -> {
            System.out.println("CELDA: " + celda.getCodigo());
        });
    }

    public Celda buscarCelda(String codigoCelda) {
        for (Celda c : this.celdas) {
            if (c.getCodigo().equals(codigoCelda)) {
                return c;
            }
        }

        return null;
    }

    public void cargarProducto(Producto producto, String codigoCelda, int cantidadStock) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        int totalStock = cantidadStock + celdaRecuperada.getStock();
        celdaRecuperada.ingresarProducto(producto, totalStock);
    }

    public void mostrarProductos() {
        this.celdas.forEach(celda -> {
            System.out.println("\n|----CELDA " + celda.getCodigo()
                    + "\nStock: " + celda.getStock());
            if (celda.getProducto() == null) {
                System.out.println("La celda no tiene producto");
            } else {
                System.out.println(celda.getProducto());
            }
        });
    }

    public Producto buscarProductoEnCelda(String codigoCelda) {
        for (Celda celda : this.celdas) {
            if (celda.getCodigo().equals(codigoCelda)) {
                return celda.getProducto();
            }
        }
        return null;
    }

    public double consultarPrecio(String codigoCelda) {
        double precio = 0;
        for (Celda celda : this.celdas) {
            if (celda.getCodigo().equals(codigoCelda)) {
                precio = celda.getProducto().getPrecio();
            }
        }
        return precio;
    }

    public Celda buscarCeldaProducto(String codigoProducto) {

        for (Celda celda : this.celdas) {
            if (celda.getProducto() != null) {
                if (celda.getProducto().getCodigo().equals(codigoProducto)) {
                    return celda;
                }
            }
        }

        return null;
    }

    public void incrementarProductos(String codigoProducto, int cantidad) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        int totalStock = cantidad + celdaEncontrada.getStock();
        celdaEncontrada.setStock(totalStock);
    }

    public void vender(String codigoCelda) {
        Celda celdaEncontrada = buscarCelda(codigoCelda);
        int totalStock = celdaEncontrada.getStock() - 1;
        celdaEncontrada.setStock(totalStock);
        this.saldo += celdaEncontrada.getProducto().getPrecio();
    }

    public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda celdaEncontrada = buscarCelda(codigoCelda);
        int totalStock = celdaEncontrada.getStock() - 1;
        celdaEncontrada.setStock(totalStock);
        this.saldo += celdaEncontrada.getProducto().getPrecio();

        double cambio = valorIngresado - celdaEncontrada.getProducto().getPrecio();
        return cambio;
    }
    
    public List<Producto> buscarMenores(double limite){
        List<Producto> productos = new ArrayList<>();
        for(Celda celda:this.celdas){
            if(celda.getProducto().getPrecio() <= limite){
                productos.add(celda.getProducto());
            }
        }
        return productos;
    }

    public List<Celda> getCeldas() {
        return celdas;
    }

    public void setCeldas(List<Celda> celdas) {
        this.celdas = celdas;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
