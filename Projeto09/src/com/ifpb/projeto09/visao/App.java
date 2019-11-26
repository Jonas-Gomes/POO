package com.ifpb.projeto09.visao;
import com.ifpb.projeto09.modelo.Pessoa;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        //Create
        pessoas.add(new Pessoa("111.111.111-11", "José",
                LocalDate.of(1999, 01 , 03)));
        pessoas.add(0, new Pessoa("222.222.222-22", "Maria",
                LocalDate.of(2000, 02, 04)));

        for (Pessoa p : pessoas){
            System.out.println(p);
        }

        //Remove
        pessoas.remove(0);
        System.out.println(pessoas);

    }

    public static void operacoesPilha() {

        Stack<String> palavras = new Stack<>();
        palavras.push("José");
        palavras.push("Maria");
        palavras.push("Ana");

        while (palavras.isEmpty()){
            System.out.println(palavras.pop());
        }

    }

}
