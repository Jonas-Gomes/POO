package com.ifpb.Projeto04.modelo;

import java.util.Objects;

public abstract class Veiculo {

    private String placa;
    private String modelo;
    private int ano;

    public Veiculo(String placa, String modelo, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Getters
    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    //Setters
    public void setPlaca(String placa) { this.placa = placa; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAno(int ano) { this.ano = ano; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(placa, veiculo.placa);
    }
    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
