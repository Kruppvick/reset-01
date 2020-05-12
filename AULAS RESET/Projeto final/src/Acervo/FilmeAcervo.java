package Acervo;

import Dominio.Filme;


import java.util.ArrayList;
import java.util.List;

public class FilmeAcervo {

    private static int contador = +1;
    private static final List<Filme> filmes = new ArrayList<>();

    public Filme salvar (Filme filme){

        filme.setId(contador++);
        filmes.add(filme);
        return filme;
    }
    public Filme editar (Filme filmeParaEditar, Filme filmeAtualizado){

        filmeParaEditar.setNome(filmeAtualizado.getNome());
        filmeParaEditar.setDiretor(filmeAtualizado.getDiretor());
        filmeParaEditar.setLancamento(filmeAtualizado.getLancamento());
        filmeParaEditar.setEstilodeFilme(filmeAtualizado.getEstilodeFilme());
        filmeParaEditar.setSinopse(filmeAtualizado.getSinopse());

        return filmeParaEditar;
    }
    public List<Filme> listar () {
        return filmes;
    }
    public Filme procurar (int id) {
        for (Filme filme : filmes){
            if (filme.getId () == id){
                return filme;

            }
        }
        return null;
    }
    public boolean deletar (int id){
        Filme filmeParaDeletar = procurar(id);
        if (filmeParaDeletar != null){
            return filmes.remove(filmeParaDeletar);
        }
        return false;
    }



}
