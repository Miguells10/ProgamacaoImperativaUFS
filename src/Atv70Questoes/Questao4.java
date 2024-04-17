package Atv70Questoes;/*Escrever um algoritmo para ler e imprimir três números. Se o primeiro for positivo,
imprimir sua raiz quadrada, caso contrário, imprimir o seu quadrado; se o segundo
número for maior que 10 e menor que 100, imprimir a mensagem: “Número está entre
10 e 100 – intervalo permitido”; se o terceiro número for menor que o segundo,
calcular e imprimir a diferença entre eles, caso contrário, imprimir o terceiro número
adicionado de 1.
*/



import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro numero inteiro:");
			int numero1 = input.nextInt();
		System.out.println("Digite o segundo numero inteiro:");
			int numero2 = input.nextInt();
		System.out.println("Digite o terceiro numero inteiro:");
			int numero3 = input.nextInt();
			
			
	if(numero1>0) {
		System.out.println(Math.sqrt(numero1));
	} else {
		System.out.println(Math.pow(numero1, 2));
	}		
			

	
	if(numero2>10 && numero2<100) {
		System.out.println("Número está entre 10 e 100 - intervalo permitido");
		
	}else {
		System.out.println("Numero n está no intervalo");
	}
	
	if(numero3<numero2) {
		System.out.println("A diferença dos números é de " + (numero3 - numero2));
	}


	}

}
