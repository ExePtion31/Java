package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "C:\\Users\\giova\\Documents\\Prueba.txt";
        crearArchivo(nombreArchivo);

        escribirArchivo(nombreArchivo, "P");
        anexarInformacion(nombreArchivo, "U");
        anexarInformacion(nombreArchivo, "T");
        anexarInformacion(nombreArchivo, "O");
        leerArchivo(nombreArchivo);
    }
}
