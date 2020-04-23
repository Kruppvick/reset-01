package Console;

import Dominio.Curiosidade;
import Dominio.EstilodeCuriosidade;
import Dominio.EstilodeFilme;
import Dominio.Filme;
import Gerenciador.CuriosidadeGerenciador;
import Gerenciador.FilmeGerenciador;

import java.util.List;
import java.util.Scanner;

public class CuriosidadeMenu {

    private CuriosidadeGerenciador gerenciador;

    public CuriosidadeMenu() {
        this.gerenciador = new CuriosidadeGerenciador();
    }

    public void opcoes() {
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';
        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção abaixo - Use letras maiusculas");
            System.out.println("-------------------------------------------------------");
            System.out.println("[ C ] Criar");
            System.out.println("[ E ] Editar");
            System.out.println("[ L ] Listar");
            System.out.println("[ P ] Procurar");
            System.out.println("[ D ] Deletar");
            System.out.println("[ X ] Voltar");
            System.out.println(">>>");

            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    criar();
                    break;
                case 'E':
                    editar();
                    break;

                case 'L':
                    listar();
                    break;

                case 'P':
                    procurar();
                    break;

                case 'D':
                    deletar();
                    break;

                case 'X':
                    System.out.println("Retornar ao menu inicial");
                    break;
            }
        }
    }

    public Curiosidade criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdicionando curiosidade no acervo");

        System.out.println("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Estilo de curiosidades: - Use letras maiusculas");
        System.out.println("[ 1 ] COMPORTAMENTO");
        System.out.println("[ 2 ] EVENTO");
        System.out.println("[ 3 ] APARENCIA");
        System.out.println("[ 4 ] ALIMENTACAO");

        System.out.print(">>>");
        String estilo = scanner.next();

        EstilodeCuriosidade estilodeCuriosidade;
        switch (estilo) {
            case "1":
                estilodeCuriosidade = EstilodeCuriosidade.COMPORTAMENTO;
                break;
            case "2":
                estilodeCuriosidade = EstilodeCuriosidade.EVENTO;
                break;
            case "3":
                estilodeCuriosidade = EstilodeCuriosidade.APARENCIA;
                break;
            case "4":
                estilodeCuriosidade = EstilodeCuriosidade.ALIMENTACAO;
            default:
                estilodeCuriosidade = EstilodeCuriosidade.COMPORTAMENTO;
                break;
        }

        Curiosidade curiosidade = new Curiosidade(descricao, estilodeCuriosidade);
        return gerenciador.salvar(curiosidade);
    }

    public Curiosidade editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEditar curiosidade");
        System.out.println("Qual curiosidade deseja editar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());

        }
        System.out.print(">>>");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Estilo de curiosidades: - Use letras maiusculas");
        System.out.println("[ 1 ] COMPORTAMENTO");
        System.out.println("[ 2 ] EVENTO");
        System.out.println("[ 3 ] APARENCIA");
        System.out.println("[ 4 ] ALIMENTACAO");

        System.out.print(">>>");
        String estilo = scanner.next();

        EstilodeCuriosidade estilodeCuriosidade;
        switch (estilo) {
            case "1":
                estilodeCuriosidade = EstilodeCuriosidade.COMPORTAMENTO;
                break;
            case "2":
                estilodeCuriosidade = EstilodeCuriosidade.EVENTO;
                break;
            case "3":
                estilodeCuriosidade = EstilodeCuriosidade.APARENCIA;
                break;
            case "4":
                estilodeCuriosidade = EstilodeCuriosidade.ALIMENTACAO;
            default:
                estilodeCuriosidade = EstilodeCuriosidade.COMPORTAMENTO;
                break;
        }

        Curiosidade atualizacao = new Curiosidade(descricao, estilodeCuriosidade);
        Curiosidade curiosidadeAtualizada = gerenciador.editar(id, atualizacao);


        if (curiosidadeAtualizada == null) {
            System.out.println("Filme não encontrado no acervo");
        } else {
            System.out.println(curiosidadeAtualizada);
        }
        return curiosidadeAtualizada;
    }

    private List<Curiosidade> listar() {

        System.out.println("\nListagem de Curiosidade");
        List<Curiosidade> curiosidades = gerenciador.listar();

        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);
        }
        return curiosidades;
    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de curiosidade");
        System.out.println("Qual o id da curiosidade?");

        System.out.println(">>>");
        int id = scanner.nextInt();

        Curiosidade curiosidade = gerenciador.procurar(id);

        if (curiosidade == null) {
            System.out.println("Curiosidade não encontrada");
        } else {
            System.out.println(curiosidade);
        }
    }
    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de curiosidade");
        System.out.println("Qual curiosidade deseja deletar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }

        System.out.print(">>>");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.print("Curiosidade deletada!");
        } else {
            System.out.println("Curiosidade não encontrada. ");
        }
    }

}
