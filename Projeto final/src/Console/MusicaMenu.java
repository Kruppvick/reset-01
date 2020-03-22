package Console;

import Gerenciador.MusicaGerenciador;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MusicaMenu {

    private MusicaGerenciador gerenciador;

    public MusicaMenu(){
    this.gerenciador = MusicaGerenciador();
    }
    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';
        while (opcao != 'X'){

            System.out.println("\nSelecione uma opção abaixo - Use letras maiusculas");
            System.out.println("|[ C ] Criar" );
            System.out.println("[ L ] Listar");
            System.out.println("[ P ] Procurar");
            System.out.println("[ D ] Deletar");
            System.out.println("[ X ] Voltar |");
            System.out.println(">>>");

            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    criar();
                    break;

                 case  'L';
                 listar();
                 break;

                 case  'P';
                 procurar();
                 break;

                 case 'D';
                 deletar();
                 break;

                 case 'X';
                 System.out.println("Retornar ao menu inicial");
                 break;

                default:
                    System.out.println("<<<< Opçao inválida >>>>");

            }
        }
    }
    //FALTA TERMINAR //
}
