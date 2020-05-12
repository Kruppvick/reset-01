public abstract class Arcano extends Personagem {

   private double mana;

    public Arcano(final String nome, final double vida, final double ataque, final double defesa,double mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    void atacar(Personagem alvo, Magia magia) {

        double dano = calcularDano(alvo.defesa, magia.poderAtaque);

        if (this.mana <= 0) {    /* em caso do personagem não possuir mana, o ataque é ignorado */
            registrarAtaqueIgnorado(nome);
        }

        if (this.vida <= 0) {
            registrarAusenciaAtaque(alvo.nome);   /* em caso do personagem estar morto, é ignorado também */

        } else {
            if (alvo.defesa > (dano + alvo.defesa)) {
                registrarDefesa(alvo.nome, magia.nome);
            }
        }

        alvo.vida -= dano;
        this.mana -= magia.custoMana;

        if ((alvo.vida <= 0)) {
            alvo.vida = 0;                               /* em caso do personagem ter morrido, parar de contabilizar no console */
            registrarMorte(alvo.nome, magia.nome);
        } else {
            registrarAtaque(alvo.nome, magia.nome, dano);
        }
    }
        void imprimirEstado () {
            System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
        }
    }

