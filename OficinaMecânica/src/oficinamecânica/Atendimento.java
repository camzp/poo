package oficinamecânica;
import java.util.Random;

/**
 *
 * @author camila
 */
public class Atendimento {
    private String data;
    private String problemas;
    private String resolucao;
    private Cliente cliente;
    private boolean status; 
    
    public Atendimento(){
        this.status = false;
        this.data = "01/01/1999";
        this.problemas = "Não Cadastrado";
        this.resolucao = "Não Cadastrado";
        this.cliente = new Cliente();
        
    }
    
    public void printAtendimento(){
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Modelo: " + this.cliente.getModelo());
        System.out.println("Placa: " + this.cliente.getPlaca());
        System.out.println("Problema: " + this.problemas);
        System.out.println("Resolução: " + this.resolucao);
    }
    
    public void exclui(){
        this.data = null;
        this.problemas = null ;
        this.resolucao = null ;
        this.cliente.setNome(null);
        this.cliente.setModelo(null);
        this.cliente.setPlaca(null);
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProblemas() {
        return problemas;
    }

    public void setProblemas(String problemas) {
        this.problemas = problemas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        
    }
    

}

