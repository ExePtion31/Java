package com.uninpahu.tallerarchivos.negocio;

import com.uninpahu.tallerarchivos.datos.*;
import com.uninpahu.tallerarchivos.entity.*;
import static com.uninpahu.tallerarchivos.negocio.IDatosPersona.NOMBRE_RECURSO;
import java.util.*;

public class DatosNominaImpl implements IDatosNomina {

    IAccesoNomina datos = new AccesoNominaImpl();
    IAccesoDatos datosE = new AccesoDatosImp();
    Scanner sc = new Scanner(System.in);

    @Override
    public void iniciarArchivo() {
        try {
            if (!this.datos.existeArchivo(NOMBRE_ARCHIVO)) {
                this.datos.crearArchivo(NOMBRE_ARCHIVO);
            }
        } catch (Exception ex) {
            System.out.println("Error al iniciar el archivo.");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void liquidarNomina() {
        List<Persona> empleados = datosE.listarEmpleados(NOMBRE_RECURSO);
        boolean anexar = false;
        System.out.println("\n|---LIQUIDACIÓN DE NÓMINA---|"
                + "\n1.Liquidar uno o varios empleados."
                + "\n2.Liquidar todos los empleados.");
        int respuesta = Integer.parseInt(sc.nextLine());
        if (respuesta == 1) {
            List<Long> empleadosBuscar = new ArrayList<>();

            System.out.println("Ingrese la cantidad de personas a liquidar.");
            int cantidad = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el número de idenficación de la persona #" + (i + 1));
                Long nIdentificacion = Long.parseLong(sc.nextLine());
                empleadosBuscar.add(nIdentificacion);
            }
            try {
                anexar = datos.existeArchivo(NOMBRE_ARCHIVO);
                datos.liquidarNomina(NOMBRE_ARCHIVO, anexar, empleadosBuscar, empleados);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } else if (respuesta == 2) {
            datos.liquidarNominaAll(NOMBRE_ARCHIVO, anexar, empleados);
        } else {
            System.out.println("\n|---ALERTA---|"
                    + "\nIngrese un número válido.");
        }
    }

    @Override
    public void buscarNominas() {
        List<Nomina> nominas = new ArrayList<>();
        System.out.println("\n|---BUSCAR NÓMINAS---|"
                + "\n1.Todas las nóminas."
                + "\n2.Buscar por valor.");
        int respuesta = Integer.parseInt(sc.nextLine());

        if (respuesta == 1) {
            nominas = datos.listarNominas(NOMBRE_ARCHIVO);
            System.out.println("\n|-------------LISTA DE NOMINAS-------------|");
            nominas.forEach(nomina -> {
                System.out.println("\n|----NOMINA----|"
                        + "\nNúmero de Identificación: " + nomina.getnIdentificacion()
                        + "\nTotal Salud: $" + nomina.getvSalud()
                        + "\nTotal Pensión: $" + nomina.getvPension()
                        + "\nTotal Seguridad Social: $" + nomina.getTotalSeguridad()
                        + "\nTotal Fondo solidaridad: $" + nomina.getvFondo()
                        + "\nTotal Subsidio de transporte: $" + nomina.getSubsidio()
                        + "\nSalario bruto: $" + nomina.getSalarioBruto()
                        + "\nSalario Neto: $" + nomina.getSalarioNeto());
            });
        } else if (respuesta == 2) {
            System.out.println("\n|----BUSCADOR----|"
                    + "\n1.Con subsidio de transporte"
                    + "\n2.Sin subsidio de transporte"
                    + "\n3.Rango salarial"
                    + "\n4.Número de identificación.");
            respuesta = Integer.parseInt(sc.nextLine());
            switch (respuesta) {
                case 1:
                    nominas = datos.listarNominasBuscador(NOMBRE_ARCHIVO, true);
                    break;
                case 2:
                    nominas = datos.listarNominasBuscador(NOMBRE_ARCHIVO, false);
                    break;
                case 3:
                    System.out.println("\nIngrese el salario minimo.");
                    double valor1 = Double.parseDouble(sc.nextLine());
                    System.out.println("\nIngrese el salario maximo.");
                    double valor2 = Double.parseDouble(sc.nextLine());
                    nominas = datos.listarNominasBuscador(NOMBRE_ARCHIVO, valor1, valor2);
                    break;
                case 4:
                    System.out.println("\nIngrese el número de identificación.");
                    long nIdentificacion = Long.parseLong(sc.nextLine());
                    nominas = datos.listarNominasBuscador(NOMBRE_ARCHIVO, nIdentificacion);
                    break;
                default:
                    break;
            }
            nominas.forEach(nomina -> {
                System.out.println("\n|----NOMINA----|"
                        + "\nNúmero de Identificación: " + nomina.getnIdentificacion()
                        + "\nTotal Salud: $" + nomina.getvSalud()
                        + "\nTotal Pensión: $" + nomina.getvPension()
                        + "\nTotal Seguridad Social: $" + nomina.getTotalSeguridad()
                        + "\nTotal Fondo solidaridad: $" + nomina.getvFondo()
                        + "\nTotal Subsidio de transporte: $" + nomina.getSubsidio()
                        + "\nSalario bruto: $" + nomina.getSalarioBruto()
                        + "\nSalario Neto: $" + nomina.getSalarioNeto());
            });
        } else {
            System.out.println("\n|---ALERTA---|"
                    + "\nIngrese un número válido.");
        }
    }
}
