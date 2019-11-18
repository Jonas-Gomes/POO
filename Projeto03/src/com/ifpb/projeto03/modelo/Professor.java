package com.ifpb.projeto03.modelo;
import com.ifpb.projeto03.Enumerations.Titulacao;

import java.sql.Time;
import java.time.LocalDate;

public class Professor extends Funcionario {

    private Titulacao titulacao;
    private int cargahoraria;

    //Construtor
    public Professor(String cpf, String nome, LocalDate nascimento, float salariobase,
                     Titulacao titulacao, int cargahoraria) {
        super(cpf, nome, nascimento, salariobase);
        this.titulacao = titulacao;
        this.cargahoraria = cargahoraria;
    }

    //Getters
    public Titulacao getTitulacao() { return titulacao; }
    public int getCargahoraria() { return cargahoraria; }

    //Setters
    public void setTitulacao(Titulacao titulacao) { this.titulacao = titulacao; }
    public void setCargahoraria(int cargahoraria) { this.cargahoraria = cargahoraria; }

    public float CalcularPagamento(){
        return getSalariobase() + 10 * cargahoraria;
    }
}
