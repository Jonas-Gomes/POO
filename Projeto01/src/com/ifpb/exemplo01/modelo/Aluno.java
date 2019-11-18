package com.ifpb.exemplo01.modelo;

import java.time.LocalDate;

public class Aluno extends Pessoa{

    private String curso;

    //Construtor
    public Aluno(long matricula, String nome, String cpf, LocalDate nascimento, String curso) {

        super(matricula, cpf, nome, nascimento);
        this.curso = curso;

    }

    // Getters
    public String getCurso() { return curso; }

    //Setters
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void ImprimirDados(){
        System.out.println("--- Dados do aluno ---");
        System.out.println("Matricula: "+ getMatricula());
        System.out.println("Nome: "+ getNome());
        System.out.println("CPF: "+ getCpf());
        System.out.println("Nascimento "+ getNascimento());
        System.out.println("Curso: "+ curso);
    }

}