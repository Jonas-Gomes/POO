package com.ifpb.mega.modelo;

import java.util.Scanner;

public abstract class Jogo {

    public static void FazerJogo(){

        float valor = 0;
        int numeros = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos jogos voce deseja fazer?");
        int quantidade = sc.nextInt();

        int jogos[][] = new int[15][15];

        for(int i = 0; i < quantidade; i++){
            System.out.println("Qunatos numeros de 6 a 15 voce quer jogar no jogo "+ i + "?");
            numeros = sc.nextInt();

            System.out.println("Quais numeros de 1 a 60 voce quer jogar no jogo "+ i + "?");
            for(int x = 0;x < numeros; x++){
                jogos[i][x] = sc.nextInt();
                for(int y = 0;y < x; y++){
                    if(jogos[i][x] == jogos[i][y]) {
                        System.out.println("Os numeros não podem se repetir, digite-os novamente");
                        x = -1;
                    }
                }
            }

            switch (numeros){
                case 6:
                    valor = (float) (valor + 3.50);
                    break;
                case 7:
                    valor = (float) (valor + 24.50);
                    break;
                case 8:
                    valor =  (valor + 98);
                    break;
                case 9:
                    valor =  (valor + 294);
                    break;
                case 10:
                    valor =  (valor + 735);
                    break;
                case 11:
                    valor =  (valor + 1617);
                    break;
                case 12:
                    valor =  (valor + 3234);
                    break;
                case 13:
                    valor =  (valor + 6006);
                    break;
                case 14:
                    valor = (float) (valor + 10510.50);
                    break;
                case 15:
                    valor = (float) (valor + 17517.50);
                    break;
                default:
                break;
            }
        }
        for(int i = 0;i < quantidade;i++){
            System.out.print("jogo "+ i + ":");
            for(int x = 0;x < numeros;x++) {
                System.out.print(jogos[i][x] + ", ");
            }
            System.out.println("\n");
        }
        System.out.println("valor total: R$"+ valor);
    }
}