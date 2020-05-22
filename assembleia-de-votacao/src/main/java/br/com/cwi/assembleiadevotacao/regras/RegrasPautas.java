package br.com.cwi.assembleiadevotacao.regras;

import br.com.cwi.assembleiadevotacao.acervo.AcervoAssociado;
import br.com.cwi.assembleiadevotacao.acervo.AcervoPauta;
import br.com.cwi.assembleiadevotacao.dominio.Associado;
import br.com.cwi.assembleiadevotacao.dominio.Pauta;
import br.com.cwi.assembleiadevotacao.dominio.ResultadoSessao;
import br.com.cwi.assembleiadevotacao.dominio.Voto;

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
