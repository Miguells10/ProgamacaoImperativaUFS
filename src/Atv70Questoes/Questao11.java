package Atv70Questoes;
//Faça um algoritmo que receba um valor que foi depositado, a taxa de juros anual e o tempo em anos que se espera fazer o investimento. Ao final exiba o valor do montante acumulado.
import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.println("Which value do you want deposite?");
		float deposite = input.nextFloat();
	System.out.println("Which is the annual interest rate?");
		float rate = input.nextFloat();
	System.out.println("How many years do you expect invest?");
		int years = input.nextInt();
			
	double ratePeriody = 1 + (rate/100)	;
		
	double total = (deposite) * (Math.pow(ratePeriody, years));
		
	System.out.println("The accumulated amount was: " + total + " R$");
		
input.close();
	}

}
