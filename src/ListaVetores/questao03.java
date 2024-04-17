package ListaVetores;
import java.util.*;

//Escreva um algoritmo que leia um vetor de 20 posições e mostre- o. Em seguida,
//troque o primeiro elemento com o último, o segundo com o penúltimo, o terceiro com
//        o antepenúltimo, e assim sucessivamente. Mostre o novo vetor depois da troca.
public class questao03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[20];

        for (int i = 0; i < 20; i++) {
            vetor[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < vetor.length/2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length -i -1];
            vetor[vetor.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(vetor));

    }



}