import src.Veiculo;

public class Aviao extends Veiculo {

    String nome;
    double lotacaoMaxima;
    String combustivel;
    double numeroDeRodas;
    double altitudeMaxima;

    public Aviao(String nome, double velocidadeMaxima, String terreno, double lotacaoMaxima, String combustivel, double numeroDeRodas, double altitudeMaxima) {
        super(nome, velocidadeMaxima, terreno);
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
                ", combustivel='" + combustivel + '\'' +
                ", numeroDeRodas=" + numeroDeRodas +
                ", altitudeMaxima=" + altitudeMaxima +
                '}';
    }
}

