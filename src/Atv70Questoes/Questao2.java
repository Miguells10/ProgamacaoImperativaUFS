package Atv70Questoes;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int numero1 = input.nextInt();

        verificarSinal(numero1);
        verificarParidade(numero1);
    }

    public static void verificarSinal(int numero1) {
        if (numero1 > 0) {
            System.out.println("Ele é positivo");
        } else if (numero1 < 0) {
            System.out.println("Ele é negativo");
        } else {
            System.out.println("Ele é zero");
        }
    }
    
    public static void verificarParidade(int numero1) {
        if (numero1 == 0) {
            System.out.println("Ele é zero");
        } else if (numero1 % 2 == 0) {
            System.out.println("Ele é par");
        } else {
            System.out.println("Ele é ímpar");
        }
    }
}
