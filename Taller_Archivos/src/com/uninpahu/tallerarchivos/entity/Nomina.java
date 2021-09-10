package com.uninpahu.tallerarchivos.entity;

public class Nomina {

    private long nIdentificacion;
    private double vSalud;
    private double vPension;
    private double totalSeguridad;
    private double vFondo;
    private double subsidio;
    private double salarioBruto;
    private double salarioNeto;

    public Nomina() {
    }

    public Nomina(long nIdentificacion, double vSalud, double vPension, double totalSeguridad, double vFondo, double subsidio, double salarioBruto, double salarioNeto) {
        this.nIdentificacion = nIdentificacion;
        this.vSalud = vSalud;
        this.vPension = vPension;
        this.totalSeguridad = totalSeguridad;
        this.vFondo = vFondo;
        this.subsidio = subsidio;
        this.salarioBruto = salarioBruto;
        this.salarioNeto = salarioNeto;
    }

    public long getnIdentificacion() {
        return nIdentificacion;
    }

    public void setnIdentificacion(long nIdentificacion) {
        this.nIdentificacion = nIdentificacion;
    }

    public double getvSalud() {
        return vSalud;
    }

    public void setvSalud(double vSalud) {
        this.vSalud = vSalud;
    }

    public double getvPension() {
        return vPension;
    }

    public void setvPension(double vPension) {
        this.vPension = vPension;
    }

    public double getTotalSeguridad() {
        return totalSeguridad;
    }

    public void setTotalSeguridad(double totalSeguridad) {
        this.totalSeguridad = totalSeguridad;
    }

    public double getvFondo() {
        return vFondo;
    }

    public void setvFondo(double vFondo) {
        this.vFondo = vFondo;
    }

    public double getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(double subsidio) {
        this.subsidio = subsidio;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    @Override
    public String toString() {
        return this.nIdentificacion + "," + this.vSalud + "," + this.vPension
                + "," + this.totalSeguridad + "," + this.vFondo + "," + this.subsidio
                + "," + this.salarioBruto + "," + this.salarioNeto;
    }

}
