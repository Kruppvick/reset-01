public class Barbaro {
    String nome;

    double vida;

    double ataque;

    double defesa;

    public Barbaro(String nome, double vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    boolean isVivo (){
        return this.vida > 0;
    }
    double calcularDano (double defesa, double poder){
    if (isVivo()) {
        return ataque * poder - defesa;
    } else {
        return 0;

    }

    }
    void registrar (String alvo, String habilidade, double dano ){
        System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " causando " + dano + " de dano");
    }

    public void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
    }

    void atacar(Guerreiro alvo, Arma arma) {
        double dano = calcularDano(alvo.defesa, arma.poderAtaque);
        alvo.vida -= dano;
        registrar(alvo.nome, arma.nome, dano);
    }

    void atacar(Barbaro alvo, Arma arma) {
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

    public void atacar(Clerigo alvo, Arma arma) {
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

