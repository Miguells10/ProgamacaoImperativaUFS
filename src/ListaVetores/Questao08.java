package ListaVetores;
/*Faça um algoritmo que leia um vetor A[10]. Preencha então um vetor B[10] com o
fatorial de cada valor de “A” respeitando as posições, caso o referido valor for positivo
ou nulo. Substitua no final os valores negativos por 0 (zero). Mostre o vetor B.*/


import java.util.Arrays;
import java.util.Random;
import static ListaVetores.Questao06.VetorRandom;

public class Questao08 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];


        //Preenchendo o vetor A
        Random random = new Random();
        vetorA = VetorRandom(vetorA);
        Arrays.sort(vetorA);
        System.out.println(Arrays.toString(vetorA)); //Imprimindo o vetor A organizado, com valores de 0 a 50.


        for (int i = 0; i < vetorA.length; i++) {
            if(vetorA[i] >= 0){
                vetorB[i] = Fatorial(vetorA[i]);
            }
            else {
                vetorB[i]= 0;
            }


        }

        Arrays.sort(vetorB);
        System.out.println(Arrays.toString(vetorB));




    }

    public static int Fatorial(int numero){
        if(numero==0 || numero ==1){
            return 1;
        } else return numero *Fatorial(numero-1);
    }

}
