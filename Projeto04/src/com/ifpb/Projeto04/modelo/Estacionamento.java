package com.ifpb.Projeto04.modelo;

import java.util.Arrays;

public class Estacionamento {

    /*
    TODO
    Criar segunda versão com capacidades
    específicas para cada tipo de veículo
    */


    private Veiculo[] veiculos;
    private int quantidade;

    public Veiculo[] getVeiculos() {
        return Arrays.copyOf(veiculos, quantidade);
    }

    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

    public Estacionamento(){
        veiculos = new Veiculo[100];
        quantidade = 0;
    }

    public boolean Adicionar(Veiculo veiculo){
        if(quantidade == veiculos.length){
            return false;
        }
        else{
            veiculos[quantidade++] = veiculo;
            return true;
        }
    }

    public boolean remover(Veiculo veiculo){
        for (int i = 0; i < quantidade; i++) {
            if (veiculo.equals(veiculos[i])) {
                for (int j = i; j < quantidade - 1; j++) {
                    veiculos[j] = veiculos[j+1];
                }
                quantidade--;
                return true;
            }
        }
        return false;
    }

    public Veiculo buscar(String placa){
        for(int i = 0; i < quantidade; i++) {
            if (veiculos[i].getPlaca().equals(placa)) {
                return veiculos[i];
            }
        }
        return null;
    }

    public int contTipo(Class classe){
        int cont = 0;

        for(int i = 0; i < quantidade; i++){
            if(veiculos[i].getClass() == classe){
                cont++;
            }
        }

        return cont;
    }

}
