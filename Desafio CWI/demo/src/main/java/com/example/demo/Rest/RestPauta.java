package com.example.demo.Rest;

import com.example.demo.Dominio.Pauta;
import com.example.demo.Dominio.ResultadoSessao;
import com.example.demo.Regras.RegrasPautas;

@RestController
 @RequestMapping ("/pauta")
    public class RestPauta {


        private RegrasPautas regrasPautas = new RegrasPautas();

        @PostMapping
        public Pauta cadastrarPauta (@RequestBody Pauta requestBody){
            return regrasPautas.cadastrar(requestBody);

        }

        @PostMapping("/votar/{idPauta}")
        public boolean votar (@PathVariable("idPauta") int idPauta, @RequestBody Voto requestBody){
            return regrasPautas.votar(idPauta, requestBody);
        }

        @GetMapping ("/{idPauta}/resultado")
        public ResultadoSessao resultadoSessao (@PathVariable ("idPauta"), int idPauta){
            ResultadoSessao resultadoSessao = regrasPautas.contabilizarVotos(idPauta);

            return resultadoSessao;
        }
}
