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
    private Double latitude;
    private Double longitude;
    private String urlFoto;


    public Usuario(int id, String nome, String email, String telefone, Genero genero, LocalDate dataDeNascimento, String bio, Double latitude, Double longitude, String urlFoto) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.genero = genero;
        this.dataDeNascimento = dataDeNascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
        this.urlFoto = urlFoto;
    }


    public Usuario(String nome, String email, String telefone, Genero genero, LocalDate of, String bio, Double latitude, Double longitude, String urlFoto) {
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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", genero=" + genero +
                ", dataDeNascimento=" + dataDeNascimento +
                ", bio='" + bio + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }
}
