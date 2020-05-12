package Regras;

import Acervo.AcervoAssociado;
import Dominio.Associado;

import java.util.List;

public class RegrasAssociados {
    private AcervoAssociado acervo = new AcervoAssociado();

    public Associado cadastrar(Associado associado) {
        List<Associado> associados = acervo.listar();

        return acervo.cadastrar(associado);
    }
}
