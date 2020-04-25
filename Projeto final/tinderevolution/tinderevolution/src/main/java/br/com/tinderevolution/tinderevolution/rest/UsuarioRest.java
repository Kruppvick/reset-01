package br.com.tinderevolution.tinderevolution.rest;

import Dominio.*;
import Gerenciador.UsuarioGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")

public class UsuarioRest {

    private UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    @PostMapping
    public Usuario cadastrarUsuario (@RequestBody Usuario requestBody){
        return usuarioGerenciador.salvar(requestBody);
    }

    @GetMapping
    public List<Usuario> listarUsuario (){
        return usuarioGerenciador.listar();
    }

    @GetMapping ("/{id}")
    public Usuario buscarUsuario (@PathVariable("id") int id){
        return usuarioGerenciador.procurar(id);
    }

    @PutMapping("/{id}")
    public Usuario editarUsuario (@PathVariable ("id") int id, @RequestBody Usuario requestBody){
        return usuarioGerenciador.editar(id, requestBody);
    }

    @DeleteMapping ("/{id}")
    public String deletarUsuario (@PathVariable ("id") int id){
        usuarioGerenciador.deletar(id);
        return "Usuário deletado";
    }

    @GetMapping ("/{idUsuario}/musica")
    public List<Musica> listarMusicas (@PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.listarMusicasCurtidas(idUsuario);
    }

    @GetMapping ("/{idUsuario}/filme")
    public List<Filme> listarFilmes (@PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.listarFilmesCurtidos(idUsuario);
    }

    @GetMapping ("/{idUsuario}/serie")
    public List<Serie> listarSerie (@PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.listarSerieCurtida(idUsuario);
    }

    @GetMapping ("/{idUsuario}/jogo")
    public List<Jogo> listarJogo (@PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.listaJogosCurtidos(idUsuario);
    }

    @GetMapping ("/{idUsuario}/esporte")
    public List<Esporte> listarEsporte (@PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.listarEsporteCurtidos(idUsuario);
    }

    @GetMapping ("/{idUsuario}/curiosidade")
    public List<Curiosidade> listarCuriosidade (@PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.listarCuriosidade(idUsuario);
    }

}
