package com.example.demo.Console;

import com.example.demo.Dominio.Associado;
import com.example.demo.Regras.RegrasAssociados;

import java.util.List;
import java.util.Scanner;

public class MenuAssociado {

    private RegrasAssociados regras;

    public MenuAssociado (){

        this.regras = new RegrasAssociados();
    }
    public void opcoes(){
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';
        while (opcao != 'X'){

            System.out.println("\nSelecione uma opção abaixo");
            System.out.println("[ C ] - Cadastrar associado ");
            System.out.println("[ L ] - Listar associado");
            System.out.println("[ P ] - Procurar associado");
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

        Associado associado;

        associado = new Associado(nome);
        return regras.cadastrar(associado);
    }

    private List<Associado> listar() {
        System.out.println("Listagem Associados");
        List<Associado> associados = regras.listar();

        for (Associado associado : associados){
            System.out.println(associado);
        }
        return associados;

    }

    private void procurar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Associados");
        System.out.println("Qual id do associado?");
        int id= scanner.nextInt();

        Associado associado = regras.procurar(id);

        if (associado == null) {
            System.out.println("Associado não encontrado");
        } else {
            System.out.println(associado);
        }
    }

}
