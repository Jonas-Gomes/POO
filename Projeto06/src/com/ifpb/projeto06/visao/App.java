package com.ifpb.projeto06.visao;

public class App {

    public static void main(String[] args) {

        int[][] arrayMultidimensional = new int[3][];

        arrayMultidimensional[0] = new int[4];
        arrayMultidimensional[1] = new int[5];
        arrayMultidimensional[2] = new int[2];

        int[][] arrayMulti2 =  {{2,3,5}, {1,2,3,4}, {5,3,2,4,6,7,0}};

        for (int x = 0; x<arrayMulti2.length; x++){
            for (int z = 0; z<arrayMulti2[x].length; z++){
                System.out.print(arrayMulti2[x][z]+ " ");
            }
            System.out.println();
        }
    }
    public static void imprimir(int... elementos) {
        for (int x : elementos) {
            System.out.println(x);
        }
    }
}
