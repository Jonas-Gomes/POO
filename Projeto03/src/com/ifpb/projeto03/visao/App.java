package com.ifpb.projeto03.visao;

import com.ifpb.projeto03.Enumerations.Titulacao;
import com.ifpb.projeto03.modelo.Professor;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Professor professor = new Professor("123.123.123-12", "Jonas",
                LocalDate.of(2000, 12, 29), 20000,
                Titulacao.Doutorado, 35);

        System.out.println(professor.getTitulacao());

    }

}
