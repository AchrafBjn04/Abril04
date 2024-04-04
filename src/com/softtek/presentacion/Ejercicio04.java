package com.softtek.presentacion;

import com.softtek.model.Campos;

public class Ejercicio04 {
    public static void main(String[] args) {
        Campos c = new Campos(5);
        c.incrementa();
        System.out.println("Valor incrementado: " + c.muestra());
    }
}
