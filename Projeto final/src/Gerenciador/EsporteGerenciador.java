package Gerenciador;

import Acervo.EsporteAcervo;
import Acervo.FilmeAcervo;
import Dominio.Esporte;
import Dominio.Filme;

import java.time.LocalDate;
import java.util.List;

public class EsporteGerenciador {

    private EsporteAcervo acervo = new EsporteAcervo();

    public Esporte salvar(Esporte esporte){

        List<Esporte> esportes = acervo.listar();


        for (Esporte esporteExistente : esportes) {
            if (esporte.getNome().equals(esporteExistente.getNome())) {
                return esporteExistente;
            }
        }
        return acervo.salvar(esporte);
    }

    public Esporte editar(int id, Esporte esporteAtualizado) {
        Esporte esporteParaEditar = procurar(id);

        if (esporteParaEditar == null) {
            return null;
        } else {
            return acervo.editar(esporteParaEditar, esporteAtualizado);
        }
    }

    public List<Esporte> listar() {
        return acervo.listar( );
    }

    public Esporte procurar(int id){
        if (id>0) {
            return acervo.procurar(id);
        }

        return null;
    }

    public boolean deletar (int id){
        if (id>0){
            return acervo.deletar(id);
        }
        return false;
    }

}
