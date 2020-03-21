import java.util.ArrayList;
import java.util.List;

public class RegistroCombate {

    private static List <String> registros = new ArrayList<>();
    private final String nome;
    private final String nomeAlvo;
    private final String habilidade;
    private final int dano;
    private final String status;

    public RegistroCombate(String nome, String nomeAlvo, String habilidade, int dano, String status) {
        this.nome = nome;
        this.nomeAlvo = nomeAlvo;
        this.habilidade = habilidade;
        this.dano = dano;
        this.status = status;
    }

    public void imprimir(){
            for (String registro: registros){
                System.out.println(registro);
            }
        }
    public String getNome() {
        return nome;
    }

    public String getNomeAlvo() {
        return nomeAlvo;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public int getDano() {
        return dano;
    }

    public String getStatus() {
        return status;
    }


}

