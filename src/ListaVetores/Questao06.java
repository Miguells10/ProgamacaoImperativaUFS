package ListaVetores;

import java.util.Arrays;
import java.util.Random;

public class Questao06 {
    public static void main(String[] args) {
        int[] vetor = new int[20];

        vetor = VetorRandom(vetor);
        Arrays.sort(vetor);

        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            int valorAtual = vetor[i];
            if(valorAtual == Integer.MIN_VALUE) {
                continue;
            }
        int repetições = 1;
            for (int j = i +1; j < vetor.length; j++) {
                if(vetor[j] == valorAtual){
                    repetições++;
                    vetor[j] = Integer.MIN_VALUE;
                }

            }
            System.out.println("Valor: " + valorAtual + ", Ocorrências: " + repetições);

        }




    }

    public static int[] VetorRandom(int[] vetor) {
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10);

        }
        return vetor;

    }

}
