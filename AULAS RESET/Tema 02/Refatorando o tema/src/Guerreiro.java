public class Guerreiro extends HomemArma {

    public Guerreiro(final String nome, double vida, final double ataque, final double defesa) {
        super(nome, vida, ataque, defesa);
    }

    boolean isVivo(){

        return this.vida > 0;
    }


}
