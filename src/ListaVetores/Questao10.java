package ListaVetores;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        matriz = MatrizRandom(5,5);

        imprimirMatriz(matriz);

        int somarLinhas = somarLinha(matriz, 3);
        System.out.println("Soma linha:" + somarLinhas);

        int somarColunas = somarColuna(matriz, 1);
        System.out.println("Soma coluna: " + somarColunas);

        int somaDiagPrinc = somarDiagonalPrincipal(matriz);
        System.out.println("Soma diagonal principal: " + somaDiagPrinc);

        int somaDiagonalSecundaria = somarDiagonalSecundaria(matriz);
        System.out.println("Soma diagonal secundaria: " + somaDiagonalSecundaria);

        int somaTudo = somarTudo(matriz);
        System.out.println("Soma geral: " + somaTudo);



    }
    public static int somarTudo(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            soma +=somarColuna(matriz,i);
        }
        return soma;
    }


    public static int somarDiagonalSecundaria(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz[0].length; i++) {
                soma+= matriz[i][matriz.length - i -1];
        }
        return soma;
    }

    public static int somarDiagonalPrincipal(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz[0].length; i++) {
                soma+= matriz[i][i];
        }
        return soma;
    }

    public static int somarLinha(int[][] matriz, int linha) {
        int soma = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            soma += matriz[linha][j];
        }
        return soma;
    }

    // Método para somar os elementos de uma coluna em uma matriz
    public static int somarColuna(int[][] matriz, int coluna) {
        int soma = 0;
        int i;
        for (i = 0; i < matriz.length; i++) {
            soma += matriz[i][coluna];

        }
        return soma;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula uma linha após cada linha da matriz
        }
    }


    public static int[][] MatrizRandom(int linhas, int colunas) {
        Random random = new Random();
        int[][] matriz = new int[linhas][colunas]; // Cria a matriz com o tamanho especificado

        // Preenche a matriz com números aleatórios
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(3); // Gera um número aleatório entre 0 e 49
            }
        }

        return matriz; // Retorna a matriz preenchida
    }
}
