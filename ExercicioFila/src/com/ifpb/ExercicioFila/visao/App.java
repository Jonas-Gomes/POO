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

        int i=0;

        //Cria a fila normal
        Queue<Pessoa> filaNormal = new LinkedList<>();

        filaNormal.offer(new Pessoa("111.111.111-01", "Jonas", LocalDate.now()));
        filaNormal.offer(new Pessoa("222.222.222-02", "João", LocalDate.now()));
        filaNormal.offer(new Pessoa("333.333.333-03", "Daniel", LocalDate.now()));

        //Cria a fila prioritária
        Queue<Pessoa> filaPrioritaria = new LinkedList<>();

        filaPrioritaria.offer(new Pessoa("444.444.444-04", "João", LocalDate.now()));
        filaPrioritaria.offer(new Pessoa("555.555.555-05", "Paula", LocalDate.now()));

        while (!filaPrioritaria.isEmpty()){

            //Imprime 3 itens da fila prioritária
            while (i <= 2){
                if (filaPrioritaria.peek() == null) {
                    break;
                }
                else {
                    System.out.println("fila preferencial: " + filaPrioritaria.poll());
                    i++;
                }
            }
            //Ao imprimir 3 itens da fila prioritária, imrpime um da fila normal
            System.out.println("fila normal: " + filaNormal.poll());
            i = 0;
        }

        while (!filaNormal.isEmpty()){
            System.out.println("fila normal: " + filaNormal.poll());
        }



    }

}