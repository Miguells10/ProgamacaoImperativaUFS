package Atv70Questoes;

import java.util.Scanner;

public class Questao6 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade do atleta:");
        int idade = input.nextInt();
        
        
        switch (idade) {
         
        case 5:
        case 6: 
        case 7: 
        	System.out.println("O atleta pertence a categoria infantil A");
        		
        	break;
        case 8:
        case 9:
        case 10:
        	System.out.println("O atleta pertence a categoria infantil B");
        	
        	break;
        	
        case 11, 12, 13:
       
        	System.out.println("O atleta pertence a categoria Juvenil A.");
        	
        	break;
        
        default:
        	break;
        
        }
        
        if(idade == 14 || idade == 15 || idade == 16 || idade == 17) {
        	System.out.println("O atleta pertence a categoria Juvenil B");
        }
        
        if(idade>= 18) {
        	System.out.println("O atleta pertence a categoria Sênior");
        } 
	
        if(idade<5) {
        	System.out.println("Idade mínima não permitida");
        }
        
	}
	
}	
