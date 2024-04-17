package Atv70Questoes;

//Seja a seguinte série: 1, 4, 9, 16, 25, 36, ... Escreva um algoritmo em Java que gere
//esta série até o N-ésimo termo. Este N-ésimo termo é digitado pelo usuário.
import java.util.Scanner;

public class Questao31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho da série?");
        int n = input.nextInt();

        for (int i = 1; i<=n; i++){
            double exp = Math.pow(i,2);
            System.out.print(exp);

            if (i < n){
                System.out.printf(", ");
            }
        }
    }

}
