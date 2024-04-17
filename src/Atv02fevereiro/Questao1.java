package Atv02fevereiro;

// Uma determinada empresa armazena para cada funcionário uma ficha contendo o código, o número de
// horas trabalhadas e o seu número de dependentes. Considere que a empresa paga R$20 por hora e R$35
// por dependente. Sobre o salário são feitos descontos de 10,5% para o INSS e 11% para IR. Faça um
// programa em Java para:

//  (vale 0,4) Ler o código, número de horas trabalhadas e número de dependentes de cada
// funcionário. A leitura de um código negativo encerra a leitura dos dados;

// Depois de ler os dados de cada funcionário, calcule e imprima para cada funcionário:

//  (vale 0,1) O código;
//  (vale 1,5) Os valores descontados para cada tipo de imposto. Os valores devem ser exibidos com
// 2 casas decimais;
//  (vale 2,0) O salário líquido com 2 casas decimais.

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int codigo = 0, horasTrabalhadas, dependentes;
        double salarioBruto, salarioLiquido, inss, ir;
        boolean continuar = true;


        while (continuar) {

            System.out.print("Digite o código do funcionário: ");
            codigo = input.nextInt();

            if(codigo < 0){
                continuar = false;
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.print("Digite o número de horas trabalhadas na semana: ");
            horasTrabalhadas = input.nextInt();
            System.out.print("Digite o número de dependentes: ");
            dependentes = input.nextInt();

            salarioBruto = (horasTrabalhadas * 20) + (dependentes * 35);
            inss = salarioBruto * 0.105;
            ir = salarioBruto * 0.11;
            salarioLiquido = salarioBruto - inss - ir;

            System.out.println("Código do funcionário : " + codigo);
            System.out.printf("Desconto INSS: R$ %.2f\n", inss);
            System.out.printf("Desconto IR: R$ %.2f\n", ir);
            System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);

        }

        input.close();
    }
}

