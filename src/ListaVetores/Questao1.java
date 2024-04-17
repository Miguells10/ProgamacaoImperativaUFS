package ListaVetores;
//1. Faça um algoritmo que leia um vetor N[20]. A seguir, encontre o menor elemento do
//vetor N e a sua posição dentro do vetor, mostrando: “O menor elemento de N é”, M,
// “ e sua posição dentro do vetor é:”,P.


import java.util.*;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        int [] vetor = new int [20];

        for (int i = 0; i < 20; i++) {
           vetor[i] = gerador.nextInt(10);
        }

        int menor = Integer.MAX_VALUE;
        int posição = 0;

        for (int i = 0; i < vetor.length; i++){
            if(vetor[i]< menor){
                menor = vetor[i];
                posição = i;
            }
        }
        System.out.println("O menor elemento é " + menor + " na posição " + posição);



    }

}
