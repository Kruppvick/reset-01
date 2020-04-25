package Dominio;

import java.time.LocalDate;

public class Jogo {
    private int id;
    private String nome;
    private String publisher;
    private LocalDate dataLancamento;
    private EstilodeJogo estilodeJogo;
    public PlataformaJogo plataformaJogo;

    public Jogo(String nome, String publisher, LocalDate dataLancamento, EstilodeJogo estilodeJogo, PlataformaJogo plataformaJogo) {
        this.id = id;
        this.nome = nome;
        this.publisher = publisher;
        this.dataLancamento = dataLancamento;
        this.estilodeJogo = estilodeJogo;
        this.plataformaJogo = plataformaJogo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public EstilodeJogo getEstilodeJogo() {
        return estilodeJogo;
    }

    public void setEstilodeJogo(EstilodeJogo estilodeJogo) {
        this.estilodeJogo = estilodeJogo;
    }

    public PlataformaJogo getPlataformaJogo() {
        return plataformaJogo;
    }

    public void setPlataformaJogo(PlataformaJogo plataformaJogo) {
        this.plataformaJogo = plataformaJogo;
    }


}
