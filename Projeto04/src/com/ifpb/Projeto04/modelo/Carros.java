package com.ifpb.Projeto04.modelo;

public class Carros extends Veiculo {

    private int lugares;

    public Carros(String placa, String modelo, int ano, int lugares) {
        super(placa, modelo, ano);
        this.lugares = lugares;
    }

    //Getters
    public int getLugares() { return lugares; }

    //Setters
    public void setLugares(int lugares) { this.lugares = lugares; }
}
