package br.com.cwi.assembleiadevotacao.dominio;

public class ResultadoSessao {
    private int idPauta;
    private int sim = 0;
    private int nao = 0;
    private String resultado;

    public ResultadoSessao(int idPauta, int sim, int nao) {
        this.idPauta = idPauta;
        this.sim = sim;
        this.nao = nao;

        if (sim>nao){
            resultado = "Pauta Aprovada";
        }
        if (sim<nao){
            resultado = "Pauta reprovada";
        }
        if(sim == nao){
            resultado = "Repetir votação.";
        }
    }

    public int getIdPauta() {
        return idPauta;
    }

    public void setIdPauta(int idPauta) {
        this.idPauta = idPauta;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    public int getNao() {
        return nao;
    }

    public void setNao(int nao) {
        this.nao = nao;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
