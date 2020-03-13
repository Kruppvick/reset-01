public class Feiticeiro {

    String nome;
    double vida;
    int ataque;
    double defesa;
    int mana;
    Magia magia;



    public Feiticeiro (String nome, double vida, int ataque, double defesa, int mana, Magia magia) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
        this.magia = magia;

    }
    void atacar(Barbaro barbaro){
        int poderMagia = this.magia.poderMagia * this.ataque ;
        int dano = (int) (poderMagia - defesa);
        barbaro.vida -= dano;
        this.mana -= this.magia.custoMana;
        System.out.println(this.nome +  " atacou " + barbaro.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }

    void atacar(Clerigo clerigo){
        int poderMagia = this.magia.poderMagia * this.ataque ;
        int dano = (int) (poderMagia - defesa);
        clerigo.vida -= dano;
        this.mana -= this.magia.custoMana;
        System.out.println(this.nome +  " atacou " + clerigo.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }
    void atacar(Druida druida){
        int poderMagia = this.magia.poderMagia * this.ataque ;
        int dano = (int) (poderMagia - defesa);
        druida.vida -= dano;
        this.mana -= this.magia.custoMana;
        System.out.println(this.nome +  " atacou " + druida.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }
    void atacar(Feiticeiro feiticeiro) {
        int poderMagia = this.magia.poderMagia * this.ataque ;
        int dano = (int) (poderMagia - defesa);
        feiticeiro.vida -= dano;
        this.mana -= this.magia.custoMana;
        System.out.println(this.nome +  " atacou " + feiticeiro.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }
    void atacar(Guerreiro guerreiro){
        int poderMagia = this.magia.poderMagia * this.ataque ;
        int dano = (int) (poderMagia - defesa);
        guerreiro.vida -= dano;
        this.mana -= this.magia.custoMana;
        System.out.println(this.nome +  " atacou " + guerreiro.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }
    void atacar(Mago mago){
        int poderMagia = this.magia.poderMagia * this.ataque ;
        int dano = (int) (poderMagia - defesa);
        mago.vida -= dano;
        this.mana -= this.magia.custoMana;
        System.out.println(this.nome +  " atacou " + mago.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }


}
