package com.ifpb.projeto09.visao;
import com.ifpb.projeto09.modelo.Pessoa;

import java.time.LocalDate;
import java.util.*;

public class App {

    public static void main(String[] args) {

        operacoesFilas();

    }

    private static void operacoesCollections(){



    }

    private static void operacoesFilasDuplas(){

        Deque<String> filaDupla = new LinkedList<>();

        filaDupla.offer("jose");
        filaDupla.offerFirst("ester");
        filaDupla.offerLast("homero");

        while (!filaDupla.isEmpty()){
            System.out.println(filaDupla.poll());
        }

    }

    private static void operacoesFilas(){

        Queue<Pessoa> pessoas = new LinkedList<>();

        pessoas.add(new Pessoa("211.111.111-11", "jose", LocalDate.now()));
        pessoas.add(new Pessoa("122.222.222-22", "ester", LocalDate.now()));
        pessoas.add(new Pessoa("211.111.111-11", "homero", LocalDate.now()));

        System.out.println("Cabeça: "+ pessoas.peek());

        while (!pessoas.isEmpty()){
            System.out.println(pessoas.poll());
        }

    }

    private static void operacoesConjuntosOrdenados(){

        Set<Pessoa> pessoas = new TreeSet<>();

        //Ordenando pelo CPF pelo comparable em ordem crescente
        pessoas.add(new Pessoa("211.111.111-11", "jose", LocalDate.now()));
        pessoas.add(new Pessoa("122.222.222-22", "ester", LocalDate.now()));
        pessoas.add(new Pessoa("211.111.111-11", "homero", LocalDate.now()));

        System.out.println(pessoas);

    }

    private static void operacoesConjuntos(){

        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa("111.111.111-11", "Jose", LocalDate.now()));
        pessoas.add(new Pessoa("222.222.222-22", "ester", LocalDate.now()));
        pessoas.add(new Pessoa("333.333.333-33", "homero", LocalDate.now()));

        System.out.println(pessoas);

    }

    public static boolean ehBalanceada(String equacao){

        Stack<String> pilha = new Stack<>();

        for (int i=0; i<equacao.length(); i++){
            if (equacao.charAt(i) == '('){
                pilha.push("aaa");
            }
            else if (equacao.charAt(i) == ')'){
                if (pilha.isEmpty()) return false;
                pilha.pop();
            }
        }
        return pilha.isEmpty();

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
