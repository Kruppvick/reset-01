public abstract class Sacerdote extends Personagem {

    double fe;


    protected Sacerdote(final String nome, double vida,final double ataque,final double defesa, double fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    void atacar(Personagem alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        /* Nos casos em que o personagem não carece de vida */

        if (this.vida <= 0) {
            registrarAusenciaAtaque(alvo.nome);
        }
        else {
            if (alvo.defesa > (dano + alvo.defesa )) {
                registrarDefesa(alvo.nome, poderDivino.nome);
            }
        }
        alvo.vida -= dano;
        this.fe -= poderDivino.custoFe;
        registrarAtaque(alvo.nome, poderDivino.nome, dano);
    }
    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }

}
