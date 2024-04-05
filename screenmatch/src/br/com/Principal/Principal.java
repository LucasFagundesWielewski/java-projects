package br.com.Principal;

import br.com.lucas.screenmatch.modelos.Genero;
import br.com.screenmatch.calculo.CalculadoraDeTempo;
import br.com.screenmatch.calculo.FiltroRecomendacao;
import br.com.lucas.screenmatch.modelos.Episodio;
import br.com.lucas.screenmatch.modelos.Filme;
import br.com.lucas.screenmatch.modelos.Serie;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Principal {
    public static void main(String[]args){
        Filme meuFilme = new Filme("O poderoso chefão", 2003);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setGenero(Genero.COMEDIA);
        System.out.println("Duração do filme: "+meuFilme.getDuracaoEmMinutos());
        System.out.println("Genêro: "+meuFilme.getGenero());

        meuFilme.exibeFichaTecnicaFilme();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: "+meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost",2000);
        lost.exibeFichaTecnicaSerie();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(12);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: "+lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2013);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setGenero(Genero.ROMANCE);
        System.out.println("Duração do filme: "+outroFilme.getDuracaoEmMinutos());
        System.out.println("Genêro: "+outroFilme.getGenero());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDeLucas = new Filme("Forest", 2021);
        filmeDeLucas.setDuracaoEmMinutos(200);
        filmeDeLucas.avalia(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDeLucas);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro filme: " +listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do Filme: "+listaDeFilmes.get(0).toString());
    }
}
