package src;

public class Submarino extends Veiculo {

    double lotacaoMaxima;
    String combustivel;
    double profundidadeMaxima;

    public Submarino(String nome, double velocidadeMaxima, String terreno, double lotacaoMaxima, String combustivel, double profundidadeMaxima) {
        super(nome, velocidadeMaxima, terreno);
        this.lotacaoMaxima = lotacaoMaxima;
        this.combustivel = combustivel;
        this.profundidadeMaxima = profundidadeMaxima;
    }

    @Override
    public String toString() {
        return "Submarino{" +
                "lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel='" + combustivel + '\'' +
                ", profundidadeMaxima=" + profundidadeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}


