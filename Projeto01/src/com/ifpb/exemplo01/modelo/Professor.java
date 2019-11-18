package com.ifpb.exemplo01.modelo;

import java.time.LocalDate;

public class Professor extends Pessoa{

    private float salario;
    private String titulacao;

    //construtor
    public Professor(long matricula, String cpf, String nome, LocalDate nascimento, float salario, String titulacao){
        super(matricula, cpf, nome, nascimento);
        this.salario = salario;
        this.titulacao = titulacao;

    }

    //Getters
    public float getSalario() { return salario; }
    public String getTitulacao() { return titulacao; }

    //Setters
    public void setSalario(float salario) { this.salario = salario; }
    public void setTitulacao(String titulacao) { this.titulacao = titulacao; }

    @Override
    public void ImprimirDados(){
        System.out.println("--- Dados do professor ---");
        System.out.println("Matricula:"+ getMatricula());
        System.out.println("CPF"+ getCpf());
        System.out.println("Nome"+ getNome());
        System.out.println("Nascimento"+ getNascimento());
        System.out.println("Salário:"+ salario);
        System.out.println("Titulacao"+ titulacao);
    }

}
