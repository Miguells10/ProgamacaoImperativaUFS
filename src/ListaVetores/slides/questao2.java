package ListaVetores.slides;

import java.util.Arrays;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("tamanho");
        int n = input.nextInt();
        String [] alunos = new String[n];

        for (int i = 0; i < n; i++) {
        System.out.println("Qual o nome?");
        alunos[n-i-1]= input.next();
        }
        System.out.println(Arrays.toString(alunos));

    }
}
