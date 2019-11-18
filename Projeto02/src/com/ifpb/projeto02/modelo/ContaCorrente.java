package com.ifpb.projeto02.modelo;

public class ContaCorrente {

    //Atributos
    private final String titular;
    private final int agencia;
    private final int conta;
    private float saldo;
    private static int contConta;

    public ContaCorrente(String titular, int agencia, int conta, float saldo) {
        this.titular = titular;
        this.agencia = agencia;
        //inicializa o número da conta conforme a quantidade de contas existentes
        this.conta = ++contConta;
        this.saldo = 0;
    }

    //Getters
    public String getTitular(){ return titular; }
    public int getAgencia(){ return agencia; }
    public int getConta(){ return conta; }
    public float getSaldo(){ return saldo; }

    //Funções
    public boolean Sacar(float valor){
        if(valor > saldo){
            return false;
        }
        else{
            saldo -= valor;
            return true;
        }
    }

    public boolean Depositar(float valor){
        if(valor < 0){
            return false;
        }
        else{
            saldo += valor;
            return true;
        }
    }

    public boolean Transferir(ContaCorrente destino, float valor){
        if(valor > saldo){
            return false;
        }
        else{
            return sacar(valor) && destino.depositar(valor);
        }
    }

}
