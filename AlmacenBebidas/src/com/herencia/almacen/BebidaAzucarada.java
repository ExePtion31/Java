package com.herencia.almacen;

public class BebidaAzucarada extends Bebidas{
    private double porcentajeAzucar;

    public BebidaAzucarada(String marca, double cantidadLitros, double precio, boolean promocion, double porcentajeAzucar) {
        super(marca, "Azucarada", cantidadLitros, precio, promocion);
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public double getPorcentajeAzucar() {
        return this.porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    @Override
    public String toString() {
        return  "\n----------------------"
                + super.toString() 
                + "\nPorcentaje Azucar: " + this.porcentajeAzucar 
                + "\n----------------------";
    }
}
