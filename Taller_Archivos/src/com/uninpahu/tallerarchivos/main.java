package com.uninpahu.tallerarchivos;

import com.uninpahu.tallerarchivos.negocio.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        IDatosPersona datos = new DatosPersonaImpl();
        IDatosNomina datosN = new DatosNominaImpl();
        Scanner sc = new Scanner(System.in);
        datos.iniciarArchivo();
        datosN.iniciarArchivo();
        while (true) {
            System.out.println("\n|---BIENVENIDO---|"
                    + "\n1.Agregar empleados."
                    + "\n2.Buscar empleados."
                    + "\n3.Información de los empleados."
                    + "\n4.Liquidar nómina."
                    + "\n5.Buscar nominas."
                    + "\n0.Salir.");
            int respuesta = Integer.parseInt(sc.nextLine());
            if (respuesta == 1) {
                datos.agregarEmpleado();
            } else if (respuesta == 2) {
                datos.buscarEmpleado();
            } else if (respuesta == 3) {
                datos.listarEmpleados();
            } else if (respuesta == 4) {
                datosN.liquidarNomina();
            } else if (respuesta == 5) {
                datosN.buscarNominas();
            } else if (respuesta == 0) {
                break;
            } else {
                System.out.println("|---ALERTA---|"
                        + "\nIngrese una opción valida.");
            }
        }
    }
}
