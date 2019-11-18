package com.ifpb.Projeto05.visao;

import com.ifpb.Projeto05.modelo.Círculo;
import com.ifpb.Projeto05.modelo.FormaGeometrica;
import com.ifpb.Projeto05.modelo.Quadrado;

public class App {

    public static void main(String[] args) {

        FormaGeometrica formaGeometrica = new Círculo(2 );

        System.out.println(formaGeometrica.CalcularArea());
        System.out.println(formaGeometrica.CalcularPerimetro());

    }

}
