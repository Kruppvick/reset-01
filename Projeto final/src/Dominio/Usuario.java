package Dominio;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private Genero genero;
    private LocalDate dataDeNascimento;
    private String bio;
    private Double localizacao;

    public Usuario(String nome, String email, String telefone, Genero genero , LocalDate dataDeNascimento, String bio, Double localizacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.genero = genero;
        this.dataDeNascimento = dataDeNascimento;
        this.bio = bio;
        this.localizacao = localizacao;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getDataDeNascimento() {

        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int idadeAtual () {
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = getDataDeNascimento();

        Period p = Period.between(nascimento, hoje);
        int idade = p.getYears();

        return idade;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Double getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Double localizacao) {
        this.localizacao = localizacao;
    }


    @Override
    public String toString() {
        return "id=" + id +
                "| Nome= " + nome +
                "| E-mail= " + email +
                "| Telefone= " + telefone +
                "| Gênero= " + genero +
                "| Data De Nascimento= " + dataDeNascimento +
                "| Bio=" + bio +
                "| Localizção=" + localizacao;
    }


}
