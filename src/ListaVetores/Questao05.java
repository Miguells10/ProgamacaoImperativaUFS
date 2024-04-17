package ListaVetores;
import java.util.*;
/* Escrever um algoritmo que lê um vetor K(15). Crie, a seguir, um vetor P, que contenha
todos os números primos de K. Escreva o vetor P.
 */
public class Questao05 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[15];



        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        if(Primo(vetor[i])){
            System.out.println(vetor[i] + " è primo");
        }


        }
        Arrays.sort(vetor);
        System.out.println(Arrays.toString(vetor));

    }

    static boolean Primo(int numero) {
        if (numero < 1) {
            return false;
        }
        for (int i = 2; i <= numero /2; i++) { // Alteração: iterar até numero / 2
            if (numero % i == 0) {
                return false;
            }

        }
        return true;
    }

}
