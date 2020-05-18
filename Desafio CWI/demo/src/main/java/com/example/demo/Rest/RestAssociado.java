package com.example.demo.Rest;

import com.example.demo.Regras.RegrasAssociados;
import com.example.demo.TO.AssociadoTO;

@RestController
 @RequestMapping("/associado")
    public class RestAssociado {

        private RegrasAssociados regrasAssociados = new RegrasAssociados();

        @PostMapping
        public AssociadoTO cadastrarAssociado (@RequestBody AssociadoTO requestBody){
            return regrasAssociados.cadastrar(requestBody);
        }

    }

}
