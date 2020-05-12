package Acervo;

import Dominio.Associado;

import java.util.ArrayList;
import java.util.List;

public class AcervoAssociado {
    private static int contador = +1;
    private static final List<Associado> associados = new ArrayList<>();

    public Associado cadastrar(Associado associado) {

        associado.setId(contador++);
        associados.add(associado);
        return associado;
    }

    public List<Associado> listar() {
        return associados;
    }
}
