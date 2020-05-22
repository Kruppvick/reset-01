package br.com.cwi.assembleiadevotacao.regras;

import br.com.cwi.assembleiadevotacao.acervo.AcervoAssociado;
import br.com.cwi.assembleiadevotacao.dominio.Associado;


import java.util.List;

public class RegrasAssociados {

   private AcervoAssociado acervo = new AcervoAssociado();

    public Associado cadastrar (Associado associado) {

        List<Associado> associados = acervo.listar();
        if (associado.getNome().isEmpty() || associado.getCpf().isEmpty()) {
            throw new RuntimeException("Obrigatório o preenchimento");
        }
        for (Associado associadoJaCadastrado : associados) {
            if (associado.getCpf().equals(associadoJaCadastrado.getCpf())) {
                return associadoJaCadastrado;
            }
        }

        return acervo.cadastrar(associado);
    }


    public Associado procurar (int id){
        if (id>0){
            return acervo.procurar(id);
        }
        return null;
    }

    public List<Associado> listar (){
        return acervo.listar();

    }
}
