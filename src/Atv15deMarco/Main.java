package Atv15deMarco;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String FILENAME = "dados.txt"; // Nome do arquivo para salvar os dados

    private static List<Pessoa> pessoas = new ArrayList<>(); // Lista de pessoas

    public static void main(String[] args) {
        carregarDados(); // Carregar os dados do arquivo
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 => Inserir pessoa");
            System.out.println("2 => Inserir bens de uma pessoa");
            System.out.println("3 => Excluir pessoa");
            System.out.println("4 => Excluir bem de uma pessoa");
            System.out.println("5 => Listar Pessoas");
            System.out.println("6 => Consultar pessoa");
            System.out.println("7 => Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            //Switch para escolher a opção.
            switch (opcao) { //
                case 1:
                    inserirPessoa(scanner);
                    break;
                case 2:
                    inserirBens(scanner);
                    break;
                case 3:
                    excluirPessoa(scanner);
                    break;
                case 4:
                    excluirBem(scanner);
                    break;
                case 5:
                    listarPessoas();
                    break;
                case 6:
                    consultarPessoa(scanner);
                    break;
                case 7:
                    salvarDados();
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);
    }

    //Métodos para inserir, excluir, listar e consultar pessoas e bens.
    private static void inserirPessoa(Scanner scanner) {
        System.out.print("Digite o código da pessoa: ");
        long codigo = scanner.nextLong();
        // Verificar se o código da pessoa já está em uso
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codigo) {
                System.out.println("O código da pessoa já está em uso.");
                return;
            }
        }
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        Pessoa pessoa = new Pessoa(codigo, nome);
        pessoas.add(pessoa);
        System.out.println("Pessoa adicionada.");
    }

    private static void inserirBens(Scanner scanner) {
        System.out.print("Digite o código da pessoa: ");
        long codigoPessoa = scanner.nextLong();
        scanner.nextLine(); // Consumir a quebra de linha
        Pessoa pessoa = buscarPessoaPorCodigo(codigoPessoa);
        if (pessoa == null) {
            System.out.println("Pessoa não encontrada no programa.");
        } else {
            System.out.print("Digite o código do bem: ");
            int codigoBem = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Digite o nome do bem: ");
            String nomeBem = scanner.nextLine();
            System.out.print("Digite o valor do bem: ");
            double valorBem = scanner.nextDouble();
            Bem bem = new Bem(codigoBem, nomeBem, valorBem);
            pessoa.adicionarBem(bem);
            System.out.println("Bem adicionado.");
        }
    }

    private static void excluirPessoa(Scanner scanner) {
        System.out.print("Digite o código da pessoa que deseja excluir: ");
        long codigoPessoa = scanner.nextLong();
        Pessoa pessoa = buscarPessoaPorCodigo(codigoPessoa);
        if (pessoa == (null)) {
            System.out.println("Pessoa não encontrada no programa.");
            return;
        } else pessoas.remove(pessoa);
        System.out.println("Pessoa removida com sucesso.");
    }

    private static void excluirBem(Scanner scanner) {
        System.out.print("Digite o código da pessoa: ");
        long codigoPessoa = scanner.nextLong();
        scanner.nextLine(); // Consumir a quebra de linha
        Pessoa pessoa = buscarPessoaPorCodigo(codigoPessoa);
        if (pessoa == null) {
            System.out.println("Pessoa não encontrada no programa.");
            return;
        }
        System.out.print("Digite o código do bem que deseja excluir: ");
        int codigoBem = scanner.nextInt();
        pessoa.removerBem(codigoBem);
        System.out.println("Bem removido.");
    }

    private static void listarPessoas() {
        System.out.println("CodPessoa NomePessoa ValorTotBens");
        for (Pessoa pessoa : pessoas) {
            double valorTotalBens = pessoa.calcularValorTotalBens();
            System.out.printf("%3d %-30s R$ %.2f\n", pessoa.getCodigo(), pessoa.getNome(), valorTotalBens);
        }
    }

    private static void consultarPessoa(Scanner scanner) {
        System.out.print("Digite o código da pessoa: ");
        long codigoPessoa = scanner.nextLong();
        scanner.nextLine(); // Consumir a quebra de linha
        Pessoa pessoa = buscarPessoaPorCodigo(codigoPessoa);
        if (pessoa == null) {
            System.out.println("Pessoa não encontrada no programa.");
            return;
        }
        System.out.println("Código: " + pessoa.getCodigo());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Bens:");
        List<Bem> bens = pessoa.getBens();
        for (int i = 0; i < bens.size(); i++) { // Um laço para exibir os bens da pessoa.
            Bem bem = bens.get(i);
            System.out.println("  Código: " + bem.getCodigo() + ", Nome: " + bem.getNome() + ", Valor: R$ " + bem.getValor()); // Exibir os bens da pessoa
        }
    }

    private static Pessoa buscarPessoaPorCodigo(long codigo) {
        for (int i = 0; i < pessoas.size(); i++) { // Buscar a pessoa na lista
            Pessoa pessoa = pessoas.get(i); // Obter a pessoa da lista
            if (pessoa.getCodigo() == codigo) { // Comparar o código da pessoa
                return pessoa;
            }
        }
        return null;
    }

    private static void carregarDados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            Object obj = ois.readObject();
            if (obj instanceof List<?>) {
                pessoas = (List<Pessoa>) obj;
                System.out.println("Dados carregados com sucesso.");
            } else {
                System.out.println("Erro ao carregar dados: formato inválido.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de dados não encontrado. Será criado um novo arquivo ao salvar os dados.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }

    private static void salvarDados() {
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            ous.writeObject(pessoas);
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }
}

