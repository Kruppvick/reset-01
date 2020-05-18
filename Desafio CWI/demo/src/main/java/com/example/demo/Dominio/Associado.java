package com.example.demo.Dominio;


import com.example.demo.TO.AssociadoTO;

public class Associado {

    private int id;
    private String nome;

    public Associado(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Associado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static AssociadoTO toTO (Associado associado){
        return new AssociadoTO(associado.getId(), associado.getNome());
    }


    @Override
    public String toString() {
        return "Associado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
