package exercicio04;

import java.time.LocalDateTime;

public class Evento {

    private String descricao;
    private String local;
    private LocalDateTime dataHora;

    public Evento(String descricao, String local, LocalDateTime dataHora) {
        this.descricao = descricao;
        this.local = local;
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocal() {
        return local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
