package br.com.cwi.assembleiadevotacao.acervo;

import br.com.cwi.assembleiadevotacao.dominio.Pauta;

import java.util.ArrayList;
import java.util.List;

public class AcervoPauta {
    private static final List<Pauta> pautas = new ArrayList<>();
    private static int contador = +1;

    public Pauta cadastrar(Pauta pauta) {
        pauta.setId(contador++);
        pautas.add(pauta);
        return pauta;
    }

    public List<Pauta> listar() {
        return pautas;
    }

    public Pauta procurar (int id){
        for (Pauta pauta : pautas){
            if (pauta.getId() ==  id){
                return pauta;
            }
        }
        return null;
    }

}
