import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraFolhaMensal {


    public static void main(String[] args) {
        System.out.println("----------- Aplicação calculo folha mensal       -----------\n\n");
        int opcao = 0;
        List<Funcionario> funcionarioList = new ArrayList<>();
        while (opcao != 9) {
            imprimeMenu();
            opcao = lerInteiro();
            if (opcao == 1) {
                // Cadastra Engenheiro
                System.out.println("Nome: ");
                String nome = lerString();




//				Engenheiro eng = new ();
            } else if (opcao == 2) {
                // Cadastra Programador

                Programador prog = new Programador("Adolfo", "016.345.180-35", 40000, 4);

            } else if (opcao == 3) {
                // Cadastra Gerente

                Gerente gerente = new Gerente("Bartolomeu","037.318.888.03", 9000,8);
            } else {
                System.out.println("----------- Opção invalida               -----------");
            }
        }
        // Calculo da folha mensal

    }

    private static int lerInteiro() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void imprimeMenu() {
        System.out.println("----------- 1 - Cadastro Engenheiro              -----------");
        System.out.println("----------- 2 - Cadastro Programador             -----------");
        System.out.println("----------- 3 - Cadastro Gerente                 -----------");
        System.out.println("----------- 9 - Calcular e imprimir folha mensal -----------");
    }

}
