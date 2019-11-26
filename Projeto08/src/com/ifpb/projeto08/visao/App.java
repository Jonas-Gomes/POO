package com.ifpb.projeto08.visao;

import com.ifpb.projeto08.modelo.Pessoa;

import java.time.LocalDate;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Pessoa[] pessoas = {
                new Pessoa("111.111.111-11", "José", LocalDate.of(1999, 01, 02)),
                new Pessoa("222.222.222-22", "Maria", LocalDate.of(2000, 02, 03)),
                new Pessoa("333.333.333-33", "Dave", LocalDate.of(2001, 03, 04)),
        };

        Arrays.sort(pessoas);
        System.out.println(Arrays.toString(pessoas));

    }

}
