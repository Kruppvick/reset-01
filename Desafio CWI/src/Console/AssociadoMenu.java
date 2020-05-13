package Console;

import Dominio.Associado;
import Regras.RegrasAssociados;

import java.util.Scanner;

public class AssociadoMenu {

    private RegrasAssociados regras;

    public AssociadoMenu(){
        this.regras = new RegrasAssociados();
    }
    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';
        while (opcao != 'X'){

            System.out.println("\nSelecione uma opção abaixo");
            System.out.println("[ C ] - Cadastrar associado ");
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
    public Associado cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdicionando associado");

        System.out.println("Nome do Associado: ");
        String nome = scanner.nextLine();

        Associado associado = new Associado(nome);
        return regras.cadastrar(associado);
    }

}

