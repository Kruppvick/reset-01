package src;

public class Bicicleta extends Veiculo{


        String nome;
        double numeroDeRodas;

    public Bicicleta(String nome, double velocidadeMaxima, String terreno, String nome1, double numeroDeRodas) {
        super(nome, velocidadeMaxima, terreno);
        this.nome = nome1;
        this.numeroDeRodas = numeroDeRodas;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "nome='" + nome + '\'' +
                ", numeroDeRodas=" + numeroDeRodas +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno='" + terreno + '\'' +
                '}';
    }
}
