import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

//metodo principal

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("o poderoso chefão");
        filme.setAnoLancamento(1970);
        filme.setDuracaoMinutos(180);

        filme.exibeFichaTecnica();
        filme.avalia(5);
        filme.avalia(10);
        filme.avalia(8);
        System.out.println("Total de avaliações " + filme.getTotalAvaliacao());
        System.out.println(filme.getMedia());
        System.out.println("Duração do filme: " + filme.getDuracaoMinutos());


//        istanciando o objeto Serie

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosTemporada(10);
        lost.setMinutosEpsodio(50);
        System.out.println("duração para maratonar Lost " + lost.getDuracaoMinutos());

//        istanciando o objeto Filme

        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoMinutos(200);

//        istanciando o objeto CalculadoraDeTempo

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

//        istanciando o objeto FiltroRecomendacao

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

//        istanciando o objeto Episodio

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("lost");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}