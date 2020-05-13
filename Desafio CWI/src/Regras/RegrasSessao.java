package Regras;

import Acervo.AcervoSessao;
import Dominio.Sessao;

import java.util.List;

public class RegrasSessao {

    private AcervoSessao acervo= new AcervoSessao();

    public Sessao abrir (Sessao sessao){
        List<Sessao> sessoes = acervo.listar();
        return acervo.abrir(sessao);
    }

    public List<Sessao> listar(){
        return acervo.listar();
    }

    // VER COMO FAZER
    // public boolean votarSessao (int idAssociado, int idPauta){

    public Sessao ranking (int idSessao) {
        Sessao sessaoVotada = this.procurar(idSessao);
        if (sessaoVotada == null) {
            return null;
        }
    }


    }

}
