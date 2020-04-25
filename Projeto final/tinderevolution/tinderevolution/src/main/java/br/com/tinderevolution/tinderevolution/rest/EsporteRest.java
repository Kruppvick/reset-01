package br.com.tinderevolution.tinderevolution.rest;

import Dominio.Esporte;
import Gerenciador.EsporteGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/esporte")

public class EsporteRest {

    private static int contador = +1;
    private List<Esporte> esportes = new ArrayList<>();
    private EsporteGerenciador esporteGerenciador = new EsporteGerenciador();


    @GetMapping
    public List<Esporte> listar() {
        return esporteGerenciador.listar();
    }

    @PostMapping("salvar")
    public Esporte salvar(@RequestBody Esporte requestBody) {

        return esporteGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Esporte editar (@PathVariable("id") int id, @RequestBody Esporte requestBody) {
        return esporteGerenciador.editar(id, requestBody);
    }


    @GetMapping("/{id}")
    public Esporte procurar(@PathVariable ("id") int id) {

        return esporteGerenciador.procurar(id);

    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable ("id") int id) {

        esporteGerenciador.deletar(id);
        return "Esporte excluído!";
    }

}
