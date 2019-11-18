package com.ifpb.Projeto05.modelo;


public class Quadrado extends FormaGeometrica {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea(){
        return Math.pow(lado,2);
    }

    @Override
    public double CalcularPerimetro(){
        return lado * 4;
    }

    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }
}
