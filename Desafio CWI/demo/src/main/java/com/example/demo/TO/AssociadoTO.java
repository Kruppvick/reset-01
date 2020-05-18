package com.example.demo.TO;

import com.example.demo.Dominio.Associado;

public class AssociadoTO {

    private int id;
    private String nome;

    public AssociadoTO(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public static Associado associar (AssociadoTO dTO) {
        return new Associado(dTO.getId(), dTO.getNome());

    }
}
