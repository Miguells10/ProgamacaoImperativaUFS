package CriaçãoDeClasse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestaoCondominio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try (input) {
            boolean continuar = true;
            while (continuar) {
            System.out.println("Menu:");
            System.out.println("1- Adicionar condomínio");
            System.out.println("2- Ver a lista de condomínios e acessá-los");
            System.out.println("3- Encerrar");
            int opcao = input.nextInt();
                switch (opcao) {

                    case 1:
                        System.out.println("Qual o nome do condomínio?");
                        String nomeCondominio = input.next();
                        Condominios condominios = new Condominios(nomeCondominio);
                        System.out.println("Quantas unidades?");
                        int numUnidades = input.nextInt();

                        for (int i = 0; i < numUnidades; i++) {
                            System.out.println("Qual o número da unidade?");
                            int numeroUnidade = input.nextInt();

                            Unidades unidades = new Unidades(numeroUnidade);

                            System.out.println("Quantos moradores?");
                            int numMoradores = input.nextInt();

                            for (int j = 0; j < numMoradores; j++) {
                                System.out.println("Nome morador " + (j + 1));
                                String nomeMorador = input.next();

                                System.out.print("Digite a idade do morador " + (j + 1) + ": ");
                                int idadeMorador = input.nextInt();
                                input.nextLine(); // Consumir a quebra de linha

                                Pessoas pessoa = new Pessoas(nomeMorador, idadeMorador);
                                unidades.adicionarPessoas(pessoa);

                            }

                            condominios.adicionarUnidades();

                        }
                        break;
                    case 2:
                        if (Condominios.isEmpty()) {
                            System.out.println("Não há condomínios cadastrados.");
                        } else {
                            System.out.println("Lista de condomínios:");
                            for (int i = 0; i < Condominios.size(); i++) {
                                System.out.println((i + 1) + ". " + Condominios.get(i).nome);
                            }

                            System.out.println("Selecione o número do condomínio:");
                            int numCondominio = input.nextInt();
                            Condominios condominiosSelecionado = Condominios.get(numCondominio - 1);

                            System.out.println("Unidades do condomínio " + condominiosSelecionado.nome + ":");
                            for (Unidades unidade : condominiosSelecionado.unidade) {
                                System.out.println("Unidade " + unidade.numero + ":");
                                System.out.println("Moradores:");
                                for (Pessoas pessoa : unidade.pessoa) {
                                    System.out.println("- Nome: " + pessoa.nome + ", Idade: " + pessoa.idade);
                                }
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Encerrando...");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        // Fechar o scanner
    }
}

class Pessoas {
    String nome;
    int idade;

    Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class Unidades {
    int numero;
    List<Pessoas> pessoa;

    Unidades(int numero) {
        this.numero = numero;
        this.pessoa = new ArrayList<>();
    }

    void adicionarPessoas(Pessoas pessoa) {
        this.pessoa.add(pessoa);
    }
}

class Condominios {
    public Unidades[] unidade;
    String nome;
    static List<Condominios> condominios;

    Condominios(String nome) {
        this.nome = nome;
        condominios = new ArrayList<>();
    }

    void adicionarUnidades() {
        condominios.add(this);
    }

    static boolean isEmpty() {
        return condominios.isEmpty();
    }

    static int size() {
        return condominios.size();
    }

    static Condominios get(int i) {
        return condominios.get(i);
    }
}
