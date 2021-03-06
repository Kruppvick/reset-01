package Console;

import Dominio.EstiloMusical;
import Dominio.Musica;
import Gerenciador.MusicaGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MusicaMenu {

    private MusicaGerenciador gerenciador;

    public MusicaMenu() {
        this.gerenciador = new MusicaGerenciador();
    }

    public void opcoes() {
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';
        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção abaixo - Use letras maiusculas");
            System.out.println("|[ C ] Criar");
            System.out.println("[ E ] Editar");
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

                default:
                    System.out.println("<<<< Opçao inválida >>>>");

            }
        }
    }

    public Musica criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdicionando música no acervo");

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Artista/Banda: ");
        String artista = scanner.nextLine();

        System.out.println("Ano de lançamento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de lançamento");
        int mes = scanner.nextInt();

        System.out.println("Dia de lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo musical: - Use letras maiusculas");
        System.out.println("[ F ] FUNK");
        System.out.println("[ P ] PAGODE");
        System.out.println("[ R ] ROCK");
        System.out.println("[ I ] INDIE");
        System.out.println("[ S ] SERTANEJO");
        System.out.println("[ M ] METAL");
        System.out.print(">>>");
        String estilo = scanner.next();

        EstiloMusical estiloMusical;
        switch (estilo) {
            case "F":
                estiloMusical = EstiloMusical.FUNK;
                break;
            case "P":
                estiloMusical = EstiloMusical.PAGODE;
                break;
            case "R":
                estiloMusical = EstiloMusical.ROCK;
                break;
            case "I":
                estiloMusical = EstiloMusical.INDIE;
                break;
            case "S":
                estiloMusical = EstiloMusical.SERTANEJO;
                break;
            case "M":
                estiloMusical = EstiloMusical.METAL;
                break;
            default:
                estiloMusical = EstiloMusical.FUNK;
                break;
        }
        Musica musica = new Musica(nome, artista, estiloMusical, LocalDate.of(ano, mes, dia));
        return gerenciador.salvar(musica);
    }

    public Musica editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEditar música");
        System.out.println("Qual música deseja editar?");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println("[" + musica.getId() + "] - " + musica.getNome());

        }
        System.out.print(">>>");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo musical: - Use letras maiusculas ");
        System.out.println("[ F ] FUNK");
        System.out.println("[ P ] PAGODE");
        System.out.println("[ R ] ROCK");
        System.out.println("[ I ] INDIE");
        System.out.println("[ S ] SERTANEJO");
        System.out.println("[ M ] METAL");
        System.out.print(">>>");
        String estilo = scanner.next();

        EstiloMusical estiloMusical;
        switch (estilo) {
            case "F":
                estiloMusical = EstiloMusical.FUNK;
                break;
            case "P":
                estiloMusical = EstiloMusical.PAGODE;
                break;
            case "R":
                estiloMusical = EstiloMusical.ROCK;
                break;
            case "I":
                estiloMusical = EstiloMusical.INDIE;
                break;
            case "S":
                estiloMusical = EstiloMusical.SERTANEJO;
                break;
            case "M":
                estiloMusical = EstiloMusical.METAL;
                break;
            default:
                estiloMusical = EstiloMusical.FUNK;
                break;
        }

        Musica atualizacao = new Musica(nome, artista, estiloMusical, LocalDate.of(ano, mes, dia));
        Musica musicaAtualizada = gerenciador.editar(id, atualizacao);

        if (musicaAtualizada == null) {
            System.out.println("Música não encontrada no acervo");
        } else {
            System.out.println(musicaAtualizada);
        }
        return musicaAtualizada;
    }

    private List<Musica> listar() {

        System.out.println("\nListagem de Música");
        List<Musica> musicas = gerenciador.listar();

        for (Musica musica : musicas) {
            System.out.println(musica);
        }
        return musicas;
    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de música");
        System.out.println("Qual o id da música?");

        System.out.println(">>>");
        int id = scanner.nextInt();

        Musica musica = gerenciador.procurar(id);

        if (musica == null) {
            System.out.println("Música não encontrada");
        } else {
            System.out.println(musica);
        }
    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de música");
        System.out.println("Qual música deseja deletar?");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println("[" + musica.getId() + "] - " + musica.getNome());
        }

        System.out.print(">>>");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.print("Música deletada!");
        } else {
            System.out.println("Música não encontrada. ");
        }
    }
}


