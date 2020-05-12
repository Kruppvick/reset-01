package Acervo;

import Dominio.Pauta;

import java.util.ArrayList;
import java.util.List;

public class AcervoPauta {
    //private static int contador = +1;
    private static final List<Pauta> pautas = new ArrayList<>();

    public Pauta cadastrar(Pauta pauta) {
        //pauta.setNome(contador++);
        pautas.add(pauta);
        return pauta;
    }

    public List<Pauta> listar() {
        return pautas;
    }
}
