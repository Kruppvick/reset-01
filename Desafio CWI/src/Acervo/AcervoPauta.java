package Acervo;

import Dominio.Pauta;

import java.util.ArrayList;
import java.util.List;

public class AcervoPauta {
    private static final List<Pauta> pautas = new ArrayList<>();

    public Pauta cadastrar(Pauta pauta) {
        pautas.add(pauta);
        return pauta;
    }

    public List<Pauta> listar() {
        return pautas;
    }

    public Pauta procurar (int id){
        for (Pauta pauta : pautas){
            if (pauta.getId() == id){
                return pauta;
            }
        }
        return null;
    }
}
