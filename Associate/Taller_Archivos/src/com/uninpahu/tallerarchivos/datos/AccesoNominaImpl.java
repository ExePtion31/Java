package com.uninpahu.tallerarchivos.datos;

import com.uninpahu.tallerarchivos.entity.*;
import java.io.*;
import java.util.*;

public class AccesoNominaImpl implements IAccesoNomina {

    @Override
    public boolean existeArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public void crearArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void liquidarNomina(String nombreArchivo, boolean anexar, List<Long> empleadosBuscar, List<Persona> empleados) {

        var archivo = new File(nombreArchivo);

        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            empleados.forEach(empleado -> {
                empleadosBuscar.forEach(empleadoBuscar -> {
                    if (empleadoBuscar == empleado.getnIdentificacion()) {
                        salida.println(calcularValores(empleado));
                    }
                });
            });
            System.out.println("\n|----ALERTA----|"
                    + "\nNóminas liquidadas exitosamente.");
            salida.close();
            salida.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void liquidarNominaAll(String nombreArchivo, boolean anexar, List<Persona> empleados) {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            empleados.forEach(empleado -> {
                salida.println(calcularValores(empleado));
            });
            System.out.println("\n|----ALERTA----|"
                    + "\nNóminas liquidadas exitosamente.");
            salida.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public List<Nomina> listarNominas(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        List<Nomina> nominas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                var nomina = new Nomina(Long.parseLong(datos[0]), Double.parseDouble(datos[1]), Double.parseDouble(datos[2]),
                        Double.parseDouble(datos[3]), Double.parseDouble(datos[4]), Double.parseDouble(datos[5]), Double.parseDouble(datos[6]),
                        Double.parseDouble(datos[7]));
                nominas.add(nomina);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return nominas;
    }

    @Override
    public List<Nomina> listarNominasBuscador(String nombreArchivo, boolean opcion) {
        List<Nomina> listaNominas = listarNominas(nombreArchivo);
        List<Nomina> resultado = new ArrayList<>();

        if (opcion) {
            listaNominas.forEach(nomina -> {
                if (nomina.getSubsidio() > 0) {
                    resultado.add(nomina);
                }
            });
        } else {
            listaNominas.forEach(nomina -> {
                if (nomina.getSubsidio() <= 0) {
                    resultado.add(nomina);
                }
            });
        }
        return resultado;
    }

    @Override
    public List<Nomina> listarNominasBuscador(String nombreArchivo, double valor1, double valor2) {
        List<Nomina> listaNominas = listarNominas(nombreArchivo);
        List<Nomina> resultado = new ArrayList<>();

        listaNominas.forEach(nomina -> {
            if (nomina.getSalarioBruto() >= valor1 && nomina.getSalarioBruto() <= valor2) {
                resultado.add(nomina);
            }
        });

        return resultado;
    }

    @Override
    public List<Nomina> listarNominasBuscador(String nombreArchivo, long nIdentificacion) {
        List<Nomina> listaNominas = listarNominas(nombreArchivo);
        List<Nomina> resultado = new ArrayList<>();

        listaNominas.forEach(nomina -> {
            if (nomina.getnIdentificacion() == nIdentificacion) {
                resultado.add(nomina);
            }
        });

        return resultado;
    }

    private Nomina calcularValores(Persona empleado) {
        double sSocial = (8 * empleado.getSalario()) / 100;
        double vSalud = sSocial / 2;
        double vPension = sSocial / 2;
        double fSolidario = 0;
        double sTransporte = 0;
        if (empleado.getSalario() > 2500000) {
            fSolidario = (1 * empleado.getSalario()) / 100;
        }
        if (empleado.getSalario() <= 1818000) {
            sTransporte = 106454;
        }
        double sNeto = empleado.getSalario() - (sSocial + fSolidario) + sTransporte;
        Nomina nomina = new Nomina(empleado.getnIdentificacion(), vSalud, vPension, sSocial, fSolidario, sTransporte, empleado.getSalario(), sNeto);

        return nomina;
    }
}
