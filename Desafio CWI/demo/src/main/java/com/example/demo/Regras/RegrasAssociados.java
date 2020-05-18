package com.example.demo.Regras;


import com.example.demo.Acervo.AcervoAssociado;
import com.example.demo.Dominio.Associado;
import com.example.demo.TO.AssociadoTO;

import java.util.List;


public class RegrasAssociados {

    private AcervoAssociado acervo = new AcervoAssociado();

    //rever método cadastrar
    /*public AssociadoTO cadastrar (AssociadoTO associadoTO){

        List<Associado> associadoTOS = acervo.listar();

        if (associadoTO != null){
            Associado associadoCadastrado = acervo.cadastrar(AssociadoTO.associar(associadoTO));
            AssociadoTO associadoConsolidado = Associado.toTO(associadoCadastrado);

            return associadoConsolidado;

        }
        return null;
    } */
    public Associado cadastrar (Associado associado){

        List<Associado> associados = acervo.listar();

        if (associado != null){
            Associado associadoCadastrado = acervo.cadastrar(associado);
            AssociadoTO associadoConsolidado = Associado.toTO(associadoCadastrado);

            return associadoCadastrado;

        }
        return null;
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
