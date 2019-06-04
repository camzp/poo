/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formageometrica;

/**
 *
 * @author camila
 */
public class Circulo implements Figura{
    public final String name = "Circulo";
    private int raio;
    final double pi = 3.14;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    
    
    @Override 
    public double calculaArea(){
      return pi * raio * raio;  
    }
    
        
    @Override
    public double calculaPerimetro(){
        return 2 * pi * raio;
    }
    
   @Override
    public String getName (){
        return this.name;
    }

}
