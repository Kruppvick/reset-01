package br.com.cwi.assembleiadevotacao.rest;

import br.com.cwi.assembleiadevotacao.dominio.Associado;
import br.com.cwi.assembleiadevotacao.regras.RegrasAssociados;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/associado")
public class RestAssociado {

    private static int contador = +1;
    private List<Associado> associados = new ArrayList<>();
    private RegrasAssociados regrasAssociados = new RegrasAssociados();

    @GetMapping
    public List<Associado> listar(){
        return regrasAssociados.listar();
    }

    @PostMapping ("cadastrar")
    public Associado cadastrar (@RequestBody Associado requestBody){
        return regrasAssociados.cadastrar(requestBody);
    }

    @GetMapping ("/{id}")
    public Associado procurar(@PathVariable("id") int id){
        return regrasAssociados.procurar(id);
    }

}
