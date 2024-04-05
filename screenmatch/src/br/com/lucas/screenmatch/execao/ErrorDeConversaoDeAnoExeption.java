package br.com.lucas.screenmatch.execao;

public class ErrorDeConversaoDeAnoExeption extends RuntimeException {
    private String mensagem;
    public ErrorDeConversaoDeAnoExeption(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
