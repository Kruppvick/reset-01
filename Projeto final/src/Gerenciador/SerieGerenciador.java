package Gerenciador;

import Acervo.SerieAcervo;
import Dominio.Serie;

import java.time.LocalDate;
import java.util.List;

public class SerieGerenciador {

    private SerieAcervo acervo = new SerieAcervo();

    public Serie salvar(Serie serie){

        List<Serie> series = acervo.listar();
        if (serie.getNome().isEmpty() || serie.getDiretor().isEmpty() || serie.getLancamento() ==null || serie.getNumeroDeTemporadas() ==0 || serie.getNumeroDeEpisodios() == 0 || serie.getEstiloDeSerie() == null || serie.getSinopse().isEmpty()){
            throw new RuntimeException("Obrigatório o preenchimento de todos os campos");

        }


        for (Serie serieExistente : series) {
            if (serie.getNome().equals(serieExistente.getNome())) {
                return serieExistente;
            }
        }

        /* O cadastro de série só é válido se for anterior a data do dia */
        if (serie.getLancamento().isAfter(LocalDate.now())) {
            return null;
        }
        return acervo.salvar(serie);
    }

    public Serie editar(int id, Serie serieAtualizada) {
        Serie serieParaEditar = procurar(id);

        if (serieParaEditar == null) {
            return null;
        } else {
            return acervo.editar(serieParaEditar, serieAtualizada);
        }
    }

    public List<Serie> listar() {
        return acervo.listar( );
    }

    public Serie procurar(int id){
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
