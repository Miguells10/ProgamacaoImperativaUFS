package Atv70Questoes;

//Faça um programa que receba o número de horas trabalhadas, o valor do salário
//        mínimo e o número de horas extras trabalhadas. Calcule e mostre o salário a receber
//        seguindo as regras a seguir:
//
//        a) a hora trabalhada vale % do salário mínimo;
//        b) a hora extra vale 1,4 do salário mínimo;
//        c) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
//        hora trabalhada;
//        d) a quantia a receber pelas horas extras equivale ao número de horas extras trabalha
//        das multiplicado pelo valor da hora extra;
//        e) o salário a receber equivale ao salário bruto mais a quantia a receber pelas horas
//        extras.


import java.util.Scanner;

public class Questao66 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = input.nextInt();
        System.out.println("Digite o valor do salário mínimo: ");
        float salarioMinimo = input.nextFloat();
        System.out.println("Digite o número de horas extras trabalhadas: ");
        int horasExtras = input.nextInt();

        float valorHora = salarioMinimo/horasTrabalhadas;
        float valorExtra = (valorHora * 2);

        float percentualHoraTrabalhada = (valorHora * 100)/salarioMinimo;
        float percentualHoraExtra = (valorExtra * 100)/salarioMinimo;
        float salarioBruto = valorHora * horasTrabalhadas;
        float salarioExtra = valorExtra * horasExtras;
        float salarioTotal = salarioExtra + salarioBruto;

        System.out.printf("O valor da hora trabalhada é R$%.2f, que equivale a %.2f%% do salário mínimo.\n", valorHora, percentualHoraTrabalhada);
        System.out.printf("O valor da hora extra é R$%.2f, que equivale a %.2f%% do salário mínimo.\n", valorExtra, percentualHoraExtra);
        System.out.printf("O salário bruto é R$%.2f.\n", salarioBruto);
        System.out.printf("O salário extra é R$%.2f.\n", salarioExtra);
        System.out.printf("O salário total é R$%.2f.\n", salarioTotal);




    }

}
