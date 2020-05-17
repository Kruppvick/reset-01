package Regras;

import Acervo.AcervoSessao;
import Dominio.Associado;
import Dominio.Sessao;

import java.util.List;

public class RegrasSessao {

    private AcervoSessao acervo = new AcervoSessao();

    public Sessao abrir(Sessao sessao) {
        List<Sessao> sessoes = acervo.listar();
        return acervo.abrir(sessao);
    }

    public List<Sessao> listar() {
        return acervo.listar();
    }

    public Sessao procurar(int id) {
        if (id > 0) {
            return acervo.procurar(id);

        }
        return null;
    }

    public boolean votarPauta(int idPauta, int idAssociado) {
        if (this.procurar(idPauta) != null) {
            Sessao sessao = this.procurar(idAssociado);
            return sessao.votarPauta(idPauta);
        }
        return false;
    }


    //* public Sessao acumulado(int idSessao) {
        //Sessao sessaoVotada = this.procurar(idSessao);
        //if (sessaoVotada == null) {
          //  return null;
        //*}

       /* AcervoSessao acervoSessao = new AcervoSessao();
        List<Sessao> listarSessoes = acervoSessao.listar();
        listarSessoes.remove(idSessao);
        Sessao sessao = null;
        int melhorPontuacao = 0;
        for (Sessao listaSessao : listarSessoes) {
            int pontuacao = 0;
             if (!)
             //*
        */


    //}

}



