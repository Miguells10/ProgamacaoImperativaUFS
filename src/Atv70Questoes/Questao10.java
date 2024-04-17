package Atv70Questoes;/*A Secretaria de Meio Ambiente, que controla o índice de poluição, mantém 3 grupos
de indústrias que são altamente poluentes do meio ambiente. O índice de poluição
aceitável varia de 0,05 até 0,29. Se o índice sobe para 0,3 as indústrias do 1o grupo
são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as indústrias
do 1o e 2o grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5
todos os grupos devem ser notificados a paralisarem suas atividades. Faça um
programa que leia o índice de poluição e escreva quais serão os grupos intimados.*/

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Which is the pollution index?");
		float index = input.nextFloat();

		if (index >= 0.05 && index <= 0.29) {
			System.out.println("Congratulations! Your group is respecting the index.");
		} else if (index >= 0.3 && index <= 0.39) {
			System.out.println("Your company (Group 1) is ordered to cease activities");
		} else if (index >= 0.4 && index <= 0.49) {
			System.out.println("Groups 1 and 2 are ordered to cease activities");
		} else {
			System.out.println("All groups are ordered to cease activities");
		}

	}

}
