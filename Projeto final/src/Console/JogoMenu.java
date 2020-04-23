package Console;

import Dominio.*;
import Gerenciador.FilmeGerenciador;
import Gerenciador.JogoGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class JogoMenu {

    private JogoGerenciador gerenciador;

    public JogoMenu() {

        this.gerenciador = new JogoGerenciador();

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

    public Jogo criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdicionando jogo no acervo");

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Publisher: ");
        String publisher = scanner.nextLine();
        //Está faltando colocar a condicional de não obrigatoriedade

        System.out.println("Ano de lançamento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de lançamento");
        int mes = scanner.nextInt();

        System.out.println("Dia de lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo de jogo: - Use letras maiusculas");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] ACAO");
        System.out.println("[ M ] MUSICAL");
        System.out.print(">>>");
        String estilo = scanner.next();

        EstilodeJogo estilodeJogo;
        switch (estilo) {
            case "D":
                estilodeJogo = EstilodeJogo.DRAMA;
                break;
            case "C":
                estilodeJogo = EstilodeJogo.COMEDIA;
                break;
            case "S":
                estilodeJogo = EstilodeJogo.SUSPENSE;
                break;
            case "T":
                estilodeJogo = EstilodeJogo.TERROR;
                break;
            case "A":
                estilodeJogo = EstilodeJogo.ACAO;
                break;
            case "M":
                estilodeJogo = EstilodeJogo.MUSICAL;
                break;
            default:
                estilodeJogo = EstilodeJogo.DRAMA;
                break;
        }

        System.out.println("Plataforma do jogo: - Use letras maiusculas");
        System.out.println("[ 1 ] XBOX");
        System.out.println("[ 2 ] PS4");
        System.out.println("[ 3 ] PC");
        System.out.println("[ 4 ] SNES");
        System.out.print("> ");
        int plataforma = scanner.nextInt();

        PlataformaJogo plataformaJogo;
        switch (plataforma) {
            case 1:
                plataformaJogo = PlataformaJogo.XBOX;
                break;
            case 2:
                plataformaJogo = PlataformaJogo.PS4;
                break;
            case 3:
                plataformaJogo = PlataformaJogo.PC;
                break;
            case 4:
                plataformaJogo = PlataformaJogo.SNES;
                break;
            default:
                plataformaJogo = PlataformaJogo.XBOX;
                break;
        }

        Jogo jogo = new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), estilodeJogo, plataformaJogo);
        return gerenciador.salvar(jogo);
    }

    public Jogo editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEditar jogo");
        System.out.println("Qual jogo deseja editar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());

        }
        System.out.print(">>>");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Publisher: ");
        String publisher = scanner.nextLine();
        //Está faltando colocar a condicional de não obrigatoriedade

        System.out.println("Ano de lançamento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de lançamento");
        int mes = scanner.nextInt();

        System.out.println("Dia de lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo de jogo: - Use letras maiusculas");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] ACAO");
        System.out.println("[ M ] MUSICAL");
        System.out.print(">>>");
        String estilo = scanner.next();

        EstilodeJogo estilodeJogo;
        switch (estilo) {
            case "D":
                estilodeJogo = EstilodeJogo.DRAMA;
                break;
            case "C":
                estilodeJogo = EstilodeJogo.COMEDIA;
                break;
            case "S":
                estilodeJogo = EstilodeJogo.SUSPENSE;
                break;
            case "T":
                estilodeJogo = EstilodeJogo.TERROR;
                break;
            case "A":
                estilodeJogo = EstilodeJogo.ACAO;
                break;
            case "M":
                estilodeJogo = EstilodeJogo.MUSICAL;
                break;
            default:
                estilodeJogo = EstilodeJogo.DRAMA;
                break;
        }

            System.out.println("Plataforma do jogo: - Use letras maiusculas");
            System.out.println("[ 1 ] XBOX");
            System.out.println("[ 2 ] PS4");
            System.out.println("[ 3 ] PC");
            System.out.println("[ 4 ] SNES");
            System.out.print("> ");
            int plataforma = scanner.nextInt();


            PlataformaJogo plataformaJogo;
            switch (plataforma) {
                case 1:
                    plataformaJogo = PlataformaJogo.XBOX;
                    break;
                case 2:
                    plataformaJogo = PlataformaJogo.PS4;
                    break;
                case 3:
                    plataformaJogo = PlataformaJogo.PC;
                    break;
                case 4:
                    plataformaJogo = PlataformaJogo.SNES;
                    break;
                default:
                    plataformaJogo = PlataformaJogo.XBOX;
                    break;
            }

            Jogo atualizacao = new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), estilodeJogo, plataformaJogo);
            Jogo jogoAtualizado = gerenciador.editar(id, atualizacao);

            if (jogoAtualizado == null) {
                System.out.println("Jogo não encontrado no acervo");
            } else {
                System.out.println(jogoAtualizado);
            }
            return jogoAtualizado;
        }


    private List<Jogo> listar() {

        System.out.println("\nListagem de Jogos");
        List<Jogo> jogos = gerenciador.listar();

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }
        return jogos;
    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de jogo");
        System.out.println("Qual o id do jogo?");

        System.out.println(">>>");
        int id = scanner.nextInt();

        Jogo jogo = gerenciador.procurar(id);

        if (jogo == null) {
            System.out.println("Jogo não encontrado");
        } else {
            System.out.println(jogo);
        }
    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de jogo");
        System.out.println("Qual jogo deseja deletar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }

        System.out.print(">>>");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.print("Jogo deletado!");
        } else {
            System.out.println("Jogo não encontrado. ");
        }
    }
}












