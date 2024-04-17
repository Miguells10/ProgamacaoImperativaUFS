package ListaVetores;

import java.util.*;
//Faça um algoritmo que leia um vetor K[30]. Troque a seguir, todos os elementos de
//ordem ímpar do vetor com os elementos de ordem par imediatamente posteriores.

public class Questao02 {
    public static void main(String[] args) {
        int [] vetor = new int[30];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(vetor));

        for (int i = 1; i < vetor.length; i += 2) {
            if (i + 1 < vetor.length) {
                int temp = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = temp;
            }
        }
        System.out.println("Vetor após a troca:");
        System.out.println(Arrays.toString(vetor));

    }
}
