package com.ifpb.Projeto05.modelo;

public class Círculo extends FormaGeometrica {

    private double raio;

    public Círculo(double raio) {
        this.raio = raio;
    }

    @Override
    public double CalcularArea() {
        return Math.PI * Math.pow(raio,2);
    }

    @Override
    public double CalcularPerimetro() {
        return 2 * Math.PI - raio;
    }

    public double getRaio() { return raio; }

    public void setRaio(double raio) { this.raio = raio; }
}
