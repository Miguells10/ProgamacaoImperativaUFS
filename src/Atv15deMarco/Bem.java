package Atv15deMarco;


public class Bem implements java.io.Serializable {
        private final int codigo;
        private final String nome;
        private final double valor;


        //Construtor que recebe os valores do código, nome e valor do bem.
        public Bem(int codigo, String nome, double valor) {
            this.codigo = codigo;
            this.nome = nome;
            this.valor = valor;
        }

        //Métodos para retornar o código, nome e valor do bem.
        public int getCodigo() {
            return codigo;
        }

        public String getNome() {
            return nome;
        }

        public double getValor() {
            return valor;
        }
    }

