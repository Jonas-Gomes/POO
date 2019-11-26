package com.ifpb.exercicio.visao;

import java.lang.reflect.Array;

import static javafx.scene.input.KeyCode.T;

public class App {

    public static void main(String[] args) {

    }

    //Imprime a ordem inversa
    public static <T> void Inverso(T[] array){
        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }

    //Imprime o maior
    public static <T extends Comparable<T>> T Maior(T[] array){
        T Maior = array[0];
        for(T elemento : array){
            if (elemento.compareTo(Maior)>0) Maior = elemento;
        }
        return Maior;
    }
}
