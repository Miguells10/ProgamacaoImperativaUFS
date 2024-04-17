package ListaVetores;
import java.util.Random;
import java.util.*;

public class Questao04{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        char[] gabaritoAluno = {'a', 'b', 'c', 'd', 'e'};
        String[] alunos = {"Maria", "João", "Pedro", "Ana", "Lucas", "Julia", "Carlos", "Mariana", "Paulo", "Luana", "Ricardo", "Larissa", "Fernando", "Leticia", "Rafael", "Camila", "Gustavo", "Isabela", "Eduardo", "Vitor"};


        // Ler o gabarito da prova
        char[] gabarito = new char[20];
        System.out.println("Digite as respostas do gabarito:");
        for (int i = 0; i < 20; i++) {
            gabarito[i] = gabaritoAluno[random.nextInt(5)];
        }

        System.out.println("Gabarito da prova: " + Arrays.toString(gabarito));

        // Para cada aluno
        for (int aluno = 0; aluno <= 20; aluno++) {
            // Ler as respostas do aluno
            System.out.println("Respostas do aluno " + alunos[aluno] + ":");
            char[] respostas = new char[20];
            for (int i = 0; i < 20; i++) {
                respostas[i] = gabaritoAluno[random.nextInt(5)] ;
            }

            // Contar o número de acertos
            int acertos = 0;
            for (int i = 0; i < 20; i++) {
                if (respostas[i] == gabarito[i]) {
                    acertos++;
                }
            }

            // Mostrar o número de acertos e a mensagem de "APROVADO" ou "REPROVADO"
            System.out.println("Número de acertos do aluno " + alunos[aluno] + ": " + acertos);
            if (acertos >= 6) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
        }

        input.close();
    }
}
