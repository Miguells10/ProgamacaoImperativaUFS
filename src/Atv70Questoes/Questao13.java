package Atv70Questoes;

// 13. Um vendedor necessita de um programa que calcule o preço total devido por um
// cliente. O programa deve receber o código de um produto e a quantidade comprada e
// calcular o preço total, usando a tabela abaixo. Mostrar uma mensagem no caso de
// código inválido.

import java.util.Scanner;

public class Questao13 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual o código do produto que você deseja comprar?");
        int code = input.nextInt();
        System.out.println("Qual a quantidade de produtos que você deseja comprar?");
        int quantidade = input.nextInt();

        switch (code) {
            case 987:
                System.out.println("O valor total da compra é: " + quantidade * 5.32);
                break;

            case 1001:
                System.out.println("O valor total da compra é: " + quantidade * 5.32);
                break;

            case 1324:
                System.out.println("O valor total da compra é: " + quantidade * 6.45);
                break;

            case 6548:
                System.out.println("O valor total da compra é: " + quantidade * 2.37);
                break;

            case 7623:
                System.out.println("O valor total da compra é: " + quantidade * 6.45);
                break;

            default:
                System.out.println("Código inválido");
                break;


        }


        input.close();
    }

}
