package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Pablito");
        estudiante.calificar(7.9);
        System.out.println(estudiante);
    }
}
