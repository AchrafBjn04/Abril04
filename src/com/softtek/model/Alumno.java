package com.softtek.model;

import java.util.Random;

public class Alumno {
    private String nombre;
    private int[] calificacionesParciales;

    public Alumno() {}

    public Alumno(String nombre, int dimensionArray){
        this.nombre = nombre;
        calificacionesParciales = new int[dimensionArray];
    }

    public void asignarCalificaciones(){
        Random random = new Random();
        for (int i = 0; i < this.calificacionesParciales.length; i++) {
            this.calificacionesParciales[i] = random.nextInt(11);
        }
    }

    public double promedioCalificaciones(){
        double suma = 0;
        for (int calificacionParcial : this.calificacionesParciales) {
            suma += calificacionParcial;
        }

        return suma/this.calificacionesParciales.length;
    }

    public String mostrarCalificaciones(){
        String calificaciones = "[";
        for (int i = 0; i < this.calificacionesParciales.length; i++) {
            calificaciones += "" + this.calificacionesParciales[i];
            if (i < this.calificacionesParciales.length - 1) {
                calificaciones +=", ";
            }
        }
        calificaciones +="]";
        return calificaciones;
    }

    public String getNombre() {
        return nombre;
    }
}
