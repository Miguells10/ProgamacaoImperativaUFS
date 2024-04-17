package Atv70Questoes;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Which is the average balance?");
		float balance = input.nextFloat();
		
		float twentyPercent = balance * 0.20f;
		float thirtyPercent = balance * 0.30f;
		float fourtyPercent = balance * 0.40f;

		if (balance >= 0 && balance <= 2000.00) {
			System.out.printf("Your average balance is: %.2f \nYour credit is: No credit. Low average balance.",
					balance);
		} else if (balance >= 2000.01 && balance <= 4000.00) {
			System.out.printf("Your average balance is: %.2f \nYour credit is: %.2f.",
					balance, twentyPercent);
		}  else if (balance >= 4000.01 && balance <= 6000.00) {
			System.out.printf("Your average balance is: %.2f \nYour credit is: %.2f.",
					balance, thirtyPercent);
		} else {
			System.out.printf("Your average balance is: %.2f \nYour credit is: %.2f.",
					balance, fourtyPercent);
		}

	}
}
