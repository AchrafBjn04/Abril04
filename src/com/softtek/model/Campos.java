package com.softtek.model;

public class Campos {
    private int x;

    public Campos() {}

    public Campos(int x){
        this.x = x;
    }

    public int muestra(){
        return this.x;
    }

    public void incrementa(){
        ++this.x;
    }
}
