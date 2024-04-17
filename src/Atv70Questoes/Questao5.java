package Atv70Questoes;

//Tendo como dados de entrada a altura e o sexo de
//uma pessoa (“M” masculino e

//“F” feminino),
//construa um programa que calcule seu peso ideal,
//utilizando as seguintes fórmulas:
//• para homens: (72.7*a)-58
//• para mulheres: (62.1*a)-44.7
//O programa deve ler o peso e a altura da pessoa e indicar
//se está acima ou abaixo do peso;


import java.util.Scanner;

public class Questao5 {
	
 public static void main(String[] args) {
	 
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Qual o seu sexo? Digite 'M' para masculino e 'F' para feminino.");
         String sexo = teclado.nextLine();
     System.out.println("Qual sua altura em metros?(Ex: 1,8)");
         double altura = teclado.nextDouble();
     double pesoIdeal = 0;

     if(sexo.equalsIgnoreCase("M") ){
         pesoIdeal = (72.7f*(altura))-58;

     }else if(sexo.equalsIgnoreCase("F")){
         pesoIdeal = (62.1f*altura)-44.7f;
     }else {
         System.out.println("Digite uma entrada que corresponde ao programa.");
         
     } 

      System.out.printf("Seu peso ideal é %.2f", pesoIdeal);

      teclado.close();
 }
}
