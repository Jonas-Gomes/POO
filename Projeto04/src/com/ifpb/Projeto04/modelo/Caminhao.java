package com.ifpb.Projeto04.modelo;

public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(String placa, String modelo, int ano, int eixos) {
        super(placa, modelo, ano);
        this.eixos = eixos;
    }

    //Getters
    public int getEixos() { return eixos; }

    //Setters
    public void setEixos(int eixos) { this.eixos = eixos; }
}
