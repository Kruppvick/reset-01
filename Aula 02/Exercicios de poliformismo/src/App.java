public class App {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua Heller, 39");
        aluno.setEndereco("Rua Mauricio Cardoso, 333");
        professor.setEndereco("Av Bento Gonçalves, 89");

        System.out.println(pessoa.obterEtiquetaDeEndereco());
        System.out.println(aluno.obterEtiquetaDeEndereco());
        System.out.println(professor.obterEtiquetaDeEndereco());
    }
}
