package Exercicio3;

public class Aluno {

    String nome;

    double nota;

    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

        boolean aprovado() {
            return nota >= 7.0;
        }

    }
