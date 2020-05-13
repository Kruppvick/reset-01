package Acervo;

import Dominio.Pauta;
import Dominio.Sessao;

import java.util.ArrayList;
import java.util.List;

public class AcervoSessao {

    private static int contador = +1;
    private static final List<Sessao> sessoes = new ArrayList<>();
    //private Pauta pauta;

    public Sessao abrir(Sessao sessao) {
        sessao.setId(contador++);
        //pauta.setNomeDaPauta();
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

