package src;

public class Caminhao extends Veiculo {

        String nome;
        double lotacaoMaxima;
        double combustivel;
        double numeroDeRodas;

    public Caminhao(String nome, double velocidadeMaxima, String terreno, String nome1, double lotacaoMaxima, double combustivel, double numeroDeRodas) {
        super(nome, velocidadeMaxima, terreno);
        this.nome = nome1;
        this.lotacaoMaxima = lotacaoMaxima;
        this.combustivel = combustivel;
        this.numeroDeRodas = numeroDeRodas;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "nome='" + nome + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel=" + combustivel +
                ", numeroDeRodas=" + numeroDeRodas +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}

