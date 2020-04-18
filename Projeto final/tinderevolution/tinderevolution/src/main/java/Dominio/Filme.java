package Dominio;

import java.time.LocalDate;

public class Filme {
    private int id;
    private String nome;
    private String diretor;
    private LocalDate lancamento;
    private EstilodeFilme estilodeFilme;
    private String sinopse;

    public Filme(String nome, String diretor, LocalDate lancamento, EstilodeFilme estilodeFilme, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.lancamento = lancamento;
        this.estilodeFilme = estilodeFilme;
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

    public EstilodeFilme getEstilodeFilme() {
        return estilodeFilme;
    }

    public void setEstilodeFilme(EstilodeFilme estilodeFilme) {
        this.estilodeFilme = estilodeFilme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "id=" + id + "| Nome do filme = " + nome +"| Diretor= " + diretor + "| Lançamento= " + lancamento +"| Estilo de Filme= " + estilodeFilme + "| Sinopse= " + sinopse ;
    }
}
