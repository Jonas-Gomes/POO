package com.ifpb.Projeto05.modelo;

public class Triangulo extends FormaGeometrica {

    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        return (Math.pow(lado,2) * Math.sqrt(3))/4;
    }

    @Override
    public double CalcularPerimetro() {
        return 3 * lado;
    }

    public double getLado() { return lado; }

    public void setLado(double lado) { this.lado = lado; }
}
