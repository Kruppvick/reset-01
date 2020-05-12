package Regras;

import Acervo.AcervoPauta;
import Dominio.Pauta;

import java.util.List;

public class RegrasPautas {
    private AcervoPauta acervo = new AcervoPauta();

    public Pauta cadastrar(Pauta pauta) {
        List<Pauta> pautas = acervo.listar();

        return acervo.cadastrar(pauta);
    }
}
