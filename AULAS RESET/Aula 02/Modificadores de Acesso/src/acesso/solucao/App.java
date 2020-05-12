package acesso.solucao;

import acesso.solucao.aluno.Aluno;
import acesso.solucao.turma.Turma;

public class App {

    public static void main(String[] args) {

        Turma turma = new Turma("100");

        Aluno aluno = new Aluno(turma, "Neto");
        System.out.println(aluno.getNome());

        Aluno aluno2 = new Aluno(turma, "Robeta");
        System.out.println(aluno2.getNome());
        System.out.println(aluno.getNome());

        final String texto = "Alexandre Silveira Neto";
//        texto = "Outro valor";

    }

}
