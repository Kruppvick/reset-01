public class Mago {

        String nome;
        double vida;
        int ataque;
        double defesa;
        int mana;

        public Mago (String nome, double vida, int ataque, double defesa, int mana) {
            this.nome = nome;
            this.vida = vida;
            this.ataque = ataque;
            this.defesa = defesa;
            this.mana = mana;

        }

    public void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }


    }


