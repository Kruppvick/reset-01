package com.example.demo.Regras;


import com.example.demo.Acervo.AcervoAssociado;
import com.example.demo.Dominio.Associado;
import com.example.demo.TO.AssociadoTO;


public class RegrasAssociados {

    private AcervoAssociado acervo = new AcervoAssociado();


    public AssociadoTO cadastrar (AssociadoTO associadoTO){
        if (associadoTO != null){
            Associado associadoCadastrado = acervo.cadastrar(AssociadoTO.associar(associadoTO));
            AssociadoTO associadoConsolidado = Associado.toTO(associadoCadastrado);

            return associadoConsolidado;

        }
        return null;
    }

    public Associado procurar (int id){
        if (id>0){
            return acervo.procurar(id);
        }
        return null;
    }

}
