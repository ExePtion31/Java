package com.herencia.almacen;

public class Almacen {
    
    public BebidaAgua bebidasAgua[];
    public BebidaAzucarada bebidasAzucaradas[];
    public static final int MAX_BEBIDAS = 10;
    private int contadorBebidasAzucar;
    private int contadorBebidasAgua;

    public Almacen() {
        this.bebidasAgua = new BebidaAgua[Almacen.MAX_BEBIDAS];
        this.bebidasAzucaradas = new BebidaAzucarada[Almacen.MAX_BEBIDAS];
    }
    
    public void agregarBebidaAgua(BebidaAgua bebidasAgua) {
        if(this.contadorBebidasAgua < Almacen.MAX_BEBIDAS){
            this.bebidasAgua[this.contadorBebidasAgua++] = bebidasAgua; 
        }else{
            System.out.println("Has superado el limite: " + Almacen.MAX_BEBIDAS);
        }
    }
    
    public void agregarBebidaAzucar(BebidaAzucarada bebidasAzucaradas) {
        if(this.contadorBebidasAzucar < Almacen.MAX_BEBIDAS){
            this.bebidasAzucaradas[this.contadorBebidasAzucar++] = bebidasAzucaradas; 
        }else{
            System.out.println("Has superado el limite: " + Almacen.MAX_BEBIDAS);
        }
    }
    
    public void eliminarBebida(int id){
        for (int i = 0; i < contadorBebidasAzucar; i++) {
           if(this.bebidasAzucaradas[i].getIdBebida() == id){
               System.out.println(bebidasAgua[i]);
           } 
        }
        
        for (int i = 0; i < contadorBebidasAgua; i++) {
           if(this.bebidasAgua[i].getIdBebida() == id){
               System.out.println(bebidasAgua[i]);
           } 
        }
    }
    
    public void precioTotalBebidas(){
        int total = 0;
        for (int i = 0; i < this.contadorBebidasAzucar; i++) {
            total += this.bebidasAzucaradas[i].getPrecio();
        }
        
        for (int i = 0; i < this.contadorBebidasAgua; i++) {
            total += this.bebidasAgua[i].getPrecio();
        }
        
        System.out.println("-----PRECIO TOTAL-----"
                            + "\n$" + total);
    }
    
    public void precioMarca(String marca){
        int total = 0;
        if(this.contadorBebidasAgua <= 0 && this.contadorBebidasAzucar <= 0){
            System.out.println("-----AVISO-----"
                            + "\nNo existen productos en la estanteria.\n");
        }else{
            for (int i = 0; i < this.contadorBebidasAzucar; i++) {
                if(marca.toLowerCase().equals(this.bebidasAzucaradas[i].getMarca().toLowerCase())){
                   total += bebidasAzucaradas[i].getPrecio();
                }
            }
            
            for (int i = 0; i < this.contadorBebidasAgua; i++) {
                if(marca.toLowerCase().equals(this.bebidasAgua[i].getMarca().toLowerCase())){
                   total += bebidasAgua[i].getPrecio();
                }
            }
        }
        
        System.out.println("----TOTAL DE LA MARCA " + marca.toUpperCase() + "----"
                        + "\n$" + total + "\n");
    }
    
    public void mostrarOrden(){
        for (int i = 0; i < this.contadorBebidasAzucar; i++) {
            System.out.println(this.bebidasAzucaradas[i]);
        }
        
        for (int i = 0; i < this.contadorBebidasAgua; i++) {
            System.out.println(this.bebidasAgua[i]);
        }
    }

    public int getContadorBebidasAzucar() {
        return contadorBebidasAzucar;
    }

    public void setContadorBebidasAzucar(int contadorBebidasAzucar) {
        this.contadorBebidasAzucar = contadorBebidasAzucar;
    }

    public int getContadorBebidasAgua() {
        return contadorBebidasAgua;
    }

    public void setContadorBebidasAgua(int contadorBebidasAgua) {
        this.contadorBebidasAgua = contadorBebidasAgua;
    }
    
    
}
