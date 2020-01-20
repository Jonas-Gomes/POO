package com.ifpb.exception.visao;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        try {
            metodo1();
            System.out.println("Vamos ver o que acontece 2");
        }
        catch (IOException ex){
            System.out.println("Foi capturada uma IOException");
        }
        catch (NullPointerException ex){
            System.out.println("Foi capturada uma Nullpointerexecption");
        }
        finally {
            System.out.println("Vamos ver o que acontece");
        }
    }

    public static void metodo1() throws IOException {
        metodo2();
    }

    public static void metodo2() throws IOException {
        int array[] = {1,3,5};
        System.out.println(array[3]);
    }

}
