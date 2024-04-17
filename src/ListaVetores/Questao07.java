package ListaVetores;

import java.util.Arrays;
import java.util.Scanner;

/*Uma locadora de vídeos tem guardada, em um vetor de 500 posições, a quantidade de
filmes retirados por seus clientes durante o ano de 1993. Agora, esta locadora está
fazendo uma promoção e, para cada 10 filmes retirados, o cliente tem direito a uma
locação grátis. Faça um algoritmo que crie um outro vetor contendo a quantidade de
locações gratuitas a que cada cliente tem direito.*/

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetorClientes = new String[500];
        int[] vetorFilmes = new int[500];
        int[] locacaoGratuita = new int[50];

        System.out.println(Arrays.toString(vetorFilmes));

        int filmesLocados = 0;

        for (int i = 0; i < vetorClientes.length; i++) {
            System.out.println("Qual seu nome? ");
            vetorClientes[i] = scanner.next();
            System.out.println("Quantos filmes você deseja locar?");
            filmesLocados = scanner.nextInt();
            locacaoGratuita[i] = filmesLocados / 10;

            vetorFilmes[i] = filmesLocados;
            int[] locacoesGratuitasNaoNulas = removeZeros(locacaoGratuita);

            System.out.println(Arrays.toString(vetorFilmes));
            System.out.println("Clientes e número de locações gratuitas:");
            System.out.println(vetorClientes[i] + ": " + (Arrays.toString(locacoesGratuitasNaoNulas)) + " locações gratuitas");

        }
        System.out.println(Arrays.toString(vetorClientes));

    }

    public static int[] removeZeros(int[] vetor) {
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                count++;
            }
        }
        int[] resultado = new int[count];
        count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                resultado[count] = vetor[i];
                count++;
            }
        }
        return resultado;

}
}


