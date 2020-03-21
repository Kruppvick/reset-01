
public class Combate {
    public static void main(String[] args) {

        Guerreiro ranza = new Guerreiro("Ranza", 180, 5, 16, new Arma("espadaLonga", 10));
        Barbaro ragnar = new Barbaro("Ragnar",175,8,12, new Arma("machado",8));
        Feiticeiro joana = new Feiticeiro("Joana",110,8,10, 10 , new Magia("veneno", 6));
        Mago baltazar = new Mago("Baltazar",150,7,20,34, new Magia("Raio",8));
        Druida tupaki = new Druida("Tupaki", 120, 5, 8, 24, new PoderDivino("Espinho", 4));
        Clerigo gideao = new Clerigo("Gideao", 200,8,11, 30, new PoderDivino("Odio", 8));

        ragnar.atacar(gideao);
        gideao.atacar(baltazar);
        baltazar.atacar(tupaki);
        tupaki.atacar(joana);
        joana.atacar(ranza);
        ranza.atacar(ragnar);
        ragnar.atacar(tupaki);
        tupaki.atacar(baltazar);
        baltazar.atacar(joana);
        joana.atacar(ragnar);
        ranza.atacar(gideao);
        gideao.atacar(ranza);

        System.out.println("Personagem: " + ranza.nome + " Total final de vida " + ranza.vida);
        System.out.println("Personagem: " + ragnar.nome + " Total final de vida " + ragnar.vida);
        System.out.println("Personagem: " + baltazar.nome + " Total final de vida: " + baltazar.vida + " Mana final: " + baltazar.mana);
        System.out.println("Personagem: " + joana.nome + " Total final de vida: " + joana.vida + " Mana final: " + joana.mana);
        System.out.println("Personagem: " + gideao.nome + " Total final de vida: " + gideao.vida + " Fé final: " + gideao.fe);
        System.out.println("Personagem: " + tupaki.nome + " Total final de vida: " + tupaki.vida + " Fé final: " + tupaki.fe);

    }

}
