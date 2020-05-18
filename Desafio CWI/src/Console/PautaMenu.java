package Console;

import Dominio.Associado;
import Dominio.Pauta;
import Regras.RegrasPautas;

import java.util.List;
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
            System.out.println("[ C ] - Cadastrar pauta");
            System.out.println("[ L ] - Listar pauta");
            System.out.println("[ P ] - Procurar");
            System.out.println("[ V ] - Votar Pauta");
            System.out.println("[ X ] - Voltar ao menu anterior ");

            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    cadastrar();
                    break;

                case 'L':
                    listar();
                    break;

                case 'P':
                    procurar();
                    break;

                case 'V':
                    votar();
                    break;

                case 'X':
                    System.out.println("Voltar ao menu anterior");
                    break;

            }
        }
    }


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
    private List<Pauta> listar() {
        System.out.println("Listagem Pautas");
        List<Pauta> pautas = regras.listar();

        for (Pauta pauta : pautas){
            System.out.println(pauta);
        }
        return pautas;

    }

    private void procurar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Pautas");
        System.out.println("Qual nome da Pauta?");
        int id= scanner.nextInt();

        Pauta pauta = regras.procurar(id);

        if (pauta == null) {
            System.out.println("Pauta não encontrada");
        } else {
            System.out.println(pauta);
        }
    }

    private void votar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma pauta para votar");
        List<Pauta> pautas = regras.listar();

        for (Pauta pauta : pautas) {
            System.out.println(pauta);
        }
    }

}
