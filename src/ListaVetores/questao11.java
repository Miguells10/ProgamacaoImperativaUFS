package ListaVetores;

public class questao11 {
    public static void main(String[] args) {
        char[][] matriz = new char[12][12];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = i; j < matriz.length; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j >= matriz[i].length - 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();


        for(int i = 0; i < matriz.length; i++) {//enche a matriz para fazer a terceira imagem e a quarta imagem
            for (int j = i; j < matriz.length - i; j++) {
                matriz[i][j] = '*';// matriz[0][0] = matriz[0][11] = matriz[1][1] = matriz[1][10] = matriz[2][2] = matriz[2][9] = matriz[3][3] = matriz[3][8] = matriz[4][4] = matriz[4][7] = matriz[5][5] = matriz[6][6] = matriz[6][6] = matriz[7][4] = matriz[7][7] = matriz[8][3] = matriz[8][8] = matriz[9][2] = matriz[9][9] = matriz[10][1] = matriz[10][10] = matriz[11][0] = matriz[11][11] = '*'
                matriz[(matriz.length - 1) - i][j] = '*';// matriz[11][0] = matriz[11][11] = matriz[10][0] = matriz[10][11] = matriz[9][0] = matriz[9][11] = matriz[8][0] = matriz[8][11] = matriz[7][0] = matriz[7][11] = matriz[6][0] = matriz[6][11] = matriz[5][0] = matriz[5][11] = matriz[4][0] = matriz[4][11] = matriz[3][0] = matriz[3][11] = matriz[2][0] = matriz[2][11] = matriz[1][0] = matriz[1][11] = matriz[0][0] = matriz[0][11] = '*'
            }
        }




        for(int i = 0; i < matriz.length; i++){//imprime a terceira imagem
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == '*'){// se o elemento da matriz na posicao i,j for igual a '*'
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matriz[0].length; i++) {//imprime a quarta imagem
            for (int j = matriz.length - 1; j >= 0; j--){//começando da ultima linha
                if (matriz[j][i] == '*') {// se o elemento da matriz na posicao j,i for igual a '*'
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
