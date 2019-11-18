package com.ifpb.exemplo01.modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Pessoa {

    private long matricula;
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    //Construtor
    public Pessoa(long matricula, String cpf, String nome, LocalDate nascimento){

        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;

    }

    //Getters
    public long getMatricula() { return matricula; }
    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public LocalDate getNascimento() { return nascimento; }

    //Setters
    public void setMatricula(long matricula) { this.matricula = matricula; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setNome(String nome) { this.nome = nome; }
    public void setNascimento(LocalDate nascimento) { this.nascimento = nascimento; }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return matricula == pessoa.matricula &&
                Objects.equals(cpf, pessoa.cpf) &&
                Objects.equals(nome, pessoa.nome) &&
                Objects.equals(nascimento, pessoa.nascimento);
    }

    @Override
    public int hashCode(){
        return Objects.hash();
    }

    @Override
    public String toString(){
        return "pessoa{" +
                "matricula = "+ matricula+
                "\', cpf = "+ cpf+
                "\', nome = "+ nome+
                "\', nascimento = '"+ nascimento+
                "\'" + "}";
    }
}
