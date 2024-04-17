package Atv70Questoes;

import java.util.Scanner;

//64. 37. Faça um programa que calcule e mostre a tabuada de um número digitado pelo
//usuário.
public class Questao64 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para calcular a tabuada: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }


    }


}
