package modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacoes() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" + "e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo()+ " ótima opção para ser ouvido!");
        }
    }
}
