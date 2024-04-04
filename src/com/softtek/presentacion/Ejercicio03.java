package com.softtek.presentacion;

import com.softtek.model.Areas;

public class Ejercicio03 {
    public static void main(String[] args) {
        int radioCirculo = 6;
        int alturaRectangulo = 3;
        int baseRectangulo = 4;
        Areas a = new Areas();
        System.out.println("Area circulo: " + a.calcularAreaCirculo(radioCirculo));
        System.out.println("Area rectangulo: " + a.calcularAreaRectangulo(baseRectangulo, alturaRectangulo));
    }

}
