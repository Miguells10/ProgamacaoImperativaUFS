package ListaVetores.slides;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro número");
            int num1 = input.nextInt();
            System.out.println("Digite o segundo número");
            int num2 = input.nextInt();
            System.out.println("Escolha a operação");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            int opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println((Adicao(num1,num2)));

                    break;

                case 2:
                    System.out.println(Subtracao(num1,num2));
                    break;

                case 3:
                    System.out.println(Multiplicacao(num1,num2));
                    break;
                case 4:
                    System.out.println(Divisao(num1,num2));
                    break;

                default:
                    System.out.println("Opção Inválida");

            }
        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage()
            );
        }


    }

    static int Adicao(int num1, int num2){
        return num1 + num2;
    }

    static int Subtracao(int num1, int num2){
        return num1 - num2;
    }

    static int Multiplicacao(int num1, int num2){
        return num1 * num2;
    }

    static int Divisao(int num1, int num2){
        return num1 / num2;
    }

}
