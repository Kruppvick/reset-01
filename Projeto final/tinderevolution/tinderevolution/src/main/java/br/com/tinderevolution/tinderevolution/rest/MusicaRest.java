package br.com.tinderevolution.tinderevolution.rest;

import Dominio.Musica;
import Gerenciador.MusicaGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musica")

public class MusicaRest {

    private static int contador = +1;
    private List<Musica> musicas = new ArrayList<>();
    private MusicaGerenciador musicaGerenciador = new MusicaGerenciador();


    @GetMapping
    public List<Musica> listar() {
        return musicaGerenciador.listar();
    }

    @PostMapping("salvar")
    public Musica salvar(@RequestBody Musica requestBody) {

        return musicaGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Musica editar (@PathVariable ("id") int id, @RequestBody Musica requestBody) {
        return musicaGerenciador.editar(id, requestBody);
    }


    @GetMapping("/{id}")
    public Musica procurar(@PathVariable ("id") int id) {

                return musicaGerenciador.procurar(id);

    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable ("id") int id) {

        musicaGerenciador.deletar(id);
        return "Música excluída!";
    }


}
