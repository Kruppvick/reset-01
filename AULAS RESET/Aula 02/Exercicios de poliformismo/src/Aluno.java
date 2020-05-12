public class Aluno extends Pessoa {

    String curso;
    double notas;

    public Aluno(String nome, String endereco, double telefone, double cpf, String curso, double notas) {
        super(nome, endereco, telefone, cpf);
        this.curso = curso;
        this.notas = notas;
    }


    boolean aprovado (){
        return notas >=6;

    }
}
