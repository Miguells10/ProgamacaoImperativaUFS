package Aula06;

import java.util.Scanner;
// Aula06.Questao11 aula06
public class Questao11{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaAlunos = 0, maiorNota = Double.MIN_VALUE, somaNotas = 0;

        for(int i = 1; i <= 5; i++){
//            System.out.println("Qual sua turma? ");
            int turma = i;

            for(int j = 1; j <= 5; j++){

                int ordemNota = j;

                System.out.println("Qual é a " + ordemNota + "ª nota da turma " + turma);
                float nota = input.nextFloat();
                somaNotas += nota;

                if(nota > maiorNota)
                    maiorNota = nota;

            }
            mediaAlunos = somaNotas /5;
            System.out.println("A media da turma " + turma + " é: " + mediaAlunos);
            System.out.println("A maior nota da turma " + turma + " é: " + maiorNota);;
        }
    }


}