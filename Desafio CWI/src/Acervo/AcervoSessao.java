package Acervo;

import Dominio.Sessao;

import java.util.ArrayList;
import java.util.List;

public class AcervoSessao {

    private static int contador = +1;
    private static final List<Sessao> sessoes = new ArrayList<>();


    public Sessao abrir(Sessao sessao) {
        sessao.setId(contador++);
        sessoes.add(sessao);
        return sessao;
    }


    public List<Sessao> listar() {
        return sessoes;
    }

    public Sessao procurar(int id) {
        for (Sessao sessao : sessoes) {
            if (sessao.getId() == id) {
                return sessao;
            }
        }
        return null;
    }
}

