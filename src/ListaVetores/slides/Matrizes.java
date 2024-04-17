package ListaVetores.slides;
import java.security.SecureRandom;
import java.util.Arrays;

import static ListaVetores.Questao06.VetorRandom;

public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = new SecureRandom().nextInt(10);

            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" | " + matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("Diagonal principal");
        for (int i = 0; i < 4; i++) {
            System.out.print(" - " + matriz[i][i]);

        }
        System.out.println();

        System.out.println("Diagonal secundária");
        for (int i = 0; i < matriz.length ; i++) {
            System.out.print(" - " + matriz[i][matriz.length - i -1]);

            }
        System.out.println();
        System.out.println();


        //Imprimir 2 vetores random
        int[] vetorA = new int[5];
        VetorRandom(vetorA);
        int[] vetorB = new int[5];
        VetorRandom(vetorB);
        int[] vetorC = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if(vetorA[i] == vetorB[j]){
                    vetorC[i] = vetorA[i];
                    break;
            }
            }
        }
        Arrays.sort(vetorA);
        Arrays.sort(vetorB);
        Arrays.sort(vetorC);

        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
        System.out.println(Arrays.toString(vetorC));



    }

    }