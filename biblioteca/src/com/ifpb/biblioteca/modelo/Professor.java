package com.ifpb.biblioteca.modelo;

public class Professor extends Pessoa {

    private Float salario;

    public Professor(String cpf, String nome, Float salario) {
        super(cpf, nome);
        this.salario = salario;
    }

}
