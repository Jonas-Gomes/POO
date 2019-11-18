package com.ifpb.biblioteca.modelo;

public class Livro {

    private String isbn;
    private String titulo;
    private int quantidadeExemplares;

    public Livro(String isbn, String titulo, int quantidadeExemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.quantidadeExemplares = quantidadeExemplares;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidadeExemplares() {
        return quantidadeExemplares;
    }

    public void setQuantidadeExemplares(int quantidadeExemplares) {
        this.quantidadeExemplares = quantidadeExemplares;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", quantidadeExemplares=" + quantidadeExemplares +
                '}';
    }
}
