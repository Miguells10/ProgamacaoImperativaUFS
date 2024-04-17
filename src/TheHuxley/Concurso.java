package TheHuxley;

import java.util.*;

public class Concurso {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            int vagas = input.nextInt(); // Variável para armazenar o número de vagas
            input.nextLine(); // Consumir a quebra de linha
            if (vagas <= 0) {
                throw new IllegalArgumentException("Quantidade de vagas inválida!");
            }


            String[] gabarito = input.nextLine().split(" "); // Vetor para armazenar o gabarito das questões
            if (gabarito.length != 10) { // Verifica se o gabarito contém 10 respostas
                throw new IllegalArgumentException("Gabarito inválido!"); // Mensagem de erro se o gabarito estiver incorreto
            }


            List<Candidato> candidatos = new ArrayList<>(); // Lista para armazenar os candidatos e suas pontuações

            // Loop para ler as entradas dos candidatos
            while (true) {
                String entrada = input.nextLine(); // Lê a entrada do usuário
                if (entrada.equals("*")) {
                    break; // Sai do loop se o usuário digitar '*'
                }
                String[] dadosCandidato = entrada.split(" "); // Divide a entrada em um vetor de strings


                if (dadosCandidato.length == 11)
                {// Verifica se a entrada contém 11 elementos (1 nome + 10 respostas)
                    int pontuacao = calcularNota(dadosCandidato, gabarito); // Calcula a pontuação do candidato
                    // Adiciona o novo candidato à lista com seu nome e pontuação
                    candidatos.add(new Candidato(dadosCandidato[0], pontuacao));

                } else {
                    // Mensagem de erro se a entrada não tiver o número correto de respostas
                    System.out.println("Entrada inválida. Por favor, digite o nome do candidato seguido por 10 respostas.");
                }
            }

            // Ordena a lista de candidatos por pontuação e, em caso de empate, por nome
            candidatos.sort((c1, c2) -> {
                if (c1.getPontuacao() != c2.getPontuacao()) {
                    return c2.getPontuacao() - c1.getPontuacao(); // Ordena por pontuação
                } else {
                    return c1.getNome().compareToIgnoreCase(c2.getNome()); // Ordena por nome
                }
            });

            // Processa os candidatos e imprime seus resultados
            for (int i = 0; i < candidatos.size(); i++) {
                Candidato candidato = candidatos.get(i);
                // Determina se o candidato foi aprovado com base no número de vagas
                String resultado = (i < vagas) ? "Aprovado(a)" : "Nao Aprovado(a)";
                // Imprime o nome, pontuação e resultado do candidato
                System.out.println(candidato.getNome() + " " + candidato.getPontuacao() + " " + resultado);
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());

        }

    }

    // Método para calcular a nota de um candidato com base nas respostas e no gabarito
    public static int calcularNota(String[] respostas, String[] gabarito) {
        int nota = 0;
        for (int i = 1; i < respostas.length; i++) {
            if (respostas[i].equalsIgnoreCase(gabarito[i - 1])) {
                nota++;
            }
        }
        return nota;
    }
}

// Classe para representar um candidato
class Candidato {;
    String nome; // Nome do candidato
    int pontuacao; // Pontuação do candidato

    Candidato(String nome, int pontuacao) { // Construtor para inicializar um candidato com nome e pontuação
        this.nome = nome;
        this.pontuacao = pontuacao;
    }


    public String getNome() { // Método para obter o nome do candidato
        return nome;
    }

    public int getPontuacao() { // Método para obter a pontuação do candidato
        return pontuacao;
    }
}
