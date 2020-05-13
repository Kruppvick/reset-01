package Console;

import Dominio.Pauta;
import Regras.RegrasPautas;

import java.util.Scanner;

public class PautaMenu {

    private RegrasPautas regras;

    public PautaMenu(){

        this.regras = new RegrasPautas();
    }

    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';
        while (opcao != 'X'){

            System.out.println("\nSelecione uma opção abaixo");
            System.out.println("| [ C ] - Cadastrar Pauta");
            System.out.println("[ X ] - Voltar ao menu anterior ");

            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    cadastrar();
                    break;

                case 'X':
                    System.out.println("Voltar ao menu anterior");
                    break;

            }
        }
    }

    //REVER O MÉTODO CADASTRAR

    public Pauta cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdicionando Pauta para votação");

        System.out.println("Nome da Pauta: ");
        String nomeDaPauta = scanner.nextLine();

        System.out.println("Descrição da pauta");
        String descricao = scanner.nextLine();

        Pauta pauta = new Pauta(nomeDaPauta, descricao);
        return regras.cadastrar(pauta);
    }

}
