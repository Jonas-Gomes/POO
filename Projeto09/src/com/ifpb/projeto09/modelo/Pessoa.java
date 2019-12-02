package com.ifpb.projeto09.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{

    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public Pessoa(String cpf, String nome, LocalDate nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Pessoa(String cpf){
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf) &&
                Objects.equals(nome, pessoa.nome) &&
                Objects.equals(nascimento, pessoa.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public int compareTo(Pessoa o) {
        return nome.compareTo(o.nome);
    }
}
