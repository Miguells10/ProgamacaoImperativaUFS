package Atv15deMarco;

import java.util.ArrayList;
import java.util.List;


public class Pessoa implements java.io.Serializable{
    private final long codigo;
    private final String nome;
    private final List<Bem> bens;

    //Construtor que recebe o código e o nome da pessoa.
    public Pessoa(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.bens = new ArrayList<>();
    }

    //Métodos para retornar o código e o nome da pessoa.
    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public List<Bem> getBens() {
        return bens;
    }

    public void adicionarBem(Bem bem) {
        bens.add(bem);
    }

    public void removerBem(int codigoBem) {
        bens.removeIf(bem -> bem.getCodigo() == codigoBem);
    }

    public double calcularValorTotalBens() {
        double total = 0;
        for (Bem bem : bens) {
            total += bem.getValor();
        }
        return total;
    }
}