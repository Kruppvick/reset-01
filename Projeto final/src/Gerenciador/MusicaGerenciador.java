package Gerenciador;

import Acervo.MusicaAcervo;
import Dominio.Musica;

import java.time.LocalDate;
import java.util.List;

public class MusicaGerenciador {

    private MusicaAcervo acervo = new MusicaAcervo();

    public Musica salvar(Musica musica) {

        List<Musica> musicas = acervo.listar();

        for (Musica musicaExistente : musicas) {
            if (musica.getNome().equals(musicaExistente.getNome())) {
                return musicaExistente;
            }
        }
        /* O cadastro de música só é válido se for anterior a data do dia */
        if (musica.getLancamento().isAfter(LocalDate.now())) {
            return null;
        }

        return acervo.salvar(musica);
    }

    public List<Musica> listar() {
        return acervo.listar();
    }

    public Musica procurar(int id){
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