package com.softtek.model;

public class Tabla {
    private final int NUMERO;

    public Tabla(int tabla){
        this.NUMERO = tabla;
    }

    public String mostrarTabla(){
        String resultados = "";

        for (int i = 1; i <= 10; i++) {
            resultados = this.NUMERO + " x " + i + " = " + this.NUMERO *i + "\n";
        }
        return resultados;
    }
}
