package br.com.tinderevolution.tinderevolution.rest;

import Dominio.Jogo;
import Dominio.Serie;
import Gerenciador.JogoGerenciador;
import Gerenciador.SerieGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/serie")

public class SerieRest {

    private static int contador = +1;
    private List<Serie> series = new ArrayList<>();
    private SerieGerenciador serieGerenciador = new SerieGerenciador();


    @GetMapping
    public List<Serie> listar() {
        return serieGerenciador.listar();
    }

    @PostMapping("salvar")
    public Serie salvar(@RequestBody Serie requestBody) {

        return serieGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Serie editar (@PathVariable("id") int id, @RequestBody Serie requestBody) {
        return serieGerenciador.editar(id, requestBody);
    }


    @GetMapping("/{id}")
    public Serie procurar(@PathVariable ("id") int id) {

        return serieGerenciador.procurar(id);

    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable ("id") int id) {

        serieGerenciador.deletar(id);
        return "Serie excluída!";
    }
}
