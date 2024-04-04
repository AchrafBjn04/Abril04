package com.softtek.presentacion;

import com.softtek.model.Dado;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dado d = new Dado();
        String respuesta = "";

        do{
            int cara = d.lanzarDado();
            System.out.println(d.dibujar(cara));

            System.out.print("Lanzar? (S/N): ");
            respuesta = sc.nextLine();
        }while(respuesta.toUpperCase().equals("S"));
    }
}
