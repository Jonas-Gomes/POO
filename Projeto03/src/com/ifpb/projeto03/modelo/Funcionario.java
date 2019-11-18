package com.ifpb.projeto03.modelo;

import java.time.LocalDate;

public abstract class Funcionario {

    private final String cpf;
    private String nome;
    private LocalDate nascimento;
    private float salariobase;

    //Construtor
    public Funcionario(String cpf, String nome, LocalDate nascimento, float salariobase) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.salariobase = salariobase;
    }

    //Getters
    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public LocalDate getNascimento() { return nascimento; }
    public float getSalariobase() { return salariobase; }

    //Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setNascimento(LocalDate nascimento) { this.nascimento = nascimento; }
    public void setSalariobase(float salariobase) { this.salariobase = salariobase; }

    public abstract float CalcularPagamento();
}
