package com.clearminds.componentes;

public class Producto {
    private String nombre;
    private double precio;
    private String codigo;

    public Producto(String codigo, String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }
    
    public void incrementarPrecio(int incremento){
        this.precio += (incremento * this.precio)/100;
    }
    
    public void disminuirPrecio(double descuento){
        this.precio -= descuento;
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
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + 
                "\nPrecio: " + this.precio +
                "\nCódigo: " + this.codigo;
    }
}
