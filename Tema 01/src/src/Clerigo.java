public class Clerigo {

    String nome;
    double vida;
    int ataque;
    double defesa;
    int fe;
    PoderDivino poderDivino;


    public Clerigo(String nome, double vida, int ataque, double defesa, int fe, PoderDivino poderDivino) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
        this.poderDivino = poderDivino;

    }
    void atacar (Barbaro barbaro){
        int poderDeFe = this.poderDivino.poderesDivinos * this.ataque ;
        int dano = (int) (poderDeFe - defesa);
        barbaro.vida -= dano;
        this.fe -= this.poderDivino.custoFe;
        System.out.println(this.nome +  " atacou " + barbaro.nome + " com " + this.poderDivino.nome + " causando " + dano + " de dano.");
    }

    void atacar(Clerigo clerigo){
        int poderDeFe = this.poderDivino.poderesDivinos * this.ataque ;
        int dano = (int) (poderDeFe - defesa);
        clerigo.vida -= dano;
        this.fe -= this.poderDivino.custoFe;
        System.out.println(this.nome +  " atacou " + clerigo.nome + " com " + this.poderDivino.nome + " causando " + dano + " de dano.");
    }
    void atacar(Druida druida){
        int poderDeFe = this.poderDivino.poderesDivinos * this.ataque ;
        int dano = (int) (poderDeFe - defesa);
        druida.vida -= dano;
        this.fe -= this.poderDivino.custoFe;
        System.out.println(this.nome +  " atacou " + druida.nome + " com " + this.poderDivino.nome + " causando " + dano + " de dano.");
    }
    void atacar(Feiticeiro feiticeiro){
        int poderDeFe = this.poderDivino.poderesDivinos * this.ataque ;
        int dano = (int) (poderDeFe - defesa);
        feiticeiro.vida -= dano;
        this.fe -= this.poderDivino.custoFe;
        System.out.println(this.nome +  " atacou " + feiticeiro.nome + " com " + this.poderDivino.nome + " causando " + dano + " de dano.");
    }
    void atacar(Guerreiro guerreiro){
        int poderDeFe = this.poderDivino.poderesDivinos * this.ataque ;
        int dano = (int) (poderDeFe - defesa);
        guerreiro.vida -= dano;
        this.fe -= this.poderDivino.custoFe;
        System.out.println(this.nome +  " atacou " + guerreiro.nome + " com " + this.poderDivino.nome + " causando " + dano + " de dano.");
    }
    void atacar(Mago mago){
        int poderDeFe = this.poderDivino.poderesDivinos * this.ataque ;
        int dano = (int) (poderDeFe - defesa);
        mago.vida -= dano;
        this.fe -= this.poderDivino.custoFe;
        System.out.println(this.nome +  " atacou " + mago.nome + " com " + this.poderDivino.nome + " causando " + dano + " de dano.");
    }


}
