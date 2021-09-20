package com.herencia.almacen;

public class BebidaAgua extends Bebidas{

    private String origenBebida;

    public BebidaAgua(String marca, double cantidadLitros, double precio, boolean promocion, String origenBebida) {
        super(marca, "Agua", cantidadLitros, precio, promocion);

        this.origenBebida = origenBebida;
    }

    public String getOrigenBebida() {
        return origenBebida;
    }

    public void setOrigenBebida(String origenBebida) {
        this.origenBebida = origenBebida;
    }

    @Override
    public String toString() {
        return  "\n----------------------"
                + super.toString() 
                + "\nOrigen Bebida: " + this.origenBebida 
                + "\n----------------------";
    }
}
