package Aula06;//Escrever um programa que lê 5 valores para A, um de
//cada vez, e conta quantos destes valores são negativos, no
//final imprimir a quantidade e o menor valor.

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeNegativos = 0, menorValor = Integer.MAX_VALUE;



        for(int i = 1; i <=5; i++){
            System.out.println("Qual o valor para A?");
            int numero = input.nextInt();

            if(numero<0){
                quantidadeNegativos++;
            }

            if(menorValor > numero){

                menorValor = numero;
            }

        }
        System.out.println("A quantidade de números negativos é: " + quantidadeNegativos);
        System.out.println("O menor número é: " + menorValor);

    }
}
