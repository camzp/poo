

package lojadiscos;

public class LojaDiscos {

    public static void main(String[] args) {
        Produto[] produtos = new Produto[3]; //Criando um vetor de produtos.
        produtos[0] = new Livro("Autor0", "Titulo 0", 50.00, 123);
        produtos[1] = new DVD (10, "Cantor 1", 50.00, 123 );
        produtos[2] = new DVD (10, "Cantor 2", 50.00, 123 );
        
        
        System.out.println(produtos[0].toString());
        System.out.println(produtos[2].equals(produtos[1]));
                
    }
    
}
