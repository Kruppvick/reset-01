package br.com.tinderevolution.tinderevolution.rest;


import Dominio.Filme;
import Gerenciador.FilmeGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filme")

public class FilmeRest {

    private static int contador = +1;
    private List<Filme> filmes = new ArrayList<>();
    private FilmeGerenciador filmeGerenciador = new FilmeGerenciador();


    @GetMapping
    public List<Filme> listar() {
        return filmeGerenciador.listar();
    }

    @PostMapping("salvar")
    public Filme salvar(@RequestBody Filme requestBody) {

        return filmeGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Filme editar (@PathVariable("id") int id, @RequestBody Filme requestBody) {
        return filmeGerenciador.editar(id, requestBody);
    }


    @GetMapping("/{id}")
    public Filme procurar(@PathVariable ("id") int id) {

        return filmeGerenciador.procurar(id);

    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable ("id") int id) {

        filmeGerenciador.deletar(id);
        return "Filme excluída!";
    }

}
