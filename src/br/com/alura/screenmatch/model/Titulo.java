package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaDAsAvaliacoes;
    private int totalAvaliacao;
    private int duracaoMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 4 caracteres");
        }
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 3));
    }

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

//    Comparando nome da lista de Titulos para ordenacao
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "anoLancamento=" + anoLancamento +
                ", nome='" + nome + '\'' +
                "," +
                "duracaoMinutos" + duracaoMinutos +
                '}';
    }
}
