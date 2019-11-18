package com.ifpb.projeto03.modelo;
import java.sql.Time;
import java.time.LocalDate;

public class TecAdm extends Funcionario {

    private String setor;
    private int horaextra;

    //Construtor
    public TecAdm(String cpf, String nome, LocalDate nascimento, float salariobase,
                  String setor, int horaextra) {
        super(cpf, nome, nascimento, salariobase);
        this.setor = setor;
        this.horaextra = horaextra;
    }

    //Getters
    public String getSetor() { return setor; }
    public int getHoraextra() { return horaextra; }

    //Setters
    public void setSetor(String setor) { this.setor = setor; }
    public void setHoraextra(int horaextra) { this.horaextra = horaextra; }

    @Override
    public float CalcularPagamento() {
        return getSalariobase() + 20 * horaextra;
    }
}
