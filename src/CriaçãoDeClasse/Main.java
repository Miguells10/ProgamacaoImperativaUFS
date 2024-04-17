package CriaçãoDeClasse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do condomínio:");
        String nomeCondominio = input.next();
        Condominio condominio = new Condominio(nomeCondominio);

        System.out.println("Quantas unidades deseja cadastrar?");
        int numUnidades = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numUnidades; i++) {
            System.out.print("Digite o número da unidade " + (i + 1) + ": ");
            int numeroUnidade = input.nextInt();
            input.nextLine(); // Consumir a quebra de linha

            Unidade unidade = new Unidade(numeroUnidade);

            System.out.print("Quantos moradores deseja cadastrar para esta unidade? ");
            int numMoradores = input.nextInt();
            input.nextLine(); // Consumir a quebra de linha

            for (int j = 0; j < numMoradores; j++) {
                System.out.print("Digite o nome do morador " + (j + 1) + ": ");
                String nomeMorador = input.nextLine();
                System.out.print("Digite a idade do morador " + (j + 1) + ": ");
                int idadeMorador = input.nextInt();
                input.nextLine(); // Consumir a quebra de linha

                Morador morador = new Morador(nomeMorador, idadeMorador);
                unidade.adicionarMorador(morador);
            }

            condominio.adicionarUnidade(unidade);
        }

        System.out.println("\nDetalhes do condomínio:");
        System.out.println(condominio);
    }
}
