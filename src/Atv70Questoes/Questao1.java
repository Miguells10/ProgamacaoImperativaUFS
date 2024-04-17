package Atv70Questoes;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero inteiro:");
			int numero1 = input.nextInt();
		System.out.println("Digite um numero inteiro:");
			int numero2 = input.nextInt();
			
			
	 int diferença = Math.abs(numero1 - numero2);
	 
	 System.out.println("A diferença dos números é de:" + diferença);
			
		input.close();
	}

}
