package Atv70Questoes;
//Leia 3 valores inteiros (X, Y, Z), determina e escreve o menor deles.

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What the value of x?");
			int x = input.nextInt();
		System.out.println("What the value of y?");
			int y = input.nextInt();
		System.out.println("What the value of z?");
			int z = input.nextInt();
			
		if(x<y && x<z) {	
			System.out.println("X is the lowest value");
		}else if(y<x && y<z) {
			System.out.println("Y is the lowest value");
			
		}else {
			System.out.println("Z is the lowest value");
		}
			
	input.close();	
	}

}
