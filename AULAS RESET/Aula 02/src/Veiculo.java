package src;

import java.util.Scanner;

public class Veiculo {
    String nome;
    double velocidadeMaxima;
    String terreno;

    public  Veiculo (String nome, double velocidadeMaxima, String terreno ) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.terreno = terreno;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}

