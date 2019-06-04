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
public class Retangulo extends Quadrilatero{
    public final String name = "Retangulo";
    public Retangulo(int b, int h) {
        super(b, b, h, h);
    }  
    
    @Override 
    public double calculaArea(){
      
      return this.lado1 * this.lado3;
    }
    
        @Override
    public String getName (){
        return this.name;
    }
    
}
