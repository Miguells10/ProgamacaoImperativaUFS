package TheHuxley;

import java.util.Scanner;

public class QuestaoSerie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroSerie = input.nextInt();
        float soma = 0;

        for (int i = 1; i <= numeroSerie; i++){
           float termo = i/(3f*i);
           soma += termo;
        System.out.print((i + "/" + (int) 3f*i));

           if (i<numeroSerie){
               System.out.print(", + ");
           }

            }
        System.out.printf("\n%.2f", soma);

        }
    }

