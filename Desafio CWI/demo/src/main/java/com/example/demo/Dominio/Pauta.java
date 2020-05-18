package com.example.demo.Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pauta {
    private int id;
    private String nomeDaPauta;
    private String descricao;
    private int tempoVotacao;
    private LocalDateTime dataLimite;
    private List<Voto> votosRealizado = new ArrayList<>();

    public Pauta(String nomeDaPauta, String descricao) {
        this.nomeDaPauta = nomeDaPauta;
        this.descricao = descricao;

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

    public int getTempoVotacao() {
        return tempoVotacao;
    }

    public void setTempoVotacao(int tempoVotacao) {
        this.tempoVotacao = tempoVotacao;
    }

    public LocalDateTime getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDateTime dataLimite) {
        this.dataLimite = dataLimite;
    }

    public List<Voto> getVotosRealizado() {
        return votosRealizado;
    }

    public void setVotosRealizado(List<Voto> votosRealizado) {
        this.votosRealizado = votosRealizado;
    }

    public void votar(Voto voto){
        votosRealizado.add(voto);

    }

    public boolean  associadoPodeVotar (int idAssociado){
        for (Voto voto : votosRealizado){
            if (voto.getIdAssociado().equals(idAssociado)){
                return false;
            }
        }
        return true;
    }
    public LocalDateTime tempoVotacao (Integer tempoVotacao){
        int tempoDefault = 1;
        if (tempoVotacao != null && tempoVotacao !=0){
            return LocalDateTime.now().plusMinutes(tempoVotacao);
        }
        else {
            return LocalDateTime.now().plusMinutes(tempoDefault);
        }
    }

    @Override
    public String toString() {
        return "Pauta{" +
                "nomeDaPauta='" + nomeDaPauta + '\'' +
                ", descricao='" + descricao + '\'' +
                ", votosRealizado=" + votosRealizado +
                '}';
    }
}
