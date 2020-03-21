package acesso.solucao.aluno;

import acesso.solucao.turma.Turma;

public class Aluno {
    private Turma turma;

    //    private static String nome;
//    private final String nome;
    private String nome;

    private int idade;

    public Aluno(Turma turma, String nome) {

        this.turma = turma;
        this.nome = nome;
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
