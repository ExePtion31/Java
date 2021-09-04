package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    protected final int idTeclado;
    protected static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString() +'}';
    }
}
