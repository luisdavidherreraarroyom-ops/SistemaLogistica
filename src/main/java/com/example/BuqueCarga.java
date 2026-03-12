package com.example;

public class BuqueCarga extends Transporte {
    private int cantidadContenedores;

    public BuqueCarga(String id, double comb, double carga, int contenedores) {
        super(id, comb, carga);
        this.cantidadContenedores = contenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("Vehículo ID: " + getIdTransporte() + " está listo para descarga.");
    }

    public void mostrarDatos() {
        System.out.println("ID: " + getIdTransporte() + " | Combustible: " + getCombustible() + 
                           " | Contenedores: " + cantidadContenedores);
    }
}