package Dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pauta {

    private int id;
    private String nomeDaPauta;
    private String descricao;
    private StatusSessao statusSessao;
    private TipoDeVoto tipoDeVoto;
    private LocalDate dataAbertura;
    private LocalDate dataEncerramento;
    private List<Integer> votosRealizado = new ArrayList<>();

    public Pauta(String nomeDaPauta, String descricao, StatusSessao statusSessao, TipoDeVoto tipoDeVoto, LocalDate dataAbertura, LocalDate dataEncerramento, List<Integer> votosRealizado) {
        this.nomeDaPauta = nomeDaPauta;
        this.descricao = descricao;
        this.statusSessao = statusSessao;
        this.tipoDeVoto = tipoDeVoto;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = dataEncerramento;
        this.votosRealizado = votosRealizado;
    }

    public String getNomeDaPauta() {
        return nomeDaPauta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeDaPauta(String nomeDaPauta) {
        this.nomeDaPauta = nomeDaPauta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusSessao getStatusSessao() {
        return statusSessao;
    }

    public void setStatusSessao(StatusSessao statusSessao) {
        this.statusSessao = statusSessao;
    }

    public TipoDeVoto getTipoDeVoto() {
        return tipoDeVoto;
    }

    public void setTipoDeVoto(TipoDeVoto tipoDeVoto) {
        this.tipoDeVoto = tipoDeVoto;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(LocalDate dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public List<Integer> getVotosRealizado() {
        return votosRealizado;
    }

    public void setVotosRealizado(List<Integer> votosRealizado) {
        this.votosRealizado = votosRealizado;
    }

    @Override
    public String toString() {
        return "Pauta{" +
                "nomeDaPauta='" + nomeDaPauta + '\'' +
                ", descricao='" + descricao + '\'' +
                ", statusSessao=" + statusSessao +
                ", tipoDeVoto=" + tipoDeVoto +
                ", dataAbertura=" + dataAbertura +
                ", dataEncerramento=" + dataEncerramento +
                ", votosRealizado=" + votosRealizado +
                '}';
    }
}


