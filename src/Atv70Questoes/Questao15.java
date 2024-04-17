package Atv70Questoes;

//15. A imobiliária “Imobiliares” vende apenas terrenos retangulares. Faça um algoritmo
//para ler as dimensões de um terreno e depois exibir a área do terreno.

import java.sql.SQLOutput;
import java.util.Scanner;
public class Questao15 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a largura do terreno: ");
        float largura = input.nextFloat();
        System.out.println("Digite o comprimento do terreno: ");
        float comprimento = input.nextFloat();

        float area = largura * comprimento;

        System.out.println("A área do terreno é: " + area + "m².");


input.close();


    }



}
