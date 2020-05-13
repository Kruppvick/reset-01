package Console;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        AssociadoMenu associadoMenu = new AssociadoMenu();
        PautaMenu pautaMenu = new PautaMenu();


        Scanner scanner = new Scanner(System.in);

        char opcao = ' ';

        while (opcao != '0') {

            System.out.println("\nBem vindo a assembleia de votação");
            System.out.println("\nSelecione uma opção abaixo: ");
            System.out.println("[ A ] Associado");
            System.out.println("[ P ] Pauta");
            opcao = scanner.next().charAt(0);

            switch (opcao) {

                case 'A':
                    associadoMenu.opcoes();
                    break;

                case 'P':
                    pautaMenu.opcoes();
                    break;

            }
        }
    }
}

