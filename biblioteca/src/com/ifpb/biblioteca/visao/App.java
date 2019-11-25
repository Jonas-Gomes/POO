package com.ifpb.biblioteca.visao;

import com.ifpb.biblioteca.modelo.CadastroGenerico;
import com.ifpb.biblioteca.modelo.Pessoa;
import com.ifpb.biblioteca.modelo.Usuario;
import java.time.LocalDate;


public class App {

    public static void main(String[] args) {

        //WILDCARD
        CadastroGenerico<? extends Pessoa> pessoas;
        CadastroGenerico<Pessoa> strings = new CadastroGenerico<>();

        pessoas = strings;

    }

    public static <T> void Imprimir(T[] array){

        for (T e: array){
            System.out.println(e);
        }

    }
}
