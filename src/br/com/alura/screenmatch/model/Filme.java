package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(int anoLancamento, String nome) {
        super(nome, anoLancamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) getMedia() / 2;
    }

//    Mudando o comportamento
    @Override
    public String toString() {
        return "filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
