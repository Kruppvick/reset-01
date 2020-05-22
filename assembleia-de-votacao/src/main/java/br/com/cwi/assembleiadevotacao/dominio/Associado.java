package br.com.cwi.assembleiadevotacao.dominio;

public class Associado {
    private int id;
    private String nome;
    private String cpf;




    public Associado (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}