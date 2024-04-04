package com.softtek.presentacion;

public class Main {
    public static void main(String[] args) {
        //Calcular area del cuadrado
        int ladoCuadrado = 6;
        int areaCuadrado = ladoCuadrado * ladoCuadrado;
        System.out.println("\nÁrea de cuadrado: " + areaCuadrado);

        //Calcular area del circulo
        int radioCirculo = 3;
        double areaCirculo = Math.PI * (Math.pow(radioCirculo, 2));
        System.out.println("\nÁrea del círculo: " + areaCirculo);

        //Calcular perimetro del rectangulo
        int baseRectangulo = 4;
        int alturaRectangulo = 3;
        int perimetroRectangulo = 2*baseRectangulo + 2*alturaRectangulo;
        System.out.println("\nPerímetro del rectángulo: " + perimetroRectangulo);
    }
}
