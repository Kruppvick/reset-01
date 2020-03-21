public class Personagem {

    protected String nome;
    protected double vida;
    protected double ataque;
    protected double defesa;
    private TiposDeClasse tipoClasse;

    public Personagem(String nome, double vida, double ataque, double defesa, TiposDeClasse tipoClasse) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.TiposDeClasse = tipoClasse;
    }


    double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public RegistroCombate getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroCombate registro) {
        this.registro = registro;
    }


}
