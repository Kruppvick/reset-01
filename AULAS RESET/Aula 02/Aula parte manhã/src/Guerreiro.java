public class Guerreiro {
    String nome;

    double vida;

    double ataque;

    double defesa;

    public Guerreiro(String nome, double vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    void registrar(String alvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " causando " + dano + " de dano" + nome);
    }

    public void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " \n Vida: " + this.vida + " \n Ataque: " + this.ataque + " \n Defesa: " + this.defesa);
    }

    void atacar(Guerreiro alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }

    public void atacar(Barbaro alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }

    void atacar(Mago alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }

    void atacar(Feiticeiro alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }

    void atacar(Clerigo alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }

    void atacar(Druida alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }

}
