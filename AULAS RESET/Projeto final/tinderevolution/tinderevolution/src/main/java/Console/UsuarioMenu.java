package Console;

import Dominio.Genero;
import Dominio.Usuario;
import Gerenciador.UsuarioGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UsuarioMenu {
    private UsuarioGerenciador gerenciador;

    public UsuarioMenu() {
        this.gerenciador = new UsuarioGerenciador();
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

    public Usuario criar() {

        Double latitude = 0.0;
        Double longitude = 0.0;

        Scanner scannerint = new Scanner(System.in);
        Scanner scannerln = new Scanner(System.in);
        System.out.println("\nAdicionando usuário nos cadastros");

        System.out.println("Nome: ");
        String nome = scannerln.nextLine();

        System.out.println("E-mail: ");
        String email = scannerln.nextLine();

        System.out.println("Telefone: ");
        String telefone = scannerln.nextLine();

        System.out.println("Ano de nascimento:");
        int ano = scannerint.nextInt();

        System.out.println("Mês de nascimento: ");
        int mes = scannerint.nextInt();

        System.out.println("Dia de nascimento: ");
        int dia = scannerint.nextInt();

        System.out.println("Bio: ");
        String bio = scannerln.nextLine();

        System.out.println("Insira a localização geográfica - Latitude: ");
        latitude = scannerint.nextDouble();

        System.out.println("Longitude: ");
        longitude = scannerint.nextDouble();

        System.out.println("Foto: ");
        String urlFoto = scannerln.nextLine();

        System.out.println("Gênero: ");
        System.out.println("[ F ] FEMININO ");
        System.out.println("[ M ] MASCULINO ");
        System.out.print(">>>");
        String sexo = scannerln.next();

        Genero genero;

        switch (sexo) {
            case "F":
                genero = Genero.FEMININO;
                break;
            case "M":
                genero = Genero.MASCULINO;
                break;
            default:
                genero = Genero.FEMININO;
                break;
        }
        Usuario usuario;

        usuario = new Usuario(nome, email, telefone, genero, LocalDate.of(ano, mes, dia), bio, latitude, longitude, urlFoto);
        return gerenciador.salvar(usuario);
    }

    public Usuario editar() {

        Double latitude = 0.0;
        Double longitude = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEditar Usuário");
        System.out.println("Qual usuário deseja editar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());

        }
        System.out.print(">>>");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("E-mail: ");
        String email = scanner.nextLine();

        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Ano de nascimento:");
        int ano = scanner.nextInt();

        System.out.println("Mês de nascimento: ");
        int mes = scanner.nextInt();

        System.out.println("Dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.println("Bio: ");
        String bio = scanner.nextLine();

        System.out.print("Insira sua localização geográfica- Latitude: ");
        latitude = scanner.nextDouble();

        System.out.print("Longitude: ");
        longitude = scanner.nextDouble();

        System.out.print("Foto: ");
        String urlFoto = scanner.nextLine();

        System.out.println("Gênero: ");
        System.out.println("[ F ] FEMININO ");
        System.out.println("[ M ] MASCULINO ");
        System.out.print(">>>");
        String sexo = scanner.next();


        Genero genero;

        switch (sexo) {
            case "F":
                genero = Genero.FEMININO;
                break;
            case "M":
                genero = Genero.MASCULINO;
                break;
            default:
                genero = Genero.FEMININO;
                break;
        }

        Usuario atualizacao = new Usuario(nome, email, telefone, genero, LocalDate.of(ano, mes, dia), bio, latitude, longitude, urlFoto);
        Usuario usuarioAtualizado = gerenciador.editar(id, atualizacao);

        if (usuarioAtualizado == null) {
            System.out.println("Usuário não encontrado no cadastro");
        } else {
            System.out.println(usuarioAtualizado);
        }
        return usuarioAtualizado;
    }

    private List<Usuario> listar() {

        System.out.println("\nListagem de Usuários");
        List<Usuario> usuarios = gerenciador.listar();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
        return usuarios;
    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de usuário");
        System.out.println("Qual o id do usuário?");

        System.out.println(">>>");
        int id = scanner.nextInt();

        Usuario usuario = gerenciador.procurar(id);

        if (usuario == null) {
            System.out.println("Usuário não encontrado");
        } else {
            System.out.println(usuario);
        }
    }
    private void deletar () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de usuário");
        System.out.println("Qual usuário deseja deletar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }

        System.out.print(">>>");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.print("Usuário deletado!");
        } else {
            System.out.println("Usuário não encontrado. ");
        }
    }
}
