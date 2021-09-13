package com.uninpahu.tallerarchivos.datos;

import com.uninpahu.tallerarchivos.entity.Persona;
import java.io.*;
import java.util.*;

public class AccesoDatosImp implements IAccesoDatos {

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
    public void agregarEmpleado(String nombreArchivo, Persona persona, boolean anexarInformacion) {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexarInformacion));
            salida.println(persona.toString());
            salida.close();
            System.out.println("\n|---ALERTA---|"
                    + "\nSe ha agregado un nuevo empleado.");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public List<Persona> listarEmpleados(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        List<Persona> empleados = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                var persona = new Persona(Long.parseLong(datos[0]), datos[1], datos[2], Long.parseLong(datos[3]),
                        Integer.parseInt(datos[4]), datos[5], datos[6], datos[7], Double.parseDouble(datos[8]));
                empleados.add(persona);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return empleados;
    }

    @Override
    public List<Persona> buscarEmpleado(String nombreArchivo, String buscar) {
        var archivo = new File(nombreArchivo);
        List<Persona> resultado = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(nombreArchivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                for (int i = 0; i < datos.length; i++) {
                    if (buscar != null && buscar.equalsIgnoreCase(datos[i])){
                        var persona = new Persona(Long.parseLong(datos[0]), datos[1], datos[2], Long.parseLong(datos[3]),
                            Integer.parseInt(datos[4]), datos[5], datos[6], datos[7], Double.parseDouble(datos[8]));
                    resultado.add(persona);
                    }
                }
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (Exception ex) {
            System.out.println("\n|---ALERTA---|"
                    + "\nHubo un error al realizar la busqueda.");
        }
        return resultado;
    }
}
