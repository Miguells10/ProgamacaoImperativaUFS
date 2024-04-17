package Atv70Questoes;

//Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar
//todos os cavalos comprados para um haras.


import java.util.Scanner;
public class Questao16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de cavalos: ");
        int cavalos = input.nextInt();
        System.out.println("Serão necessárias " + (cavalos * 4) + " ferraduras.");


    }
}
