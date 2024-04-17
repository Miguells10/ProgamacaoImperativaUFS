package TheHuxley;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Valor salario minimo:");
        float salarioMinimo = input.nextFloat(), salario = 0, media = 0, maiorSalario = Float.MIN_VALUE, salario1= 0, salario2 =0,
                salario3 =0;
        int pecas = 0, somaPecas =0;

        for (int i = 1; i <= 3; i++) {
//            System.out.println("pecas");
            pecas = input.nextInt();
            int cadaPeca = pecas - 30;
            if (pecas > 41) {
                salario = (cadaPeca * (salarioMinimo * 5) / 100) + salarioMinimo;
                somaPecas += pecas;
            } else if (pecas >= 31 && pecas < 41) {
                salario = (cadaPeca * (salarioMinimo * 3) / 100) + salarioMinimo;
                somaPecas += pecas;
            } else {
                salario = salarioMinimo;
                somaPecas += pecas;
            }

                System.out.printf("Salario %d: %.2f\n",i, salario);
            }


            if(salario>maiorSalario){
                maiorSalario = salario;
            }



        media = somaPecas/3f;


        System.out.println("Total de pecas fabricadas: " + somaPecas);
        System.out.printf("Media de pecas fabricadas: %.2f \n", media);
        System.out.printf("Maior salario: %.2f \n", maiorSalario);


    }
    }