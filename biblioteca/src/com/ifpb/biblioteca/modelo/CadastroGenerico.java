package com.ifpb.biblioteca.modelo;

import java.util.Arrays;

public class CadastroGenerico <T>{

    private T[] objects;
    private int quantidade;

    public CadastroGenerico(){
        objects = (T[]) new Object[100];
        quantidade = 0;
    }

    public boolean salvar(T object){
        if(quantidade >= objects.length){
            return false;
        }
        else{
            objects[quantidade++] = object;
            return true;
        }
    }

    public T[] listar(){
        return Arrays.copyOf(objects, quantidade);
    }
}
