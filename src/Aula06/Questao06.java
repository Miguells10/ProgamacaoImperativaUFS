package Aula06;//Faça um programa para ler o código, descrição,
// estoque mínimo e estoque das mercadorias de um
// supermercado, onde o Flag será um código igual a
//  zero (0). Escreva o código e a descrição das
//  mercadorias com o estoque abaixo do mínimo.

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continuarPrograma = true;

        while (continuarPrograma) {

            System.out.println("Qual o código do produto? (Digite 0 para encerrar.) ");
            int codigo = input.nextInt();

                if (codigo == 0) {
                    System.out.println("Panificadora Ideal agradece");
                    break;
                }

            System.out.println("Digite a descrição do pedido: ");
            String descrição = input.next();

            System.out.println("Qual é o estoque do produto? ");
            int estoque = input.nextInt();

            System.out.println("Qual é o estoque mínimo do produto? ");
            int estoqueMinimo = input.nextInt();

            if (estoque < estoqueMinimo) {
                System.out.println("Produto em falta.");
                System.out.println("Código do produto: " + codigo);
                System.out.println("Descrição: " + descrição);
            }

            if (estoque > estoqueMinimo) {
                System.out.println("Produto acima do mínimo.");
                System.out.println("Código do produto: " + codigo);
                System.out.println("Descrição: " + descrição);
            }

        }

    }

}