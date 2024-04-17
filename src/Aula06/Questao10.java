package Aula06;//10. Escreva um programa que calcule a média dos
//        números digitados pelo usuário, se eles forem pares.
//        Termine a leitura se o usuário digitar zero (0);


import java.util.Scanner;
public class Questao10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int somaPares = 0, quantidade = 0;
        float mediaPares = 0;


        while(true){
            System.out.println("Digite um numero inteiro par ou impar");
            int numero = input.nextInt();

            if(numero == 0){
                break;
            }


            if(numero % 2 == 0  && numero !=0){
                somaPares += numero;
                quantidade++;

            }

            mediaPares = somaPares/quantidade;

        }

        System.out.println("A media dos numeros pares é: " + mediaPares);

    }

}
