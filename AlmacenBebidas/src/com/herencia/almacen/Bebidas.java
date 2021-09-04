package com.herencia.almacen;

public class Bebidas {
    private final int idBebida;
    private String marca;
    private String tipoBebida;
    private double cantidadLitros;
    private double precio;
    private boolean promocion;
    private static int contadorBebidas;
    
    public Bebidas(){
        this.idBebida = ++Bebidas.contadorBebidas;
    }
    
    public Bebidas(String marca, String tipoBebida, double cantidadLitros, double precio, boolean promocion){
        this();
        this.marca = marca;
        this.tipoBebida = tipoBebida;
        this.cantidadLitros = cantidadLitros;
        this.precio = precio;
        this.promocion = promocion;
        
        if(promocion){
            promocion(precio);
        }
    }
    
    private void promocion(double precio){
        this.precio -= (10 * this.precio) / 100;
    }
    
    public int getIdBebida(){
        return this.idBebida;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoBebida() {
        return this.tipoBebida;
    }

    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public double getCantidadLitros() {
        return this.cantidadLitros;
    }

    public void setCantidadLitros(double cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isPromocion() {
        return this.promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public String toString() {
        String resultPromocion = (this.promocion) ? "Aplicada." : "No aplicada.";
        return  "\nID: " + this.idBebida
                + "\nMarca: " + this.marca + "\nTipo de bebida: " + this.tipoBebida
                + "\nCantidad de litros: " + this.cantidadLitros
                + "\nPrecio: " + this.precio + "\nPromoción: " + resultPromocion;
    }
    
    
}
