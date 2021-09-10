package com.uninpahu.tallerarchivos.negocio;

import com.uninpahu.tallerarchivos.datos.*;
import com.uninpahu.tallerarchivos.entity.Persona;
import java.text.SimpleDateFormat;
import java.util.*;

public class DatosPersonaImpl implements IDatosPersona {

    private final IAccesoDatos datos = new AccesoDatosImp();
    Scanner sc = new Scanner(System.in);

    @Override
    public void iniciarArchivo() {
        try {
            if (!this.datos.existeArchivo(NOMBRE_RECURSO)) {
                this.datos.crearArchivo(NOMBRE_RECURSO);
            }
        } catch (Exception ex) {
            System.out.println("Error al iniciar el archivo.");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void agregarEmpleado() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = sdf.format(new Date());
        boolean anexar = false;

        System.out.println("\n|---NUEVO EMPLEADO---|"
                + "\nIngrese número de identificación:");
        int nIdentificacion = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la Dirección de residencia:");
        String direccion = sc.nextLine();
        System.out.println("Ingrese el número de contacto:");
        long nContacto = Long.parseLong(sc.nextLine());
        System.out.println("Ingrese la edad:");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el cargo:");
        String cargo = sc.nextLine();
        System.out.println("Ingrese el correo electrónico:");
        String correo = sc.nextLine();
        System.out.println("Ingrese el salario:");
        double salario = Double.parseDouble(sc.nextLine());
        Persona persona = new Persona(nIdentificacion, nombre, direccion, nContacto, edad, cargo, fecha, correo, salario);

        try {
            anexar = datos.existeArchivo(NOMBRE_RECURSO);
            datos.agregarEmpleado(NOMBRE_RECURSO, persona, anexar);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("|---ALERTA---|"
                    + "\nError al agregar un nuevo empleado.");
        }
    }

    @Override
    public void listarEmpleados() {
        try {
            List<Persona> personas = this.datos.listarEmpleados(NOMBRE_RECURSO);
            System.out.println("\n|-------------LISTA DE EMPLEADOS-------------|");
            personas.forEach(persona -> {
                System.out.println("\n|---EMPLEADO---|"
                        + "\nNúmero de identificación: " + persona.getnIdentificacion()
                        + "\nNombre: " + persona.getNombre()
                        + "\nDirección de residencia: " + persona.getDireccion()
                        + "\nNúmero de contacto: " + persona.getnContacto()
                        + "\nEdad: " + persona.getEdad()
                        + "\nCargo: " + persona.getCargo()
                        + "\nFecha de ingreso: " + persona.getFechaIngreso()
                        + "\nCorreo electrónico: " + persona.getCorreo()
                        + "\nSalario: $" + persona.getSalario());
            });
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarEmpleado() {
        System.out.println("\n|---BUSCAR---|"
                + "\nIngrese el valor de busqueda(numero de contacto, numero de documento, "
                + "edad, salario, fecha de ingreso.");
        String buscar = sc.nextLine();
        List<Persona> empleados = this.datos.buscarEmpleado(NOMBRE_RECURSO, buscar);

        System.out.println("\n|---------RESULTADOS DE LA BUSQUEDA---------|");
        empleados.forEach(persona -> {
            System.out.println("\n|---EMPLEADO---|"
                    + "\nNúmero de identificación: " + persona.getnIdentificacion()
                    + "\nNombre: " + persona.getNombre()
                    + "\nDirección de residencia: " + persona.getDireccion()
                    + "\nNúmero de contacto: " + persona.getnContacto()
                    + "\nEdad: " + persona.getEdad()
                    + "\nCargo: " + persona.getCargo()
                    + "\nFecha de ingreso: " + persona.getFechaIngreso()
                    + "\nCorreo electrónico: " + persona.getCorreo()
                    + "\nSalario: $" + persona.getSalario());
        });
    }
}
