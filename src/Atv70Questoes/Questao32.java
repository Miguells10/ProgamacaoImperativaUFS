
        package Atv70Questoes;
//32. Seja a seguinte série: 1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, ... Escreva um algoritmo em Java
//que seja capaz de gerar os N termos dessa série. Esse número N deve ser lido do
//teclado.

import java.util.Scanner;

public class Questao32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos da série: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ", " + (i + 3) + ", " + (i + 3));
            if (i<n){
                System.out.print(", ");
            }


        }

        input.close();
    }
}