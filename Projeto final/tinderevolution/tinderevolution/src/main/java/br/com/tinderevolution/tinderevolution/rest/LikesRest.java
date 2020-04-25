package br.com.tinderevolution.tinderevolution.rest;


import Gerenciador.UsuarioGerenciador;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/likes")
public class LikesRest {

    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    @PostMapping("/musica/{idMusica}/avaliador/{idUsuario}")
    public boolean curtirMusica (@PathVariable("idMusica") int idMusica, @PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.curtirMusica(idMusica, idUsuario);
    }

    @PostMapping ("/filme/{idFilme}/avaliador/{idUsuario}")
    public boolean curtirFilme (@PathVariable ("idFilme") int idFilme, @PathVariable("idUsuario") int idUsuario){
        return usuarioGerenciador.curtirFilme(idFilme, idUsuario);
    }

    @PostMapping ("serie/{idSerie}/avaliador/{idUsuario}")
    public boolean curtirSerie (@PathVariable ("idSerie") int idSerie, @PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.curtirSerie(idSerie, idUsuario);
    }

    @PostMapping ("/jogo/{idJogo}/avaliador/{idUsuario}")
    public boolean curtirJogo (@PathVariable ("idJogo") int idJogo, @PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.curtirJogo(idJogo, idUsuario);
    }

    @PostMapping ("/esporte/{idEsporte}/avaliador/{idUsuario}")
    public boolean curtirEsporte (@PathVariable ("idEsporte") int idEsporte, @PathVariable ("idUsuario") int idUsuario){
        return usuarioGerenciador.curtirEsporte(idEsporte, idUsuario);
    }

    @DeleteMapping ("/musica/{idMusica}/avaliador/{idUsuario}")
    public String descurtirMusica (@PathVariable ("idMusica") int idMusica, @PathVariable ("idUsuario") int idUsuario){
        usuarioGerenciador.dislikeMusica(idMusica, idUsuario);
        return "Música descurtida";
    }

    @DeleteMapping ("filme/{idFilme}/avaliador/{idUsuario}")
    public String descurtirFilme (@PathVariable ("idFilme") int idFilme, @PathVariable ("idUsuario") int idUsuario){
        usuarioGerenciador.dislikeFilme(idFilme, idUsuario);
        return "Filme descurtido";
    }

    @DeleteMapping ("/serie/{idSerie}/avaliador/{idUsuario}")
    public String descurtirSerie (@PathVariable ("idSerie") int idSerie, @PathVariable ("idUsuario") int idUsuario){
        usuarioGerenciador.dislikeSerie(idSerie, idUsuario);
        return "Série descurtida";
    }

    @DeleteMapping ("/jogo/{idJogo}/avaliador/{idUsuario}")
    public String descurtirJogo (@PathVariable ("idJogo") int idJogo, @PathVariable ("idUsuario") int idUsuario){
        usuarioGerenciador.dislikejogo(idJogo, idUsuario);
        return "Jogo descurtido";
    }
    @DeleteMapping("/esporte/{idEsporte}/avaliador/{idUsuario}")
    public String descurtirEsporte (@PathVariable ("idEsporte") int idEsporte, @PathVariable ("idUsuario") int idUsuario){
        usuarioGerenciador.dislikeEsporte(idEsporte, idUsuario);
        return "Esporte descurtido";
    }

}
