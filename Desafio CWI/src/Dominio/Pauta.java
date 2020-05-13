package Dominio;

public class Pauta {

    private int id;
    private String nomeDaPauta;
    private String descricao;

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

    @Override
    public String toString() {
        return "Pauta{" +
                "nomeDaPauta='" + nomeDaPauta + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}


