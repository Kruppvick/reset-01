package Dominio;

public class Curiosidade {
    private int id;
    private String descricao;
    private EstilodeCuriosidade estilodeCuriosidade;

    public Curiosidade(String descricao, EstilodeCuriosidade estilodeCuriosidade) {
        this.descricao = descricao;
        this.estilodeCuriosidade = estilodeCuriosidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EstilodeCuriosidade getEstilodeCuriosidade() {
        return estilodeCuriosidade;
    }

    public void setEstilodeCuriosidade(EstilodeCuriosidade estilodeCuriosidade) {
        this.estilodeCuriosidade = estilodeCuriosidade;
    }

    @Override
    public String toString() {
        return "Curiosidade{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", estilodeCuriosidade=" + estilodeCuriosidade +
                '}';
    }
}


