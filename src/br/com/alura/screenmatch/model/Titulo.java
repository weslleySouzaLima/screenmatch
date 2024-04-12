package br.com.alura.screenmatch.model;

public class Titulo {

    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaDAsAvaliacoes;
    private int totalAvaliacao;
    private int duracaoMinutos;
    private String nome;

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void exibeFichaTecnica(){
        System.out.println("Nome do filme " + nome);
        System.out.println(" Ano de lançamento " + anoLancamento);
    }

    public void avalia(double nota){
        somaDAsAvaliacoes += nota;
        totalAvaliacao ++;
    }

    public double getMedia(){
        return somaDAsAvaliacoes / totalAvaliacao;
    }

}
