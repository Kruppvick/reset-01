public abstract class HomemArma extends Personagem {

    protected HomemArma(final String nome, double vida, final double ataque, final double defesa) {
        super(nome, vida, ataque, defesa);

    }
    void atacar(Personagem alvo, Arma arma) {

        double dano = calcularDano(alvo.defesa, arma.poderAtaque);


        if (this.vida <= 0) {
            registrarAusenciaAtaque(alvo.nome);          /* em caso do personagem estar morto, é ignorado também */
        }
        else {
            if (alvo.defesa > (dano + alvo.defesa )) {
                registrarDefesa(alvo.nome, arma.nome);
            }
        }

        alvo.vida -= dano;
        registrarAtaque(alvo.nome, arma.nome, dano);
    }
    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
    }
}



