package com.ifpb.exemplo01.visao;

import com.ifpb.exemplo01.modelo.Aluno;
import com.ifpb.exemplo01.modelo.Pessoa;
import com.ifpb.exemplo01.modelo.Professor;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Pessoa pessoa = new Professor(123, "123.123.123-12", "Jonas",
                LocalDate.now(), 123123, "Mestrado" );

        Pessoa pessoa2 = new Aluno(123, "Jonas aluno", "123.123.123-21",
                LocalDate.now(), "ADS");

        System.out.println(pessoa.equals(pessoa2));
    }
}
