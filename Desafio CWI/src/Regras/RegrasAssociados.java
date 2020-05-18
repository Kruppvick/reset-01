package Regras;

import Acervo.AcervoAssociado;
import Dominio.Associado;


import java.util.List;

public class RegrasAssociados {
    private AcervoAssociado acervo = new AcervoAssociado();


    public Associado cadastrar(Associado associado) {
        List<Associado> associados = acervo.listar();
            for (Associado associadoExiste : associados){
                if (associado.getNome().equals(associadoExiste.getNome())){
                    return associadoExiste;
                }
            }

        return acervo.cadastrar(associado);
    }

    public List<Associado> listar (){
        return acervo.listar();

    }

    public Associado procurar (int id){
        if (id>0){
            return acervo.procurar(id);
        }
        return null;
    }

}
