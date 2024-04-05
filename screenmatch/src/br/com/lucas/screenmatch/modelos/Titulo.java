package br.com.lucas.screenmatch.modelos;

import br.com.lucas.screenmatch.execao.ErrorDeConversaoDeAnoExeption;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private Genero genero;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }
    public Titulo(TituloOmdb meuTituloOmdb) {
        if (meuTituloOmdb.year().length() > 4) {
            throw new ErrorDeConversaoDeAnoExeption("Nao conseugui converter o ano," +
                    " pois, tem mais de 04 caractéres");
        }
        this.nome = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime(). substring(0,2));
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnicaFilme(){
        System.out.println("Nome do Filme: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
    }

    public void exibeFichaTecnicaSerie(){
        System.out.println("Nome da Serie: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
    }


    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome ='" + nome + '\'' +
                ", anoDeLancamento =" + anoDeLancamento +
                ", " + "duraçao = "+ duracaoEmMinutos +")";
    }
}
