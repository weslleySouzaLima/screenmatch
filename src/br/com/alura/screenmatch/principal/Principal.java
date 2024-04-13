package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

import java.util.ArrayList;

//metodo principal

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme(1970,"o poderoso chefão");
        meuFilme.setDuracaoMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        System.out.println("Total de avaliações " + meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.getMedia());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoMinutos());


//        istanciando o objeto Serie

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosTemporada(10);
        lost.setMinutosEpsodio(50);
        System.out.println("duração para maratonar Lost " + lost.getDuracaoMinutos());

//        istanciando o objeto Filme

        Filme outroFilme = new Filme(2023,"Avatar");
        outroFilme.setDuracaoMinutos(200);

//        istanciando o objeto CalculadoraDeTempo

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

//        istanciando o objeto FiltroRecomendacao

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

//        istanciando o objeto Episodio

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("lost");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme(2003,"Dogville");
        filmeDoPaulo.setDuracaoMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}