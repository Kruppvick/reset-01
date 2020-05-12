package Console;


import Dominio.EstilodeFilme;
import Dominio.Filme;
import Gerenciador.FilmeGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class FilmeMenu {

    private FilmeGerenciador gerenciador;

    public FilmeMenu() {
        this.gerenciador = new FilmeGerenciador();
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

    public Filme criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdicionando filme no acervo");

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.println("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.println("Ano de lançamento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de lançamento");
        int mes = scanner.nextInt();

        System.out.println("Dia de lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo de filme: - Use letras maiusculas");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] ACAO");
        System.out.println("[ M ] MUSICAL");
        System.out.print(">>>");
        String estilo = scanner.next();

        EstilodeFilme estilodeFilme;
        switch (estilo) {
            case "D":
                estilodeFilme = EstilodeFilme.DRAMA;
                break;
            case "C":
                estilodeFilme = EstilodeFilme.COMEDIA;
                break;
            case "S":
                estilodeFilme = EstilodeFilme.SUSPENSE;
                break;
            case "T":
                estilodeFilme = EstilodeFilme.TERROR;
                break;
            case "A":
                estilodeFilme = EstilodeFilme.ACAO;
                break;
            case "M":
                estilodeFilme = EstilodeFilme.MUSICAL;
                break;
            default:
                estilodeFilme = EstilodeFilme.DRAMA;
                break;
        }
        Filme filme = new Filme(nome, diretor, LocalDate.of(ano, mes, dia), estilodeFilme, sinopse);
        return gerenciador.salvar(filme);
    }
    public Filme editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEditar filme");
        System.out.println("Qual filme deseja editar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());

        }
        System.out.print(">>>");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.println("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.println("Ano de lançamento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de lançamento");
        int mes = scanner.nextInt();

        System.out.println("Dia de lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo de filme: - Use letras maiusculas");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] ACAO");
        System.out.println("[ M ] MUSICAL");
        System.out.print(">>>");
        String estilo = scanner.next();

        EstilodeFilme estilodeFilme;
        switch (estilo) {
            case "D":
                estilodeFilme = EstilodeFilme.DRAMA;
                break;
            case "C":
                estilodeFilme = EstilodeFilme.COMEDIA;
                break;
            case "S":
                estilodeFilme = EstilodeFilme.SUSPENSE;
                break;
            case "T":
                estilodeFilme = EstilodeFilme.TERROR;
                break;
            case "A":
                estilodeFilme = EstilodeFilme.ACAO;
                break;
            case "M":
                estilodeFilme = EstilodeFilme.MUSICAL;
                break;
            default:
                estilodeFilme = EstilodeFilme.DRAMA;
                break;
        }

        Filme atualizacao = new Filme(nome, diretor, LocalDate.of(ano, mes, dia), estilodeFilme, sinopse);
        Filme filmeAtualizado = gerenciador.editar(id, atualizacao);

        if (filmeAtualizado == null) {
            System.out.println("Filme não encontrado no acervo");
        } else {
            System.out.println(filmeAtualizado);
        }
        return filmeAtualizado;
    }

    private List<Filme> listar() {

        System.out.println("\nListagem de Filme");
        List<Filme> filmes = gerenciador.listar();

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        return filmes;
    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de filme");
        System.out.println("Qual o id do filme?");

        System.out.println(">>>");
        int id = scanner.nextInt();

        Filme filme = gerenciador.procurar(id);

        if (filme == null) {
            System.out.println("Filme não encontrado");
        } else {
            System.out.println(filme);
        }
    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de filme");
        System.out.println("Qual filme deseja deletar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());
        }

        System.out.print(">>>");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.print("Filme deletado!");
        } else {
            System.out.println("Filme não encontrado. ");
        }
    }
}
