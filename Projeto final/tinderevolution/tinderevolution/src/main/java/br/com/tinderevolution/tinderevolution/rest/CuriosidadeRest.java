package br.com.tinderevolution.tinderevolution.rest;

import Dominio.Curiosidade;
import Gerenciador.CuriosidadeGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/curiosidade")

public class CuriosidadeRest {
    private static int contador = +1;
    private List<Curiosidade> curiosidades = new ArrayList<>();
    private CuriosidadeGerenciador curiosidadeGerenciador = new CuriosidadeGerenciador();


    @GetMapping
    public List<Curiosidade> listar() {
        return curiosidadeGerenciador.listar();
    }

    @PostMapping("salvar")
    public Curiosidade salvar(@RequestBody Curiosidade requestBody) {

        return curiosidadeGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Curiosidade editar (@PathVariable("id") int id, @RequestBody Curiosidade requestBody) {
        return curiosidadeGerenciador.editar(id, requestBody);
    }


    @GetMapping("/{id}")
    public Curiosidade procurar(@PathVariable ("id") int id) {

        return curiosidadeGerenciador.procurar(id);

    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable ("id") int id) {

        curiosidadeGerenciador.deletar(id);
        return "Curiosidade excluída!";
    }

}
