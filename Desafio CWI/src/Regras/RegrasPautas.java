package Regras;

import Acervo.AcervoPauta;
import Dominio.Associado;
import Dominio.Pauta;

import java.util.List;

public class RegrasPautas {
    private AcervoPauta acervo = new AcervoPauta();

    public Pauta cadastrar( Pauta pauta) {
        List<Pauta> pautas = acervo.listar();

        return acervo.cadastrar(pauta);
    }

    public List<Pauta> listar (){
        return acervo.listar();

    }

    public Pauta procurar (int id) {
        if (id > 0) {
            return acervo.procurar(id);
        }
        return null;
    }
}
