package com.softtek.model;

public class Areas {
    public Areas(){

    }
    public double calcularAreaCirculo(double radioCirculo){
        return Math.PI * (Math.pow(radioCirculo, 2));
    }
    public double calcularAreaRectangulo(double base, double altura){
        return base * altura;
    }
}
