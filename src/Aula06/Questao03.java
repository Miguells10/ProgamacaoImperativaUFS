package Aula06;//3. Faça um programa que leia uma quantidade não
//determinada de números positivos. Calcule a quantidade
//de números pares e ímpares, a média de valores pares e a
//média geral dos números lidos. O número que encerrará a
//leitura será zero;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float mediaValoresPares = 0, mediaGeral = 0, quantidadePares = 0, somaPares = 0, quantidadeImpar = 0,
                somaImpar = 0;
        boolean continuarPrograma = true;

        while (continuarPrograma) {
            System.out.println("Qual o número positivo? ");
            int numero = input.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                somaPares += numero;
                quantidadePares++;

                mediaValoresPares = somaPares / quantidadePares;

            } else if (numero != 0) {
                somaImpar += numero;
                quantidadeImpar++;

            }

            mediaGeral = (somaImpar + somaPares) / (quantidadePares + quantidadeImpar);

            if (numero == 0) {
                continuarPrograma = false;
            }

        }

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpar);
        System.out.println("Média valores pares: " + mediaValoresPares);
        System.out.println("Média geral: " + mediaGeral);

        input.close();

    }

}
