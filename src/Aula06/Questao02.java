package Aula06;//2.Fazer um programa gere 50 valores e encontre o
//maior e o menor deles, imprimir no final o
//resultado.


import java.util.Random;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;


        for(int i = 0; i <= 50; i++){
            int numeroAleatorio = random.nextInt(100);

            if(numeroAleatorio > maiorNumero){
                maiorNumero = numeroAleatorio;
            }

            if(numeroAleatorio < menorNumero){
                menorNumero =numeroAleatorio;
            }


        }

        System.out.println(maiorNumero);
        System.out.println(menorNumero);


    }


}
