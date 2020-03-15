package src;

public class Aviao extends Veiculo  {

        String nome;
        double lotacaoMaxima;
        double combustivel;
        double numeroDeRodas;
        double altitudeMaxima;

    public Aviao(String nome, double velocidadeMaxima, String terreno, String nome1, double lotacaoMaxima, double combustivel, double numeroDeRodas, double altitudeMaxima) {
        super(nome, velocidadeMaxima, terreno);
        this.nome = nome1;
        this.lotacaoMaxima = lotacaoMaxima;
        this.combustivel = combustivel;
        this.numeroDeRodas = numeroDeRodas;
        this.altitudeMaxima = altitudeMaxima;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "nome='" + nome + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel=" + combustivel +
                ", numeroDeRodas=" + numeroDeRodas +
                ", altitudeMaxima=" + altitudeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}
