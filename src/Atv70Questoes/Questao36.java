package Atv70Questoes;

//36. Em uma eleição presidencial, existem quatro candidatos. Os votos são informados
//através de código. Os dados utilizados para a apuração obedecem à seguinte
//codificação:
//         1, 2, 3 e 4 = voto para os respectivos candidatos;
// 5 voto nulo;
// 6 voto em branco;
//
//Elaborar um algoritmo em Java que calcule e imprima:
//  O total de votos para cada candidato;
// O total de votos nulos;
// O total de votos em branco;
// O percentual dos votos em branco e nulos sobre o total;
//OBS: Considere o número -1 como Condição de parada das eleições naquela urna.

import java.util.Scanner;

public class Questao36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int voto, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0, branco = 0, total = 0;


        do {
            System.out.println("Digite o voto: ");
            System.out.println("1 - Bolsonaro");
            System.out.println("2 - Lula");
            System.out.println("3 - Ciro Gomes");
            System.out.println("4 - João Dória");
            System.out.println("5 - Nulo");
            System.out.println("6 - Branco");
            voto = input.nextInt();

            switch (voto){
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    break;
                default:
                    System.out.println("Voto inválido");
            }
            total++;


        }while (voto != -1);

        float percentualVotosNulos = (nulo * 100f) / total;
        float percentualVotosBrancos = (branco * 100f) / total;


        System.out.println("Total de votos para Bolsonaro: " + candidato1);
        System.out.println("Total de votos para Lula: " + candidato2);
        System.out.println("Total de votos para Ciro Gomes: " + candidato3);
        System.out.println("Total de votos para João Dória: " + candidato4);
        System.out.println("Total de votos nulos: " + nulo);
        System.out.println("Total de votos em branco: " + branco);
        System.out.println("Percentual de votos nulos: " + percentualVotosNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualVotosBrancos + "%");


    }
}
