package oficinamecânica;

/**
 *
 * @author camila
 */
public class Cliente {
    private String nome;
    private String modelo;
    private String placa;


    public Cliente (){
        this.nome = null;
        this.modelo = null;
        this.placa = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void cadastra (String nome, String modelo,  String placa ){
        this.nome = nome;
        this.modelo = modelo;
        this.placa = placa;
    }
    
 
}

