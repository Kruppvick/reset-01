package Dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sessao {

    private int id;
    private Pauta pauta;
    private StatusSessao statusSessao;
    private TipoDeVoto tipoDeVoto;
    private LocalDate dataAbertura;
    private LocalDate dataEncerramento;
    private List<Integer> votosPauta = new ArrayList<>();

    public Sessao(Pauta pauta, StatusSessao statusSessao, TipoDeVoto tipoDeVoto, LocalDate dataAbertura, LocalDate dataEncerramento) {
        this.pauta = pauta;
        this.statusSessao = statusSessao;
        this.tipoDeVoto = tipoDeVoto;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = dataEncerramento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pauta getPauta() {
        return pauta;
    }

    public void setPauta(Pauta pauta) {
        this.pauta = pauta;
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

    public List<Integer> getVotosPauta() {
        return votosPauta;
    }

    public void setVotosPauta(List<Integer> votosPauta) {
        this.votosPauta = votosPauta;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "id=" + id +
                ", pauta=" + pauta +
                ", statusSessao=" + statusSessao +
                ", tipoDeVoto=" + tipoDeVoto +
                ", dataAbertura=" + dataAbertura +
                ", dataEncerramento=" + dataEncerramento +
                '}';
    }
}
