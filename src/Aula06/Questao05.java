package Aula06;//5. Construa um programa que imprima todos os
//números ímpares compreendidos entre 81 e 953. O
//algoritmo também deve mostrar a soma de todos os
//valores.

public class Questao05 {
    public static void main(String[] args) {
        int somaValores = 0;

        for(int i = 81; i <=953; i++){
            somaValores += i;

            System.out.println(i);
            System.out.println(somaValores);
        }



    }
}
