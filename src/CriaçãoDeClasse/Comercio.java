package CriaçãoDeClasse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comercio {
    private final List<Produto> produtos;

    Comercio(){
        this.produtos = new ArrayList<>();
    }

    void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    List<Produto> getProdutos(){
        return produtos;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    Comercio comercio = new Comercio();
    boolean continuar = true;
       while(continuar){

           System.out.println("Menu:");
           System.out.println("1: adicionar produto");
           System.out.println("2: ver a lista de produtos");
           System.out.println("3: Encerrar programa");
           int escolha = input.nextInt();

           switch (escolha){
               case 1:
                   adicionarProduto(comercio);
                   break;
               case 2:
                   System.out.println("Produtos no Comercio:");
                   for (Produto p : comercio.getProdutos()) {
                       System.out.println("Nome: " + p.nome + ", Quantidade: " + p.quantidade + ", Valor: R$ " + p.valor);
                   }
                   break;

               case 3:
                   System.out.println("Programa encerrado");
                   continuar = false;
           }
       }

    }
    
    static void adicionarProduto(Comercio comercio) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o nome do produto que você quer adicionar?");
        String nome = input.next();
        System.out.println("A quantidade");
        int quantidade = input.nextInt();
        System.out.println("Valor");
        float valor = input.nextFloat();
        Produto produto = new Produto(nome, quantidade, valor);

        comercio.adicionarProduto(produto);

    }
}

class Produto {
    String nome;
    int quantidade;
    float valor;

    Produto(String nome, int quantidade, float valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = quantidade;
    }

}


