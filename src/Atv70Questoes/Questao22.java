package Atv70Questoes;

//22.Foi feita uma pesquisa para saber o perfil dos alunos que cursam o ginásio de uma
//determinada escola. Cada aluno fornecia a sua série (primeira-1, segunda-2, terceira-
// 3 ou quarta-4), quantos livros liam por mês e se gostavam de fazer redação (Sim-1 ou
//Não-0). Fazer um programa que leia os dados, calcule e imprima:
// A quantidade de alunos que está na terceira série;
// A maior quantidade de livros lidos por um aluno que está na quarta série;
// A porcentagem de alunos que não gostam de fazer redação e que estão na terceira
//série.
//
//OBS: A condição de parada (flag) é que seja digitado 0 (zero) para idade.

import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade, serie, livros, maiorQuantLivros = Integer.MIN_VALUE, gostarLer;
        float percentual = 0;
        String nome;
        int alunos3Serie = 0, somarAlunos3 = 0, alunosNotRead = 0, somaAlunosNotRead = 0;
        String guardarAluno = "";

        while (true) {
            System.out.println("Qual seu nome? ");
            nome = input.next();
            System.out.println("Qual sua série? ");
            serie = input.nextInt();
            System.out.println("Quantos livros você leu no mês? ");
            livros = input.nextInt();
            System.out.println("Você gosta de fazer redação? (1-sim e 0-não) ");
            gostarLer = input.nextInt();

            if (serie == 3) {
                ;
                alunos3Serie++;

                if (gostarLer == 0) {
                    somaAlunosNotRead += alunosNotRead;
                    alunosNotRead++;

                }

                percentual = (alunosNotRead * 100f) / alunos3Serie;

            }

            if (serie == 4 & livros > maiorQuantLivros) {
                maiorQuantLivros = livros;
            }

            System.out.println("Você deseja continuar? (1-sim e 0-não)");
            int continuar = input.nextInt();

            if (continuar == 0) {
                break;
            }


        }
        System.out.println("A quantidade de alunos que estão na terceira série é de: " + alunos3Serie);
        System.out.println("A maior quantidade de livros lido da 4 serie foi de: " + maiorQuantLivros);
        System.out.println("A porcentagem de alunos que não gostam de fazer redação e que estão na terceira série é de: " + percentual + "%");


    }
}
