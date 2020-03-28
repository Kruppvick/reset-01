package Console;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        UsuarioMenu usuarioMenu = new UsuarioMenu();
        MusicaMenu musicaMenu = new MusicaMenu();
        FilmeMenu filmeMenu = new FilmeMenu();
        SerieMenu serieMenu = new SerieMenu();


        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("----------------------");
            System.out.println("[ U ] Usuário");
            System.out.println("[ M ] Músicas");
            System.out.println("[ F ] Filmes");
            System.out.println("[ S ] Série");
            System.out.println("[ X ] Encerrar");
            System.out.print(">>>");
            opcao = scanner.next().charAt(0);

            switch (opcao){

                case 'U':
                    usuarioMenu.opcoes();
                    break;

                case 'M':
                    musicaMenu.opcoes();
                    break;

                case  'F':
                    filmeMenu.opcoes();

                case  'S':
                    serieMenu.opcoes();

                case 'X':
                    System.out.println("<<<Encerrando>>>");
                    break;

                default:
                    System.out.println(" OPÇÃO INVÁLIDA");
            }
        }
    }

}
