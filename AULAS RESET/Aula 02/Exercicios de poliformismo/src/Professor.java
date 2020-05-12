public class Professor extends Pessoa {

    String departamento;
    String  nomeCurso;
    double salario;

    public Professor(String nome, String endereco, double telefone, double cpf, String departamento, String nomeCurso, double salario) {
        super(nome, endereco, telefone, cpf);
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }


    boolean calcularSalarioLiquido (double salario){
        return salario >= 1000;
    }

}
