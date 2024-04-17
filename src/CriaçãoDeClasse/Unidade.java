package CriaçãoDeClasse;

import java.util.ArrayList;
import java.util.List;

public class Unidade {
    private final int numero;
    private List<Morador> moradores;

    public Unidade(int numero) {
        this.numero = numero;
        this.moradores = new ArrayList<>();
    }

    void adicionarMorador(Morador morador){
        moradores.add(morador);
    }


}
