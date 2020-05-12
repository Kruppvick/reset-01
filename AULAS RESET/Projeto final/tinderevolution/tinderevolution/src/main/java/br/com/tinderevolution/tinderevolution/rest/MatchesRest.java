package br.com.tinderevolution.tinderevolution.rest;

import Dominio.Usuario;
import Gerenciador.UsuarioGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchesRest {

    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    @PostMapping("/{idUsuarioAvaliado}/avaliador/{idUsuarioAvaliador}/like")
    public boolean curtirUsuario (@PathVariable("idUsuarioAvaliado") int idUsuarioAvalido, @PathVariable ("idUsuarioAvaliador") int idUsuarioAvaliador){
        return usuarioGerenciador.curtirUsuario(idUsuarioAvalido, idUsuarioAvaliador);
    }

    @PostMapping("/{idUsuarioAvaliado}/avaliador/{idUsuarioAvaliador}/dislike")
    public boolean dislikeUsuario (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvaliado, @PathVariable ("idUsuarioAvaliador") int idUsuarioAvaliador){
        return usuarioGerenciador.dislikeUsuario(idUsuarioAvaliado, idUsuarioAvaliador);
    }

    @DeleteMapping ("/{idUsuarioAvaliado}/avaliador/{idUsuarioAvaliador}/like")
    public String deletarCurtidaUsuario (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvaliado, @PathVariable ("idUsuarioAvaliador") int idUsuarioAvaliador){
        usuarioGerenciador.deletarCurtidaUsuario(idUsuarioAvaliado,idUsuarioAvaliador);
        return "Like deletado";
    }

    @DeleteMapping("/{idUsuarioAvaliado}/avaliador/{idUsuarioAvaliador}/dislike")
    public String deletarDislikeUsuario (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvaliado, @PathVariable ("idUsuarioAvaliador") int idUsuarioAvaliador){
        usuarioGerenciador.deletarCurtidaUsuario(idUsuarioAvaliado, idUsuarioAvaliador);
        return "Dislike deletado";
    }

    @GetMapping ("/{idUsuarioAvaliado}")
    public List<Usuario> listarMatches (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvaliado){
        return usuarioGerenciador.formarMatches(idUsuarioAvaliado);
    }

    @GetMapping("/{idUsuario}/best")
    public Usuario listarUsuarioBest (@PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.ranking(idUsuario);
    }

}
