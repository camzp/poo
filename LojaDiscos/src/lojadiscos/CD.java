package lojadiscos;

public class CD extends Produto {
    private String duracao;

    public CD(String duracao, String nome, double preco, int codBar) {
        super(nome, preco,codBar); //pega da classe que herda.
        this.duracao = duracao;
    }
    
    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
}
