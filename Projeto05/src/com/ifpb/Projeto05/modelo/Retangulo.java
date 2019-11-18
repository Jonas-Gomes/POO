package com.ifpb.Projeto05.modelo;

public class Retangulo extends FormaGeometrica {

    private double ladoa;
    private double ladob;

    public Retangulo(double ladoa, double ladob) {
        this.ladoa = ladoa;
        this.ladob = ladob;
    }

    @Override
    public double CalcularArea(){
        return ladoa * ladob;
    }

    @Override
    public double CalcularPerimetro(){
        return 2 * ladoa + 2 * ladob;
    }

    public double getLadoa() { return ladoa; }
    public double getLadob() { return ladob; }

    public void setLadoa(double ladoa) { this.ladoa = ladoa; }
    public void setLadob(double ladob) { this.ladob = ladob; }
}
