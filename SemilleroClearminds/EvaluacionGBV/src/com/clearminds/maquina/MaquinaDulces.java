package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

    private Celda celda1 = new Celda("");
    private Celda celda2 = new Celda("");
    private Celda celda3 = new Celda("");
    private Celda celda4 = new Celda("");
    private double saldo;

    public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
        this.celda1.setCodigo(cod1);
        this.celda2.setCodigo(cod2);
        this.celda3.setCodigo(cod3);
        this.celda4.setCodigo(cod4);
    }

    public void mostrarConfiguracion() {
        System.out.println("CELDA 1: " + this.celda1.getCodigo());
        System.out.println("CELDA 2: " + this.celda2.getCodigo());
        System.out.println("CELDA 3: " + this.celda3.getCodigo());
        System.out.println("CELDA 4: " + this.celda4.getCodigo());
        System.out.println(this.saldo);
    }

    public Celda buscarCelda(String codigo) {
        if (this.celda1.getCodigo().equals(codigo)) {
            return celda1;
        } else if (this.celda2.getCodigo().equals(codigo)) {
            return celda2;
        } else if (this.celda3.getCodigo().equals(codigo)) {
            return celda3;
        } else if (this.celda4.getCodigo().equals(codigo)) {
            return celda4;
        }
        return null;
    }

    public void cargarProducto(Producto producto, String codigoCelda, int cantidadStock) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        int totalStock = cantidadStock + celdaRecuperada.getStock();
        celdaRecuperada.ingresarProducto(producto, totalStock);
    }

    public void mostrarProductos() {
        //celda 1
        System.out.println("\n|----CELDA " + celda1.getCodigo()
                + "\nStock: " + celda1.getStock());
        if (celda1.getProducto() == null) {
            System.out.println("La celda no tiene producto");
        } else {
            System.out.println(celda1.getProducto());
        }

        //celda2
        System.out.println("\n|----CELDA " + celda2.getCodigo()
                + "\nStock: " + celda2.getStock());
        if (celda2.getProducto() == null) {
            System.out.println("La celda no tiene producto");
        } else {
            System.out.println(celda2.getProducto());
        }

        //celda3
        System.out.println("\n|----CELDA " + celda3.getCodigo()
                + "\nStock: " + celda3.getStock());
        if (celda3.getProducto() == null) {
            System.out.println("La celda no tiene producto");
        } else {
            System.out.println(celda3.getProducto());
        }

        //celda4
        System.out.println("\n|----CELDA " + celda4.getCodigo()
                + "\nStock: " + celda4.getStock());
        if (celda4.getProducto() == null) {
            System.out.println("La celda no tiene producto");
        } else {
            System.out.println(celda4.getProducto());
        }

        System.out.println("\nSaldo: " + this.saldo);
    }

    public Producto mostrarProductoEnCelda(String codigoCelda) {
        Producto producto = null;

        if (this.celda1.getCodigo().equals(codigoCelda)) {
            producto = celda1.getProducto();
        } else if (this.celda2.getCodigo().equals(codigoCelda)) {
            producto = celda2.getProducto();
        } else if (this.celda3.getCodigo().equals(codigoCelda)) {
            producto = celda3.getProducto();
        } else if (this.celda4.getCodigo().equals(codigoCelda)) {
            producto = celda4.getProducto();
        }

        return producto;
    }

    public double consultarPrecio(String codigoCelda) {
        double precio = 0;
        if (this.celda1.getCodigo().equals(codigoCelda)) {
            precio = celda1.getProducto().getPrecio();
        } else if (this.celda2.getCodigo().equals(codigoCelda)) {
            precio = celda2.getProducto().getPrecio();
        } else if (this.celda3.getCodigo().equals(codigoCelda)) {
            precio = celda3.getProducto().getPrecio();
        } else if (this.celda4.getCodigo().equals(codigoCelda)) {
            precio = celda4.getProducto().getPrecio();
        }

        return precio;
    }

    public Celda buscarCeldaProducto(String codigoProducto) {

        if (this.celda1.getProducto() != null) {
            if (this.celda1.getProducto().getCodigo().equals(codigoProducto)) {
                return celda1;
            }
        } else if (this.celda2.getProducto() != null) {
            if (this.celda2.getProducto().getCodigo().equals(codigoProducto)) {
                return celda2;
            }
        } else if (this.celda3.getProducto() != null) {
            if (this.celda3.getProducto().getCodigo().equals(codigoProducto)) {
                return celda3;
            }
        } else if (this.celda4.getProducto() != null) {
            if (this.celda4.getProducto().getCodigo().equals(codigoProducto)) {
                return celda4;
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

    public Celda getCelda1() {
        return celda1;
    }

    public void setCelda1(Celda celda1) {
        this.celda1 = celda1;
    }

    public Celda getCelda2() {
        return celda2;
    }

    public void setCelda2(Celda celda2) {
        this.celda2 = celda2;
    }

    public Celda getCelda3() {
        return celda3;
    }

    public void setCelda3(Celda celda3) {
        this.celda3 = celda3;
    }

    public Celda getCelda4() {
        return celda4;
    }

    public void setCelda4(Celda celda4) {
        this.celda4 = celda4;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "MaquinaDulces{" + "celda1=" + celda1 + ", celda2=" + celda2 + ", celda3=" + celda3 + ", celda4=" + celda4 + ", saldo=" + saldo + '}';
    }

}
