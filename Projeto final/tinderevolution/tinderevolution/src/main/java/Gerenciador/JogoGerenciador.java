package Gerenciador;

import Acervo.JogoAcervo;
import Dominio.Jogo;

import java.time.LocalDate;
import java.util.List;

public class JogoGerenciador {
    private JogoAcervo acervo = new JogoAcervo();

    public Jogo salvar(Jogo jogo){

        List<Jogo> jogos = acervo.listar();
        if (jogo.getNome().isEmpty() || jogo.getDataLancamento() == null || jogo.getEstilodeJogo() == null || jogo.getPlataformaJogo() == null){
            throw new RuntimeException("Obrigatório o preenchimento de todos os campos");
        }


        for (Jogo jogoExistente : jogos) {
            if (jogo.getNome().equals(jogoExistente.getNome())) {
                return jogoExistente;
            }
        }

        /* O cadastro de jogo só é válido se for anterior a data do dia */
        if (jogo.getDataLancamento().isAfter(LocalDate.now())) {
            return null;
        }

        return acervo.salvar(jogo);
    }

    public Jogo editar(int id, Jogo jogoAtualizado) {
        Jogo jogoParaEditar = procurar(id);

        if (jogoParaEditar == null) {
            return null;
        } else {
            return acervo.editar(jogoParaEditar, jogoAtualizado);
        }
    }
    public List<Jogo> listar() {
        return acervo.listar( );
    }

    public Jogo procurar(int id){
        if (id>0) {
            return acervo.procurar(id);
        }

        return null;
    }

    public boolean deletar (int id){
        if (id>0){
            return acervo.deletar(id);
        }
        return false;
    }

}
