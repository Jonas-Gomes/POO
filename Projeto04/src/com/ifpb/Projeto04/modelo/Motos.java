package com.ifpb.Projeto04.modelo;

public class Motos extends Veiculo {

    private int cilindradas;

    public Motos(String placa, String modelo, int ano, int cilindradas) {
        super(placa, modelo, ano);
        this.cilindradas = cilindradas;
    }

    //Getters
    public int getCilindradas() { return cilindradas; }

    //Setters
    public void setCilindradas(int cilindradas) { this.cilindradas = cilindradas; }
}
