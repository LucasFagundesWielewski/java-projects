package modelos;

public class Musica extends Audio {
    private String album;
    private String artistas;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacoes() {
        if (this.getTotalReproducoes() > 2000){
            return 10;
        } else {
            return 8;
        }
    }
}
