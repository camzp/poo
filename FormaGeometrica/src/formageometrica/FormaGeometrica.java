/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formageometrica;

import java.util.*;

/**
 *
 * @author camila
 */
public class FormaGeometrica {

    public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    System.out.println("Quantas formas deseja criar?");
        
        int loop = key.nextInt();
        
        List<Figura> formas = new ArrayList<>();
        
        for (int i = 0; i < loop; i++) {
            
            System.out.println("Qual forma deseja Criar?"
                + "\n (1) Para Quadrado"
                + "\n (2) Para Retangulo"
                + "\n (3) Para Círculo");
            
            int input = key.nextInt();
            
            switch (input) {
                case 1:
                    System.out.println("***Criando um Quadrado***");
                    System.out.println("Digite o Lado do Quadrado:");
                    int lado = key.nextInt();
                    formas.add(new Quadrado(lado));
                    break;

                case 2:
                    System.out.println("***Criando um Retangulo***");
                    System.out.println("Digite a Base do Retangulo:");
                    int base = key.nextInt();
                    System.out.println("Digite a Altura do Retangulo:");
                    int altura = key.nextInt();
                    formas.add(new Retangulo(base, altura));
                    break;

                case 3:
                    System.out.println("***Criando um Circulo***");
                    System.out.println("Digite o Raio do Circulo:");
                    int raio = key.nextInt();
                    formas.add(new Circulo(raio));
                    break;

                default:
                    break;
            }
        }
    
    for (Figura forma: formas){
        if (forma instanceof Quadrilatero){
            System.out.println("---"+ forma.getName() + "---");
            System.out.println("Lados: " + ((Quadrilatero) forma).getLado1() + "x" + ((Quadrilatero) forma).getLado3() );
            System.out.println("Perimetro: " + forma.calculaPerimetro());
            System.out.println("Area: " + forma.calculaArea());
        
        }
        
        else if (forma instanceof Circulo){
            System.out.println("---"+ forma.getName() + "---");
            System.out.println("Raio: " + ((Circulo)forma).getRaio());
            System.out.println("Perimetro: " + forma.calculaPerimetro());
            System.out.println("Area: " + forma.calculaArea());
        }
        
        
        
            
        }
    }    
        
    }
        
    

