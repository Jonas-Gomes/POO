package com.ifpb.Projeto04.visao;

import com.ifpb.Projeto04.modelo.*;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();

        estacionamento.Adicionar(new Caminhao("JJJ-8888", "Volvo", 2015, 5));
        estacionamento.Adicionar(new Motos("ABC-1233", "Fan", 2015, 150));
        Veiculo a = new Carros("ABC-4321", "Ford", 2000, 5);

        estacionamento.Adicionar(a);

        estacionamento.remover(a);

        System.out.println(estacionamento.contTipo(Motos.class));

        System.out.println(Arrays.toString(estacionamento.getVeiculos()));
    }

}
