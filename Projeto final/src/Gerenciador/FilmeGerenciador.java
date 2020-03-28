package Gerenciador;

import Acervo.FilmeAcervo;
import Dominio.Filme;


import java.time.LocalDate;
import java.util.List;

public class FilmeGerenciador {

    private FilmeAcervo acervo = new FilmeAcervo();

    public Filme salvar(Filme filme){

        List<Filme> filmes = acervo.listar();


        for (Filme filmeExistente : filmes) {
            if (filme.getNome().equals(filmeExistente.getNome())) {
                return filmeExistente;
            }
        }

        /* O cadastro de filme só é válido se for anterior a data do dia */
        if (filme.getLancamento().isAfter(LocalDate.now())) {
            return null;
        }

        return acervo.salvar(filme);
    }

    public Filme editar(int id, Filme filmeAtualizado) {
        Filme filmeParaEditar = procurar(id);

        if (filmeParaEditar == null) {
            return null;
        } else {
            return acervo.editar(filmeParaEditar, filmeAtualizado);
        }
    }

    public List<Filme> listar() {
        return acervo.listar( );
    }

    public Filme procurar(int id){
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
