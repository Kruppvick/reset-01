import java.util.Scanner;

public class Combate {
    public static void main(String[] args) {
    /* O usuário que tiver escolhido personagens que fazem parte da classe de homens de armas poderá escolher entre as armas disponíveis abaixo */

        Arma espadaLonga = new Arma("Espada Longa", 20);
        Arma machadinho = new Arma("Machadinho", 10);
        Arma arcoLongo = new Arma("Arco Longo", 25);

    /* O usuário que tiver escolhido personagens que fazer parte da classe de arcanos poderá escolher entre as magias disponíveis abaixo */

        Magia raio = new Magia("Raio", 20,5);
        Magia espinho = new Magia("Espinho", 15, 6);
        Magia alquimia = new Magia("Alquimia", 25,10);

    /* O usuário que tiver escolhido personagens que fazer parte da classe de sacerdotes poderá escolher entre os poderes divinos disponíveis abaixo */

        PoderDivino odio = new PoderDivino("Odio", 10,4);
        PoderDivino armaEspiritual = new PoderDivino("Arma Espiritual",12,6 );
        PoderDivino furacao = new PoderDivino("Furacão", 16,7);


        Mago mago1 = new Mago("Mago1", 120, 20,13,40);
        Druida druida1 = new Druida("Druida1", 130,20,3,50);


    /*    for (int i = 0; i < 6; i++) {
            System.out.println(i);
            Scanner in = new Scanner(System.in);
            System.out.println("Crie seu próprio herói!");
            System.out.println("Primeiro, escolha a classe do personagem:");
            System.out.println("G - Guerreiro");
            System.out.println("B - Bárbaro");
            System.out.println("C - Clérigo");
            System.out.println("D - Druida");
            System.out.println("M - Mago");
            System.out.println("F - Feiticeiro");

            System.out.print("Tipo: ");
            char tipo = in.next().charAt(0);
            System.out.print("Nome: ");
            String nome = in.next();
            System.out.print("Vida: ");
            double vida = in.nextDouble();
            System.out.print("Ataque: ");
            double ataque = in.nextDouble();
            System.out.print("Defesa: ");
            double defesa = in.nextDouble();

            int fe;
            int mana;

            switch (tipo) {
                case 'G':
                    System.out.println("Criando guerreiro...");
                    Guerreiro guerreiro = new Guerreiro(nome, vida, ataque, defesa);
                    guerreiro.imprimirEstado();
                    break;

                case 'B':
                    System.out.println("Criando bárbaro...");
                    Barbaro barbaro = new Barbaro(nome, vida, ataque, defesa);
                    barbaro.imprimirEstado();
                    break;

                case 'C':
                    System.out.print("Fé: ");
                    fe = in.nextInt();

                    System.out.println("Criando clérigo...");
                    Clerigo clerigo = new Clerigo(nome, vida, ataque, defesa, fe);
                    clerigo.imprimirEstado();
                    break;

                case 'D':
                    System.out.print("Fé: ");
                    fe = in.nextInt();

                    System.out.println("Criando druida...");
                    Druida druida = new Druida(nome, vida, ataque, defesa, fe);
                    druida.imprimirEstado();
                    break;

                case 'M':
                    System.out.print("Mana: ");
                    mana = in.nextInt();

                    System.out.println("Criando mago...");
                    Mago mago = new Mago(nome, vida, ataque, defesa, mana);
                    mago.imprimirEstado();
                    break;

                case 'F':
                    System.out.print("Mana: ");
                    mana = in.nextInt();

                    System.out.println("Criando feiticeiro...");
                    Feiticeiro feiticeiro = new Feiticeiro(nome, vida, ataque, defesa, mana);
                    feiticeiro.imprimirEstado();
                    break;
            }
        } */
    }


}


