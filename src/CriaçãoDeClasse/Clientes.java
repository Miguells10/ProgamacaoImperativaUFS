package CriaçãoDeClasse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Teste {
    static List<Clientes> clientes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 => Inserir cliente");
            System.out.println("2 => Inserir bens de um cliente");
            System.out.println("3 => Excluir cliente");
            System.out.println("4 => Excluir bem de um cliente");
            System.out.println("5 => Listar Clientes");
            System.out.println("6 => Consultar cliente");
            System.out.println("7 => Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            //Switch para escolher a opção.
            switch (opcao) {
                case 1:
                    inserirCliente(scanner);
                    break;
                case 2:
                    inserirCompra(scanner);
                    break;
                case 3:
                    // Implementar a exclusão de um cliente
                    break;
                case 4:
                    // Implementar a exclusão de um bem de um cliente
                    break;
                case 5:
                    // Implementar a listagem de clientes
                    break;
                case 6:
                    // Implementar a consulta de um cliente
                    break;
                case 7:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);
    }

    private static void inserirCliente(Scanner scanner) {
        System.out.print("Digite o código do cliente: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        Clientes cliente = new Clientes(nome, codigo);
        clientes.add(cliente); // Adicionando o cliente à lista
        System.out.println("Cliente inserido com sucesso.");
    }

    private static void inserirCompra(Scanner scanner) {
        System.out.print("Digite o código do cliente: ");
        int codigoCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        Clientes cliente = buscarClientePorCodigo(codigoCliente);
        if (cliente != null) {
            System.out.print("Digite o código da compra: ");
            int codigoCompra = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Digite o nome da compra: ");
            String nomeCompra = scanner.nextLine();
            System.out.print("Digite o valor da compra:");
            float valorCompra = scanner.nextFloat();
            Compra compra = new Compra(nomeCompra, codigoCompra, valorCompra);
            cliente.adicionarCompra(compra);
            System.out.println("Compra adicionada com sucesso para o cliente " + cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static Clientes buscarClientePorCodigo(int codigo) {
        for (Clientes cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }
}

class Compra {
    final String nome;
    final int codigo;
    final float valor;

    Compra(String nome, int codigo, float valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }
}

class Clientes {
    String nome;
    int codigo;
    List<Compra> compras;

    public Clientes(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.compras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    public void removerCompra(int codigoCompra) {
        compras.remove(codigoCompra);
    }

    public double calcularTotal() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.getValor();
        }
        return total;
    }
}
