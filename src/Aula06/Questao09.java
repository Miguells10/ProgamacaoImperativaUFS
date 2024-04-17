package Aula06;//9. A prefeitura de uma cidade fez uma pesquisa entre
//        seus habitantes, coletando dados sobre o salário e
//número de filhos. A prefeitura deseja saber:
//a) média do salário da população;
//b) média do número de filhos;
//c) maior salário;
//d) percentual de pessoas com salário até
//R$100,00.
//
//O final da leitura de dados se dará com a entrada de
//um salário negativo.

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao programa do INSS, por favor preencha os dados corretamente.");
    double salario, maiorSalario = Double.MIN_VALUE, mediaSalario = 0, somaSalario = 0, mediaFilhos = 0, PessoasPobres = 0, percentualPessoas = 0;
    int numeroFilhos, somaFilhos = 0, habitantes = 0;

    boolean continuarPrograma = true;

    while(continuarPrograma){

        System.out.println("Qual seu nome?");
        String nome = input.next();

        System.out.println("Bem vindo " + nome + ". Qual o valor do seu salário? (Ex: 1340,0)");
        salario = input.nextDouble();

        if(salario<0){
            break;
        }
            somaSalario += salario;
            habitantes++;

        mediaSalario = somaSalario/habitantes;



        System.out.println("Quantos filhos você tem?");
        numeroFilhos = input.nextInt();
            somaFilhos += numeroFilhos;

        mediaFilhos = somaFilhos/habitantes;

        if(maiorSalario<salario){
            maiorSalario = salario;
        }

        if(salario <= 100 && salario >= 0){
           PessoasPobres++;

         percentualPessoas = (PessoasPobres/habitantes)*100;
        }

    }

        System.out.println("A media de salario é de: " + mediaSalario);
        System.out.println("A media de filhos é de: " + mediaFilhos);
        System.out.println("O percentual de pessoas que recebema ate 100 reais é de: " + percentualPessoas + "%" );
        System.out.println("O maior salário é de: " + maiorSalario);

    }

}
