package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CamionDeReparto camion = new CamionDeReparto("CAM-001", 50.0, 5000.0, true);
        BuqueCarga buque = new BuqueCarga("BUQ-99", 200.0, 100000.0, 50);

        System.out.println("--- Prueba de Fuego ---");
        camion.setCombustible(-20);
        System.out.println("Combustible tras intentar asignar -20: " + camion.getCombustible()); 

        camion.setCombustible(50.0);

        System.out.println("\n--- Demostración de Polimorfismo ---");
        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        for (Transporte t : flota) {
            t.viajar(100);
            System.out.println("Transporte " + t.getIdTransporte() + " - Combustible restante: " + t.getCombustible());
        }
    }
}