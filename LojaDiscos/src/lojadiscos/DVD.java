package lojadiscos;

public class DVD extends Produto{
    private int numerodeFaixas;

    public DVD(int numerodeFaixas, String nome, double preco, int codBar) {
        super(nome, preco,codBar); //pega da classe que herda.
        this.numerodeFaixas = numerodeFaixas;
    }
    
    public int getNumerodeFaixas() {
        return numerodeFaixas;
    }

    public void setNumerodeFaixas(int numerodeFaixas) {
        this.numerodeFaixas = numerodeFaixas;
    }

    @Override
    public String toString() {
        return "DVD{" + "numerodeFaixas=" + numerodeFaixas + '}';
    }
    
    
    
}
