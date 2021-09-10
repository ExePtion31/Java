package com.uninpahu.tallerarchivos.entity;

public class Persona {

    private long nIdentificacion;
    private String nombre;
    private String direccion;
    private long nContacto;
    private int edad;
    private String cargo;
    private String fechaIngreso;
    private String correo;
    private double salario;

    public Persona() {
    }

    public Persona(long nIdentificacion, String nombre, String direccion, long nContacto, int edad, String cargo, String fechaIngreso, String correo, double salario) {
        this.nIdentificacion = nIdentificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nContacto = nContacto;
        this.edad = edad;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.correo = correo;
        this.salario = salario;
    }

    public long getnIdentificacion() {
        return nIdentificacion;
    }

    public void setnIdentificacion(long nIdentificacion) {
        this.nIdentificacion = nIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getnContacto() {
        return nContacto;
    }

    public void setnContacto(long nContacto) {
        this.nContacto = nContacto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return this.nIdentificacion + "," + this.nombre + "," + this.direccion
                + "," + this.nContacto + "," + this.edad + "," + this.cargo
                + "," + this.fechaIngreso + "," + this.correo + ","
                + this.salario;
    }
}
