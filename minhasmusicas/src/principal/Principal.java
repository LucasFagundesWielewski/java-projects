package principal;

import modelos.MinhasPreferidas;
import modelos.Musica;
import modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Cry Baby");
        minhamusica.setArtistas("The neighbourhood");
        minhamusica.setAlbum("Reflections");

        for (int i = 0; i < 500; i++) {
            minhamusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhamusica.curte();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("Lukitas");
        meupodcast.setHost("Lucas");
        meupodcast.setDescricao("Muito bom, de verdade mesmo!");

        for (int i = 0; i < 2000; i++) {
            meupodcast.reproduz();
        }
        for (int i = 0; i < 2000; i++) {
            meupodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meupodcast);
        preferidas.inclui(minhamusica);
    }
}
