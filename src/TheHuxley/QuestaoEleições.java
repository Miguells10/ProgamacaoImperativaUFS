package TheHuxley;

import java.util.Random;
import java.util.Scanner;
//
//Escreva um programa que transforme o computador numa urna eletrônica para eleição, em segundo turno, para presidente de um país chamado Ambrolândia.
// Nessas eleições concorrem os candidatos 83-Alibabá e 93-Alcapone.
//Cada voto deve ser dado pelo número do candidato, permitindo-se ainda o voto 0 para voto em branco. Qualquer voto diferente dos já citados é considerado nulo.
//No final da eleição o programa deve emitir um relatório contendo a votação de cada candidato, a quantidade votos em branco, a quantidade de votos nulos e o candidato eleito e os respectivos percentuais.
//Em Ambrolândia, o percentual de votos é calculado considerando os votos válidos. O voto nulo não é considerado um voto válido. Entretanto, o voto em branco é considerado um voto válido.

public class QuestaoEleições {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int votosBrancos = 0, votosAlibaba = 1, votosAlcapone = 1, votosNulos = 0, total = 0;
        int voto;

        do{
//            System.out.println("Digite seu voto");
//            System.out.println("83-Alibabá");
//            System.out.println("93-Alcapone");
//            System.out.println("0-Branco");
//            System.out.println("Qualquer outro número - Branco");
//            System.out.println("Digite -1 para finalizar.");
            voto = teclado.nextInt();

                switch (voto){
                    case 0:
//                        System.out.println();
//                        System.out.println("Você votou branco.");
                        votosBrancos++;
                        break;

                    case 83:
//                        System.out.println();
//                        System.out.println("Você votou em Alibabá");
                        votosAlibaba++;
                        break;

                    case 93:
//                        System.out.println();
//                        System.out.println("Você votou em Alcapone");
                        votosAlcapone++;
                        break;

                    default:
                        if(voto!= -1){
//                        System.out.println();
//                        System.out.println("Você votou nulo.");
                        votosNulos++;
                        }
                }
                total = votosAlcapone + votosAlibaba + votosBrancos;

        }while(voto != -1 );


        System.out.println(votosAlibaba);
        System.out.println(votosAlcapone);
        System.out.println(votosBrancos);
        System.out.println(votosNulos);

        if(votosAlibaba>votosAlcapone){
            System.out.println(83);
        }else if(votosAlibaba<votosAlcapone){
            System.out.println(93);
        }else{
            int aleatorio = random.nextInt(2);
            if(aleatorio==1){
                System.out.println(83);
            }else{
                System.out.println(93);
            }
        }



        float percentualAlibaba = (votosAlibaba*100f)/total;
        float percentualAlcapone = (votosAlcapone*100f)/total;

        System.out.printf("%.2f \n", percentualAlibaba);
        System.out.printf("%.2f \n", percentualAlcapone);



    }
}
