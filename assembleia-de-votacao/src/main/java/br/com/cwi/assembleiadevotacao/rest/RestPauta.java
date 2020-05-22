package br.com.cwi.assembleiadevotacao.rest;

import br.com.cwi.assembleiadevotacao.dominio.Pauta;
import br.com.cwi.assembleiadevotacao.dominio.ResultadoSessao;
import br.com.cwi.assembleiadevotacao.dominio.Voto;
import br.com.cwi.assembleiadevotacao.regras.RegrasPautas;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pauta")
public class RestPauta {

    private RegrasPautas regrasPautas = new RegrasPautas();

    @PostMapping
    public Pauta cadastrarPauta (@RequestBody Pauta requestBody){
        return regrasPautas.cadastrar(requestBody);

    }

    @GetMapping
    public List<Pauta> listar (){
        return regrasPautas.listar();
    }

    @GetMapping("/{id}")
    public Pauta buscarPauta (@PathVariable("id") int id){
        return regrasPautas.procurar(id);
    }

    @PostMapping("/pauta/{idPauta}/associado/{idAssociado}")
    public boolean votar (@PathVariable("idPauta") int idPauta, @RequestBody Voto requestBody){
        return regrasPautas.votar(idPauta, requestBody);
    }

    @GetMapping ("/{idPauta}/resultado")
    public ResultadoSessao resultadoSessao (@PathVariable ("idPauta") int idPauta){
        ResultadoSessao resultadoSessao = regrasPautas.contabilizarVotos(idPauta);

        return resultadoSessao;
    }

}
