package br.com.alura.screenmatch.model;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int epsodiosTemporada;
    private int minutosEpsodio;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsodiosTemporada() {
        return epsodiosTemporada;
    }

    public void setEpsodiosTemporada(int epsodiosTemporada) {
        this.epsodiosTemporada = epsodiosTemporada;
    }

    public int getMinutosEpsodio() {
        return minutosEpsodio;
    }
    public void setMinutosEpsodio(int minutosEpsodio) {
        this.minutosEpsodio = minutosEpsodio;
    }

    @Override
    public int getDuracaoMinutos() {
        return temporadas * epsodiosTemporada * minutosEpsodio;
    }

    @Override
    public String toString() {
        return "Serie " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
