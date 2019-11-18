package com.ifpb.biblioteca.visao;

import com.ifpb.biblioteca.modelo.CadastroGenerico;
import com.ifpb.biblioteca.modelo.Livro;
import com.ifpb.biblioteca.modelo.Usuario;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        CadastroGenerico<Livro> livros = new CadastroGenerico<>();
        livros.salvar(new Livro("12345", "Meu livro", 20));
        livros.salvar(new Livro("12346", "Meu livro, 2", 20));
        livros.salvar(new Livro("12346", "Meu livro, 3", 20));
    }

}
