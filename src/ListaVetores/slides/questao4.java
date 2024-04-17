package ListaVetores.slides;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static ListaVetores.Questao06.VetorRandom;

public class questao4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int[100];
        int soma = 0;

        VetorRandom(vetor);
        System.out.println(Arrays.toString(vetor));

        for (int j : vetor) {
            soma += j;
        }

        int media = soma/ vetor.length;
        System.out.println(media);

        int novo = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]>= media){
                vetor[novo++] = vetor[i];
            }
        }

        int[] novoVetor = new int[novo];
        for (int i = 0; i < novo; i++) {
            novoVetor[i] = vetor[i];
        }

        System.out.println(Arrays.toString(novoVetor));







    }
}
