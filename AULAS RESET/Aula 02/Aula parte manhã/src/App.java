import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Crie seu combatente:");
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
    }
}

