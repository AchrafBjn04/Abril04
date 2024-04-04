package com.softtek.presentacion;

import com.softtek.model.Alumno;

public class Ejercicio06 {
    public static void main(String[] args) {
        Alumno a = new Alumno("Achraf Boujaanan", 5);
        a.asignarCalificaciones();
        System.out.println("Promedio calificaciones: " + a.promedioCalificaciones());
        System.out.println("Calificaciones de " + a.getNombre() + " : " + a.mostrarCalificaciones());
    }
}
