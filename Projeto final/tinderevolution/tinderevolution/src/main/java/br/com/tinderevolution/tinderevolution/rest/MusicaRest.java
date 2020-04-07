package br.com.tinderevolution.tinderevolution.rest;

import Dominio.Musica;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping

public class MusicaRest {

    private static int contador = 1;

    private static final List<Musica> musicas = new ArrayList<>();


    @GetMapping
    public List<Musica> listar() {
        return musicas;
    }

    @PostMapping
    public Musica salvar(@RequestBody Musica musica) {

        musica.setId(contador++);
        musicas.add(musica);
        return musica;
    }

    @PutMapping("/{id}")
    public Musica editar (@PathVariable ("id") int id, @RequestBody Musica musicaAtualizada) {
        Musica musicaParaAtualizar = procurar(id);

        if (musicaParaAtualizar != null) {
            musicaParaAtualizar.setNome(musicaAtualizada.getNome());
            musicaParaAtualizar.setArtista(musicaAtualizada.getArtista());
            musicaParaAtualizar.setLancamento(musicaAtualizada.getLancamento());
            musicaParaAtualizar.setEstiloMusical(musicaAtualizada.getEstiloMusical());

            return musicaParaAtualizar;
        }
        return null;
    }


    @GetMapping("/{id}")
    public Musica procurar(@PathVariable int id) {
        for (Musica musica : musicas) {
            if (musica.getId() == id) {
                return musica;

            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public boolean deletar(@PathVariable int id) {

        Musica musicaParaDeletar = procurar(id);
        if (musicaParaDeletar != null) {
            return musicas.remove(musicaParaDeletar);
        }
        return false;
    }


}
