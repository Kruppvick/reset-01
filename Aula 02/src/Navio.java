public class Navio extends Veiculo {

        double lotacaoMaxima;
        String combustivel;

    public Navio(String nome, double velocidadeMaxima, String terreno, double lotacaoMaxima, String combustivel) {
        super(nome, velocidadeMaxima, terreno);
        this.lotacaoMaxima = lotacaoMaxima;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Navio{" +
                "lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}
