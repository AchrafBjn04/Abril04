package com.softtek.model;

public class Dado {
    public Dado(){

    }

    public int lanzarDado(){
        return (int)(Math.random() * (6-1)+1);
    }
    public String dibujar(int cara){
        String dado = switch (cara) {
            case 1 -> "   " +
                    "\n * " +
                    "\n   ";
            case 2 -> "    " +
                    "\n * " +
                    "\n   *" +
                    "\n    ";
            case 3 -> "*  " +
                    "\n * " +
                    "\n  *";
            case 4 -> "*   *" +
                    "\n   " +
                    "\n*   *";
            case 5 -> "*   *" +
                    "\n  * " +
                    "\n*   *";
            case 6 -> "*   *" +
                    "\n*   *" +
                    "\n*   *";
            default -> "";
        };

        return dado;
    }
}
