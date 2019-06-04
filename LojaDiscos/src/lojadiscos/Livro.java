package lojadiscos;

public class Livro extends Produto  {
    private String autor;

    public Livro(String autor, String nome, double preco, int codBar) {
        super(nome, preco, codBar); //pega da classe que herda.
        this.autor = autor;
    }
    
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    //item a
    @Override
    public String toString() {
        return super.toString() + "Livros{" + "autor=" + autor + '}';
    }

    
    
    
}
