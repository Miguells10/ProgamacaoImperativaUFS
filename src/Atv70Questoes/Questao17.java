package Atv70Questoes;


//A padaria “Pão Bom” vende certa quantidade de pães franceses e uma quantidade de
//broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia,
//o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto'
//deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado
//para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo
import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de pães vendidos: ");
        int paes = input.nextInt();
        System.out.println("Digite a quantidade de broas vendidas: ");
        int broas = input.nextInt();

        double valorPaes = paes * 0.12;
        double valorBroas = broas * 1.50;
        double total = valorPaes + valorBroas;
        double poupanca = total * 0.1;

        System.out.println("O valor arrecadado com a venda dos pães e broas foi de R$ " + total);
        System.out.printf("O valor a ser guardado na poupança é de R$ %.2f\n", poupanca);
        System.out.printf("O valor restante é de R$ %.2f \n"  , (total - poupanca));
        System.out.println("Obrigado por comprar na Padaria Pão Bom!");


    }
}
