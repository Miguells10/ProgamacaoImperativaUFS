package Atv70Questoes;
/*Desenvolva um algoritmo que efetue a leitura de três valores para os lados de um
triângulo, considerando lados como: A, B e C. O algoritmo deverá verificar se os
lados fornecidos forma realmente um triângulo (cada lado é menor que a soma dos
outros dois lados). Se for esta condição verdadeira, deverá ser indicado qual tipo de
triângulo foi formado: isósceles (dois lados iguais e um diferente), escaleno (todos os
lados diferentes) ou equilátero (todos os lados são iguais).*/

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What the value of x?");
			int x = input.nextInt();
		System.out.println("What the value of y?");
			int y = input.nextInt();
		System.out.println("What the value of z?");
			int z = input.nextInt();
			
	checkTriangle(x,y,z);
	typeTriangle(x,y,z);
				
	}
	
	public static void checkTriangle(int x, int y, int z){
		if(x+y > z && y+z> x && x+z>y){
			System.out.println("This is a triangle");
		} else {
			System.out.println("This is not a triangle");
		}
		
	}
	
	public static void typeTriangle(int x, int y, int z) {
		if(x==y && y==z) {
			System.out.println("equilateral triangle");
		} else if(x==y || y==z || z==x) {
			System.out.println("Isosceles triangle");
		} else {
			System.out.println("Scalene triangle");
			
		}
	}
		
}
