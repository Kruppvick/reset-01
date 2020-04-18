package Dominio;

import java.time.LocalDate;

public class Jogo {
    private int id;
    private String nome;
    private String publisher;
    private LocalDate dataLancamento;
    private EstilodeJogo estilodeJogo;
    private PlataformaJogo plataformaJogo;

    public Jogo(int id, String nome, String publisher, LocalDate dataLancamento, EstilodeJogo estilodeJogo, PlataformaJogo plataformaJogo) {
        this.id = id;
        this.nome = nome;
        this.publisher = publisher;
        this.dataLancamento = dataLancamento;
        this.estilodeJogo = estilodeJogo;
        this.plataformaJogo = plataformaJogo;
    }

}
