package Atv70Questoes;

import java.util.Scanner;

//47. Três amigos, Carlos, André e Felipe decidiram rachar igualmente a conta de um bar.
//Faça um algo ritmo para ler o valor total da conta e imprimir quanto cada um deve
//pagar, mas faça com que Carlos e André não paguem centavos. Ex: uma conta de R$
//101,53 resulta em R$33,00 para Carlos, R$33,00 para André e R$35,53 para Felipe.
public class Questao43 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor da conta? ");
        float conta = input.nextFloat();

        float racha = conta/3;
        int rachaC = (int) racha;
            float sobraC = racha - rachaC;

        int rachaA = (int) racha;
            float sobraA = racha - rachaA;

        float totalFelipe = racha + sobraC + sobraA;

        System.out.println("Carlos: " + rachaC);
        System.out.println("André: " + rachaA);
        System.out.printf("Felipe: %.2f ", totalFelipe);

    }


}
