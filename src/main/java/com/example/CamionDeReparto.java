package com.example;

public class CamionDeReparto extends Transporte {
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String id, double comb, double carga, boolean tieneRefri) {
        super(id, comb, carga);
        this.tieneRefrigeracion = tieneRefri;
    }

    @Override
    public void viajar(int distancia) {
        if (tieneRefrigeracion) {
            double consumo = (distancia / 10.0) * 2;
            setCombustible(getCombustible() - consumo);
        } else {
            super.viajar(distancia);
        }
    }
}
