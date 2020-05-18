package com.example.demo.Console;

import com.example.demo.Dominio.OpcaoVoto;
import com.example.demo.Dominio.Pauta;
import com.example.demo.Dominio.ResultadoSessao;
import com.example.demo.Regras.RegrasPautas;

import java.util.List;
import java.util.Scanner;

public class MenuPauta {

    private RegrasPautas regras;

    public MenuPauta() {

        this.regras = new RegrasPautas();
    }

    public void opcoes() {
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';
        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção abaixo");
            System.out.println("[ C ] - Cadastrar pauta");
            System.out.println("[ L ] - Listar pauta");
            System.out.println("[ P ] - Procurar");
            System.out.println("[ V ] - Votar Pauta");
            System.out.println("[ R ] - Ressultado sessão");
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

                case 'R':
                    resultadoSessao();
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

        for (Pauta pauta : pautas) {
            System.out.println(pauta);
        }
        return pautas;

    }

    private void procurar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Pautas");
        System.out.println("Qual nome da Pauta?");
        int id = scanner.nextInt();

        Pauta pauta = regras.procurar(id);

        if (pauta == null) {
            System.out.println("Pauta não encontrada");
        } else {
            System.out.println(pauta);
        }
    }

    private void votar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("id da pauta");
        int idPauta = scanner.nextInt();
        String descricao = scanner.nextLine();
        System.out.println("Vote SIM/NÃO");
        System.out.println("SIM");
        System.out.println("NÃO");
        System.out.print(">>>");
        String  voto = scanner.next();

        OpcaoVoto opcaoVoto;
        switch (voto){
            case "SIM":
                opcaoVoto = OpcaoVoto.SIM;
                break;
            case "NAO":
                opcaoVoto = OpcaoVoto.NAO;
                break;
            default:
                opcaoVoto = OpcaoVoto.NAO;
                break;

        }
        System.out.println("Volte ao menu inicial");

    }

    private void resultadoSessao (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("/nQual pauta você gostaria de saber o resultado?");
        int idPauta = scanner.nextInt();

        ResultadoSessao pauta = regras.contabilizarVotos(idPauta);

        if (pauta == null) {
            System.out.println("Pauta não encontrada");
        } else {
            System.out.println(pauta);
    }



    }
}

