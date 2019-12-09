package com.ifpb.ExercicioFila.visao;

import com.ifpb.ExercicioFila.modelo.Pessoa;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {

        imprimirFilas();

    }

    private static void imprimirFilas() {

        //Cria a fila normal
        Queue<Pessoa> filaNormal = new LinkedList<>();

        filaNormal.offer(new Pessoa("111.111.111-01", "Jonas", LocalDate.now()));
        filaNormal.offer(new Pessoa("222.222.222-02", "João", LocalDate.now()));
        filaNormal.offer(new Pessoa("333.333.333-03", "Daniel", LocalDate.now()));

        //Cria a fila prioritária
        Queue<Pessoa> filaPrioritaria = new LinkedList<>();

        filaPrioritaria.offer(new Pessoa("444.444.444-04", "João", LocalDate.now()));
        filaPrioritaria.offer(new Pessoa("555.555.555-05", "Paula", LocalDate.now()));
        filaPrioritaria.offer(new Pessoa("666.666.666-06", "Leusivan", LocalDate.now()));
        filaPrioritaria.offer(new Pessoa("777.777.777-07", "Valdir", LocalDate.now()));
        filaPrioritaria.offer(new Pessoa("888.888.888-08", "Damião", LocalDate.now()));
        filaPrioritaria.offer(new Pessoa("999.999.999-09", "Neide", LocalDate.now()));
        filaPrioritaria.offer(new Pessoa("123.123.123-12", "Seu Zé", LocalDate.now()));
        filaPrioritaria.offer(new Pessoa("321.321.321-32", "Dona Maria", LocalDate.now()));
        filaPrioritaria.offer(new Pessoa("213.213.213-13", "Dona Chica", LocalDate.now()));

        while (!filaPrioritaria.isEmpty()){

            //Imprime 3 itens da fila prioritária
            for (int i=0; i<=2; i++) {
                System.out.println("fila preferencial: " + filaPrioritaria.poll());
            }
            //Ao imprimir 3 itens da fila prioritária, imrpime um da fila normal
            System.out.println("fila normal: " + filaNormal.poll());

        }

    }

}