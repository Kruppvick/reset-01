package Exercicio3;

public class notasdealunos {
    public static void main(String[] args) {

        Aluno jose = new Aluno("Jose Alfredo", 8.0);
        System.out.println("O aluno:" + jose.nome);
        System.out.println("Nota final:" + jose.nota);
        System.out.println("Situacao de Aprovacao:" + jose.aprovado());

        Aluno pipa = new Aluno("Pipa Krupp", 10.0);
        System.out.println("O aluno:" + pipa.nome);
        System.out.println("Nota final:" + pipa.nota);
        System.out.println("Situacao de Aprovacao:" + pipa.aprovado());

        Aluno oscar = new Aluno("Oscar Krupp", 7.0);
        System.out.println("O aluno:" + oscar.nome);
        System.out.println("Nota final:" + oscar.nota);
        System.out.println("Situacao de Aprovacao:" + oscar.aprovado());

        Aluno victoria = new Aluno("Victoria Krupp", 6.99);
        System.out.println("O aluno:" + victoria.nome);
        System.out.println("Nota final:" + victoria.nota);
        System.out.println("Situacao de Aprovacao:" + victoria.aprovado());
    }
}
