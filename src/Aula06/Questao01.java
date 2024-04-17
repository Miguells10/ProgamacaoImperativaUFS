package Aula06;

import java.util.Scanner;

//1. Uma loja oferece para os clientes um determinado
//desconto de acordo com o valor da compra efetuada.
//O desconto é de 20%, se o valor da compra for maior
//ou igual a R$250,00 e de 15%, se for menor. Construa
//um programa que, para um grupo de dez clientes,
//        mostre nome, valor da compra, desconto e valor a
//pagar de cada cliente. Determine também o quanto
//a loja arrecadou com esses clientes.
public class Questao01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
int contador = 1, somaTotal = 0;
float valorPagar = 0, desconto = 0;


        while (contador <= 10){
            System.out.println("Qual é seu nome?");
            String nome = input.next();
            System.out.println("Qual foi o valor da sua compra?");
            float valorCompra = input.nextFloat();

            if (valorCompra >= 250.00){
                desconto = 20;
                valorPagar = (valorCompra - (desconto/100) * valorCompra) ;
            }else {
                desconto = 15;
                valorPagar = (valorCompra - (desconto/100) * valorCompra) ;
            }
        System.out.println("Nome do cliente: " + nome + " Valor total: " + valorCompra + " O desconto foi de: " + desconto + "% " + " e o valor a pagar foi de: " + valorPagar + "R$");

        }

    }


}