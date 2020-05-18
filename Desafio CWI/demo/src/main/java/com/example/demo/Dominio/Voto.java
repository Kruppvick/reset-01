package com.example.demo.Dominio;

public class Voto {

    private Integer idAssociado;
    private boolean voto;


    public Voto(Integer idAssociado, boolean voto) {
        this.idAssociado = idAssociado;
        this.voto = voto;
    }

    public Integer getIdAssociado() {
        return idAssociado;
    }

    public void setIdAssociado(Integer idAssociado) {
        this.idAssociado = idAssociado;
    }

    public boolean getVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }

}
