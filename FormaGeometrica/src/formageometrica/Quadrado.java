/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formageometrica;
public class Quadrado extends Quadrilatero{
    private final String name = "Quadrado";
    public Quadrado(int l) {
        super(l, l, l, l);
    }
    
    @Override
    public String getName (){
        return this.name;
    }
    
    @Override 
    public double calculaArea(){
      return this.lado1 * this.lado1;  
    }
    

    
}
