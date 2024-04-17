package CriaçãoDeClasse;

import java.util.ArrayList;
import java.util.List;

public class Condominio {
    private final String nome;
    private List<Unidade> unidades;

    public Condominio(String nome) {
        this.nome = nome;
        this.unidades = new ArrayList<>();
    }

    void adicionarUnidade(Unidade unidade){
        unidades.add(unidade);
    }

}
