package com.cmc.repaso.entidades;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public double calcularPrecioProm(double descuento){
        double precioProm = this.precio - ((descuento * this.precio) / 100);
        return precioProm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = precio * (-1);
        } else {
            this.precio = precio;
        }
    }    
}
