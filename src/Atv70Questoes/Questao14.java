package Atv70Questoes;

import java.util.Scanner;

//14. Ler um número inteiro, e verificar se o número corresponde a um mês válido no
//calendário e escrever o nome do mês, senão escrever uma mensagem ‘Mês Inválido’.

public class Questao14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número corrspondente ao mês: (Ex: 1 para Janeiro, 2 para Fevereiro");
        int mes = input.nextInt();

        switch (mes){

            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido");

        }


    }


}
