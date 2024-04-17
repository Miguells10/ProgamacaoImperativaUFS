package Atv70Questoes;

import java.util.Scanner;
/*Faça um algoritmo que leia duas notas obtidas por um aluno na disciplina de Cálculo,
o número de aulas ministradas e o número de aulas assistidas por este aluno nesta
disciplina. Calcule e mostre a média final deste aluno e diga se ele foi aprovado ou
reprovado. Considere que para um aluno ser aprovado ele deve obter média final igual
ou maior a 6 e ter no mínimo 75% de frequência.
*/
public class Questao7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which is the student's first grade?");
			float grade1 = input.nextFloat();
		System.out.println("Which is the student's second grade?");
			float grade2 = input.nextFloat();
		System.out.println("How many classes were taught by the professor?");	
			int classes = input.nextInt();
		System.out.println("How many classes did you take?");	
			int studentClasses = input.nextInt();
			
			
	float media = (grade1 + grade2)/2;
	float frequency = (studentClasses * 100f)/classes;
		
	if(frequency >= 75) {
		
		if(media>=6) {
			System.out.println("Approved");
		} else {
			System.out.println("Disapproved");
		}
	} else {
		System.out.println("You haven't reached the minimum of the frequency");
	}
	

input.close();
	}

}
