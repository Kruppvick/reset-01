package br.com.tinderevolution.tinderevolution.rest;

import Dominio.Jogo;
import Gerenciador.JogoGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/jogo")

public class JogoRest {

    private static int contador = +1;
    private List<Jogo> jogos = new ArrayList<>();
    private JogoGerenciador jogoGerenciador = new JogoGerenciador();


    @GetMapping
    public List<Jogo> listar() {
        return jogoGerenciador.listar();
    }

    @PostMapping("salvar")
    public Jogo salvar(@RequestBody Jogo requestBody) {

        return jogoGerenciador.salvar(requestBody);
    }

    @PutMapping("/{id}")
    public Jogo editar (@PathVariable("id") int id, @RequestBody Jogo requestBody) {
        return jogoGerenciador.editar(id, requestBody);
    }


    @GetMapping("/{id}")
    public Jogo procurar(@PathVariable ("id") int id) {

        return jogoGerenciador.procurar(id);

    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable ("id") int id) {

        jogoGerenciador.deletar(id);
        return "Jogo excluído!";
    }


}
