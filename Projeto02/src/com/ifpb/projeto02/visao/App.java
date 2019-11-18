package com.ifpb.projeto02.visao;

import com.ifpb.projeto02.modelo.ContaCorrente;

public class App {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente("Jonas", 1);
        ContaCorrente c2 = new ContaCorrente("Maria", 1);

        if(c1.Depositar(200)){
            System.out.println("Depositado");
        }
        else{
            System.out.println("Não depositado");
        }

        c2.Depositar(500);

        if(c2.Sacar(3000)){
            System.out.println("Sacado");
        }
        else{
            System.out.println("Saldo insuficiente");
        }

        c2.Transferir(c1, 100);
    }
}
