package Atv70Questoes;

import java.util.Scanner;

//Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu
//poupar. Faça um algo ritmo para ler a quantidade de cada tipo de moeda, e imprimir
//o valor total economizado, em reais. Considere que existam moedas de 1, 5, 10, 25 e
//
//50 centavos, e ainda moedas de 1 real. Não havendo moeda de um tipo, a quantidade
//respectiva é zero.
public class Questao54 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Quantas moedas de 1 centavo? ");
        int moeda1 = input.nextInt();
        System.out.println("Quantas moedas de 5 centavos? ");
        int moeda5 = input.nextInt();
        System.out.println("Quantas moedas de 10 centavos? ");
        int moeda10 = input.nextInt();
        System.out.println("Quantas moedas de 25 centavos? ");
        int moeda25 = input.nextInt();
        System.out.println("Quantas moedas de 50 centavos? ");
        int moeda50 = input.nextInt();
        System.out.println("Quantas moedas de 1 real? ");
        int moeda1real = input.nextInt();

        float total = (moeda1*0.01f) + (moeda5*0.05f) + (moeda10*0.10f) + (moeda25*0.25f) + (moeda50*0.50f) + moeda1real;

        System.out.printf("Total economizado: R$%.2f", total);

    }

}
