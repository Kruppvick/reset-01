package Dominio;

import java.time.LocalDate;

public class Serie {

    private int id;
    private String nome;
    private String diretor;
    private LocalDate lancamento;
    private int numeroDeTemporadas;
    private int numeroDeEpisodios;
    private EstiloDeSerie estiloDeSerie;
    private String sinopse;

    public Serie(String nome, String diretor, LocalDate lancamento, int numeroDeTemporadas, int numeroDeEpisodios, EstiloDeSerie estiloDeSerie, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.lancamento = lancamento;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.numeroDeEpisodios = numeroDeEpisodios;
        this.estiloDeSerie = estiloDeSerie;
        this.sinopse = sinopse;
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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public EstiloDeSerie getEstiloDeSerie() {
        return estiloDeSerie;
    }

    public void setEstiloDeSerie(EstiloDeSerie estiloDeSerie) {
        this.estiloDeSerie = estiloDeSerie;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "id= " + id +
                " Nome= " + nome +
                "| Diretor= " + diretor +
                "| Lançamento= " + lancamento +
                "| Número De Temporadas= " + numeroDeTemporadas +
                "| Número De Episódios= " + numeroDeEpisodios +
                "| Estilo De Série= " + estiloDeSerie +
                "| Sinopse= " + sinopse;
    }
}
