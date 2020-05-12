import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Crie seu proprio mago:");

        System.out.print("Nome: ");
        String nome = in.next();
        System.out.print("Vida: ");
        double vida = in.nextDouble();
        System.out.print("Ataque: ");
        int ataque = in.nextInt();
        System.out.print("Defesa: ");
        double defesa = in.nextDouble();
        System.out.print("Fé: ");
        int fe = in.nextInt();

        System.out.println("Criando clérigo...");
        Mago mago = new Mago(nome, vida, ataque, defesa, fe);
        mago.imprimirEstado();
    }
}
