public class Barbaro {
    String nome;
    double vida;
    int ataque;
    double defesa;
    Arma arma;


    public Barbaro(String nome, double vida, int ataque, double defesa, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.arma = arma;

    }
    void atacar(Barbaro barbaro){
        int poderAtaque = this.arma.poderAtaque * this.ataque;
        int dano = (int) (poderAtaque - defesa);
        barbaro.vida -= dano;
        System.out.println(this.nome +  " atacou " + barbaro.nome + " com " + this.arma.nome + " causando " + dano + " de dano.");
    }
    void atacar(Guerreiro guerreiro){
        int poderAtaque = this.arma.poderAtaque * this.ataque;
        int dano = (int) (poderAtaque - defesa);
        guerreiro.vida -= dano;
        System.out.println(this.nome +  " atacou " + guerreiro.nome + " com " + this.arma.nome + " causando " + dano + " de dano.");
    }

    void atacar(Clerigo clerigo){
        int poderAtaque = this.arma.poderAtaque * this.ataque;
        int dano = (int) (poderAtaque - defesa);
        clerigo.vida -= dano;
        System.out.println(this.nome +  " atacou " + clerigo.nome + " com " + this.arma.nome + " causando " + dano + " de dano.");
    }
    void atacar(Druida druida){
        int poderAtaque = this.arma.poderAtaque * this.ataque;
        int dano = (int) (poderAtaque - defesa);
        druida.vida -= dano;
        System.out.println(this.nome +  " atacou " + druida.nome + " com " + this.arma.nome + " causando " + dano + " de dano.");
    }
    void atacar(Feiticeiro feiticeiro){
        int poderAtaque = this.arma.poderAtaque * this.ataque;
        int dano = (int) (poderAtaque - defesa);
        feiticeiro.vida -= dano;
        System.out.println(this.nome +  " atacou " + feiticeiro.nome + " com " + this.arma.nome + " causando " + dano + " de dano.");

    }
    void atacar(Mago mago){
        int poderAtaque = this.arma.poderAtaque * this.ataque;
        int dano = (int) (poderAtaque - defesa);
        mago.vida -= dano;
        System.out.println(this.nome +  " atacou " + mago.nome + " com " + this.arma.nome + " causando " + dano + " de dano.");
    }

}
