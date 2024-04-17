package Atv70Questoes;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero inteiro:");
			int numero1 = input.nextInt();
		System.out.println("Digite um numero inteiro:");
			int numero2 = input.nextInt();	
			
			
			verificarNúmeros(numero1, numero2);

	}
	
	public static void verificarNúmeros(int numero1, int numero2) {
		if(numero1 == numero2) {
			System.out.println("Inguais");
		} else if (numero1>numero2) {
			System.out.println(numero1 + " É o maior número");
		} else {
			System.out.println(numero2 + " É o maior número");
		}
	}

}
