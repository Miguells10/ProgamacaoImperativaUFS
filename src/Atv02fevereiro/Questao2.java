package Atv02fevereiro;

// Faça um programa em Java para:
//  Ler 2 números inteiros; (0,2)
//  Calcular e imprimir corretamente o MDC entre os números lidos. (3,8)

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, mdc = 0;

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        input.close();

        for (int i = 1; i <= numero1 && i <= numero2; i++) {
            if (numero1 % i == 0 && numero2 % i == 0) {
                mdc = i;
            }
        }
        System.out.println("O MDC entre " + numero1 + " e " + numero2 + " é " + mdc);
    }
}

