package com.example.demo.Regras;

import com.example.demo.Acervo.AcervoAssociado;
import com.example.demo.Acervo.AcervoPauta;
import com.example.demo.Dominio.Associado;
import com.example.demo.Dominio.Pauta;
import com.example.demo.Dominio.ResultadoSessao;
import com.example.demo.Dominio.Voto;

import java.time.LocalDateTime;
import java.util.List;


public class RegrasPautas {

    private AcervoPauta acervoPauta = new AcervoPauta();
    private AcervoAssociado acervoAssociado = new AcervoAssociado();

    public Pauta cadastrar(Pauta pauta) {
        List<Pauta> pautas = acervoPauta.listar();

        return acervoPauta.cadastrar(pauta);
    }

    public List<Pauta> listar() {
        return acervoPauta.listar();

    }

    public Pauta procurar(int id) {
        if (id > 0) {
            return acervoPauta.procurar(id);
        }
        return null;
    }

    public boolean votar(int idPauta, Voto voto) {
        Pauta pauta = acervoPauta.procurar(idPauta);
        Associado associadoCadastrado = acervoAssociado.procurar(voto.getIdAssociado());
        boolean tempoVotacao = pauta.getDataLimite().isAfter(LocalDateTime.now());
        if (pauta != null && pauta.associadoPodeVotar(voto.getIdAssociado()) && associadoCadastrado != null && tempoVotacao) {
            pauta.votar(voto);
            return true;
        }
        return false;
    }

    public ResultadoSessao contabilizarVotos (int idPauta) {
        Pauta pauta = acervoPauta.procurar(idPauta);
        if (pauta != null) {
            int sim = 0;
            int nao = 0;
            for (Voto voto : pauta.getVotosRealizado()) {
                if (voto.getVoto()) {
                    sim++;
                } else {
                    nao++;
                }

            }
            ResultadoSessao resultadoSessao = new ResultadoSessao(idPauta, sim, nao);
            return resultadoSessao;
        }
        return null;
    }

}
