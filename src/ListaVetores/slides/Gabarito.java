package ListaVetores.slides;
//Escreva um que leia um vetor G de 20 elementos caractere que representa o gabarito
//de uma prova. A seguir, para cada um dos 50 alunos da turma, leia o vetor de respostas
//        (R) do aluno e conte o número de acertos. Mostre o no de acertos do aluno e uma
//        mensagem APROVADO, se a nota for maior ou igual a 6; e mostre uma mensagem
//        de REPROVADO, caso contrário.

import java.util.*;

public class Gabarito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        char[] gabaritoAluno = {'a', 'b', 'c', 'd', 'e'};
        char[] gabarito = new char[20];
        String[] alunos = {"Maria", "João", "Pedro", "Ana", "Lucas", "Julia", "Carlos", "Mariana", "Paulo", "Luana", "Ricardo", "Larissa", "Fernando", "Leticia", "Rafael", "Camila", "Gustavo", "Isabela", "Eduardo", "Vitor"};
        List<String> aprovados = new ArrayList<>();
        List<String> reprovados = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            gabarito[i] = gabaritoAluno[random.nextInt(5)];
        }
        System.out.println(Arrays.toString(gabarito));
        boolean continuar = true;

        char[] respostas = new char[20];
        for (int i = 0; i < alunos.length; i++) {
            int correto = 0;

            for (int j = 0; j < 20; j++) {
                respostas[i] = gabaritoAluno[random.nextInt(5)];
                if (respostas[i] == gabarito[i]){
                    correto++;
                }
            }
            System.out.printf("Os acertos do aluno %s foram: %d \n", alunos[i], correto);
            if (correto >= 6) {
                System.out.println("APROVADO");
                aprovados.add(alunos[i]);
            } else {
                System.out.println("REPROVADO");
                reprovados.add(alunos[i]);
            }

        }
        System.out.println("Alunos Aprovados:");
        System.out.println(aprovados);
        for (String aluno : aprovados) {
            System.out.println(aluno);
        }

        System.out.println();

        System.out.println("Alunos Reprovados:");
        for (String aluno : reprovados) {
            System.out.println(aluno);
        }




    }
}
