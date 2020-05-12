package Dominio;

public class Associado {

    private int id;
    private String nome;

    public Associado(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Associado{" +
                "id=" + id +
                '}';
    }
}
