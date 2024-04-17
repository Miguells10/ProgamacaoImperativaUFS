package ListaVetores;
import java.util.Scanner;
public class JogoBatalhaNaval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[10][5];
        int pontosJogador1 = 0, pontosJogador2 = 0;

        System.out.println("Insira as coordenadas para os navios (linhas e colunas separadas por espaço):");
        for (int i = 0; i < 10; i++) {
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();
            if (linha >= 0 && linha < matriz.length && coluna >= 0 && coluna < matriz[0].length) {
                matriz[linha][coluna] = 1; // Marcando a posição do navio
            } else {
                System.out.println("Coordenadas inválidas. Insira novamente:");
                i--; // Voltar uma iteração para repetir a entrada inválida
            }
        }

        System.out.println("Navios inseridos com sucesso!");

        System.out.println("Mapa após a inserção dos navios:");
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("Player 2 - insira as bombas");
        for (int i = 0; i < 10; i++) {
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();
            if (linha >= 0 && linha < matriz.length && coluna >= 0 && coluna < matriz[0].length) {
                if (matriz[linha][coluna] == 1) {
                    pontosJogador2 += 100;
                    matriz[linha][coluna] = 0;
                }
            } else {
                System.out.println("Coordenadas inválidas. Insira novamente:");
                i--; // Voltar uma iteração para repetir a entrada inválida
            }
        }

        for (int[] ints : matriz) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == 1) {
                    pontosJogador1 += 70;
                }
            }
        }
        System.out.println("Pontos jogador1: "+ pontosJogador1);
        System.out.println("Pontos jogador2: "+ pontosJogador2);

        if (pontosJogador1 > pontosJogador2) {
            System.out.println("Jogador 1 vence com a quantidade de pontos de: " + pontosJogador1);
        } else if (pontosJogador2 > pontosJogador1) {
            System.out.println("Jogador 2 vence com a quantidade de pontos de: " + pontosJogador2);
        } else {
            System.out.println("O jogo terminou em empate.");
        }
    }
}
