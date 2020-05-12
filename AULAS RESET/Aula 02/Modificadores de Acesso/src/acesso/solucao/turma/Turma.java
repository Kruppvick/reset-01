package acesso.solucao.turma;
public class Turma {
    private String descricao;

    public Turma(String descricao) {
        this.descricao = descricao;
    }

    private void metodoPrivado() {
        // nao faz nada
    }

    void metodoDefault() {
        // nao faz nada
    }

    public void metodoPublico() {
        // nao faz nada
    }

    protected void metodoProtected() {
        // nao faz nada
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

