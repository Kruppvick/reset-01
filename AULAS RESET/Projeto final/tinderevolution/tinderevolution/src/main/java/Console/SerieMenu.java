package Console;

import Dominio.EstiloDeSerie;
import Dominio.Serie;
import Gerenciador.SerieGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class SerieMenu {
    private SerieGerenciador gerenciador;

    public SerieMenu() {
        this.gerenciador = new SerieGerenciador();
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

    public Serie criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdicionando série no acervo");

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.println("Número de episódios: ");
        int numeroDeEpisodios = scanner.nextInt();

        System.out.println("Número de temporadas: ");
        int numeroDeTemporadas = scanner.nextInt();

        System.out.println("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.println("Ano de lançamento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de lançamento");
        int mes = scanner.nextInt();

        System.out.println("Dia de lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo de Série: - Use letras maiusculas");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] ACAO");
        System.out.println("[ S ] SITCOM");
        System.out.print(">>>");
        String estilo = scanner.next();

        EstiloDeSerie estilodeSerie;
        switch (estilo) {
            case "D":
                estilodeSerie = EstiloDeSerie.DRAMA;
                break;
            case "C":
                estilodeSerie = EstiloDeSerie.COMEDIA;
                break;
            case "S":
                estilodeSerie = EstiloDeSerie.SUSPENSE;
                break;
            case "T":
                estilodeSerie = EstiloDeSerie.TERROR;
                break;
            case "A":
                estilodeSerie = EstiloDeSerie.ACAO;
                break;
            case "M":
                estilodeSerie = EstiloDeSerie.SITCOM;
                break;
            default:
                estilodeSerie = EstiloDeSerie.DRAMA;
                break;
        }
        Serie serie = new Serie(nome, diretor, LocalDate.of(ano, mes, dia), numeroDeEpisodios, numeroDeTemporadas, estilodeSerie, sinopse);
        return gerenciador.salvar(serie);
    }

    public Serie editar() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEditar Série");
        System.out.println("Qual Série deseja editar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());

        }
        System.out.print(">>>");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.println("Número de episódios: ");
        int numeroDeEpisodios = scanner.nextInt();

        System.out.println("Número de temporadas: ");
        int numeroDeTemporadas = scanner.nextInt();

        System.out.println("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.println("Ano de lançamento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de lançamento");
        int mes = scanner.nextInt();

        System.out.println("Dia de lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo de Série: - Use letras maiusculas");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] ACAO");
        System.out.println("[ S ] SITCOM");
        System.out.print(">>>");
        String estilo = scanner.next();

        EstiloDeSerie estiloDeSerie;
        switch (estilo) {
            case "D":
                estiloDeSerie = EstiloDeSerie.DRAMA;
                break;
            case "C":
                estiloDeSerie = EstiloDeSerie.COMEDIA;
                break;
            case "S":
                estiloDeSerie = EstiloDeSerie.SUSPENSE;
                break;
            case "T":
                estiloDeSerie = EstiloDeSerie.TERROR;
                break;
            case "A":
                estiloDeSerie = EstiloDeSerie.ACAO;
                break;
            case "M":
                estiloDeSerie = EstiloDeSerie.SITCOM;
                break;
            default:
                estiloDeSerie = EstiloDeSerie.DRAMA;
                break;
        }

        Serie atualizacao = new Serie(nome, diretor, LocalDate.of(ano, mes, dia), numeroDeEpisodios, numeroDeTemporadas, estiloDeSerie, sinopse);
        Serie serieAtualizada = gerenciador.editar(id, atualizacao);

        if (serieAtualizada == null) {
            System.out.println("Série não encontrada no acervo");
        } else {
            System.out.println(serieAtualizada);
        }
        return serieAtualizada;
    }



    private List<Serie> listar() {

        System.out.println("\nListagem de Série");
        List<Serie> series = gerenciador.listar();

        for (Serie serie : series) {
            System.out.println(serie);
        }
        return series;
    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de série");
        System.out.println("Qual o id da série?");

        System.out.println(">>>");
        int id = scanner.nextInt();

        Serie serie = gerenciador.procurar(id);

        if (serie == null) {
            System.out.println("Série não encontrada");
        } else {
            System.out.println(serie);
        }
    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de série");
        System.out.println("Qual série deseja deletar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }

        System.out.print(">>>");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.print("Série deletada!");
        } else {
            System.out.println("Série não encontrada. ");
        }
    }
}
