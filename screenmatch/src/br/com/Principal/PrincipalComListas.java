package br.com.Principal;

import br.com.lucas.screenmatch.modelos.Filme;
import br.com.lucas.screenmatch.modelos.Serie;
import br.com.lucas.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 2003);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2013);
        meuFilme.avalia(6);
        Filme filmeDeLucas = new Filme("Forest", 2021);
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost",2000);


        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDeLucas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: "+ filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Juan");
        buscaPorArtista.add("Arthur Morgan");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da Ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulo ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por Ano");
        System.out.println(lista);
    }
}
