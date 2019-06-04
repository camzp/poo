package lojadiscos;

public class Produto {
    //Classes mãe protegidas.
    protected String nome; 
    protected double preco;
    protected int codBar;
    //Classe construtora da Produto.
    public Produto(String nome, double preco,  int codBar) {
        this.nome = nome;
        this.preco = preco;
        this.codBar = codBar;
    }
    //item a
    @Override
    public String toString() {
        return "Produtos{" + "nome=" + nome + ", preco=" + preco + '}';
    }
    

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
   
    //item b, sobrescrever o equals.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.codBar != other.codBar) {
            return false;
        }
        return true;
    }
    

}
