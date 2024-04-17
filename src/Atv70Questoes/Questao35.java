package Atv70Questoes;

import java.util.Scanner;

//35. Um cinema possui capacidade de 100 lugares e está sempre com ocupação total. Certo
//dia, cada espectador respondeu a um questionário, no qual constava:
//        - sua idade;
//- sua opinião em relação ao filme, segundo as seguintes notas
//
//Nota Significado
//A Ótimo
//B Bom
//C Regular
//D Ruim
//E Péssimo
//
//Elabore um algoritmo que, lendo estes dados, calcule e imprima:
//
// a quantidade de respostas ótimo;
// a diferença percentual entre respostas bom e regular;
// a média de idade das pessoas que responderam ruim;
// a percentagem de respostas péssimo e a maior idade que utilizou esta
//opção;
// a diferença de idade entre a maior idade que respondeu ótimo e a maior
//idade que respondeu ruim

public class Questao35 {
    public static void main(String[] args) {

        int quantidadeOtimo = 0, quantidadeBom = 0, quantidadeRegular = 0, quantidadeRuim = 0, quantidadePessimo = 0, somaIdadesRuins = 0;
        float mediaIdadeRuim = 0;
        int maiorIdadePessimo = Integer.MIN_VALUE, maiorIdadeOtimo = Integer.MIN_VALUE, maiorIdadeRuim = Integer.MIN_VALUE;


        Scanner input = new Scanner(System.in);
        System.out.println("Qual foi a quantidade de espectadores? ");
        int quantidade = input.nextInt();
        String percentagem = "%";

        for(int i =1; i<=quantidade; i++){
            System.out.println("Qual sua idade?");
            int idade = input.nextInt();

            System.out.println("Qual sua opinião em relação ao filme? ");
            System.out.println("A - Ótimo");
            System.out.println("B - Bom");
            System.out.println("C - Regular");
            System.out.println("D - Ruim");
            System.out.println("E - Péssimo");
            String opiniao = input.next();

            if(opiniao.equalsIgnoreCase("A")){
                quantidadeOtimo++;
                System.out.println("O filme foi ótimo");
                if(idade>maiorIdadeOtimo){
                    maiorIdadeOtimo = idade;
                }

            } else if(opiniao.equalsIgnoreCase("B")){
                System.out.println("O filme foi bom");
                quantidadeBom++;

            } else if(opiniao.equalsIgnoreCase("C")){
                System.out.println("O filme foi regular");
                quantidadeRegular++;

            } else if(opiniao.equalsIgnoreCase("D")){
                System.out.println("O filme foi ruim");
                if(idade>maiorIdadeRuim){
                    maiorIdadeRuim = idade;
                }

                somaIdadesRuins += idade;
                quantidadeRuim++;

            } else if(opiniao.equalsIgnoreCase("E")){
                System.out.println("O filme foi péssimo");
                quantidadePessimo++;

                if(idade>maiorIdadePessimo){
                    maiorIdadePessimo = idade;
                }
            }




            mediaIdadeRuim = (float) somaIdadesRuins/quantidadeRuim;

        }
        double percentualOtimo = (quantidadeOtimo * 100f)/quantidade;
        double percentualBom = (quantidadeBom * 100f)/quantidade;
        double percentualRegular = (quantidadeRegular * 100f)/quantidade;
        double percentualRuim = (quantidadeRuim * 100f)/quantidade;
        double percentualPessimo = (quantidadePessimo * 100f)/quantidade;
        double diferencaPercentual = Math.abs(percentualBom - percentualRegular);

        System.out.printf("Quantidade de respostas ótimo: %d \n", quantidadeOtimo);
        System.out.printf("Diferença percentual entre respostas bom e regular: %.2f%s \n", diferencaPercentual, percentagem);
        System.out.printf("Média de idade das pessoas que responderam ruim: %.2f \n", mediaIdadeRuim);
        System.out.printf("Percentagem de respostas péssimo: %.2f%s e a maior idade que utilizou esta opção: %d \n", percentualPessimo, percentagem, maiorIdadePessimo);

        System.out.printf("Diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim: %d \n", Math.abs(maiorIdadeOtimo - maiorIdadeRuim));




    }
}
