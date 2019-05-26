    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficinamecânica;

import java.util.Scanner;

/**
 *
 * @author camila
 */
public class OficinaMecânica {
   
    public static void main(String[] args) {
        String nome, modelo, placa;
        Scanner key = new Scanner (System.in);
        Cliente cli = new Cliente();
        int opc = -1;
        Atendimento atd = new Atendimento(); //Inicializado fora para evitar a busca;
        System.out.println(" --- -Oficina Mecânica ----");
        System.out.println("Escolha a Opção Desejada:");
        System.out.println("1 - Novo Atendimento.");
        System.out.println("2 - Editar Atendimento.");
        System.out.println("3 - Visualizar Atendimento.");
        System.out.println("4 - Remover Atendimento.");
        
        opc = Integer.parseInt(key.nextLine());
        
        do{
            if(opc == 1){
                System.out.println(" -- Novo Atendimento --");
                
                System.out.println("Digite o nome do Cliente");
                nome = key.nextLine();
                System.out.println("Digite o modelo do Carro");
                modelo = key.nextLine();
                System.out.println("Digite a placa do Carro");
                placa = key.nextLine();
                System.out.println("Digite o problema");
                atd.setProblemas(key.nextLine());
                cli.cadastra(nome, modelo, placa);
                atd.setCliente(cli);
                
                
            }
            
            if (opc == 2){
                System.out.println(" -- Editar Atendimento --");
                System.out.println("Escolha uma Opção:");
                System.out.println("21- Editar Cliente");
                System.out.println("22 - Editar Modelo");
                System.out.println("23 - Editar Carro");
                System.out.println("24 - Editar Problema");
                System.out.println("25 - Adicionar Solução");
                System.out.println("9 - Voltar ao Menu");
                opc = Integer.parseInt(key.nextLine());
                
                do{
                    if (opc == 21){
                        System.out.println("Digite o nome do Cliente");
                        nome = key.nextLine();
                        cli.setNome(nome);
                        atd.setCliente(cli);
                        opc = 2;
                        
                    }
                    
                    if (opc == 22){
                        System.out.println("Digite o modelo do Carro");
                        modelo = key.nextLine();
                        cli.setModelo(modelo);
                        atd.setCliente(cli);
                        opc =2;
                    }
                    
                    if (opc == 23){
                        System.out.println("Digite a placa do Carro");
                        placa = key.nextLine();
                        cli.setPlaca(placa);
                        atd.setCliente(cli);
                        opc =2;

                    }
                    
                    if (opc == 24){
                        System.out.println("Edite o Problema");
                        atd.setProblemas(key.nextLine());
                        opc =2;

                        
                    }
                    if (opc == 25){
                        System.out.println("Adicione a Solução");
                        atd.setResolucao(key.nextLine());
                        opc =2;

                        
                    }
                System.out.println(" -- Editar Atendimento --");
                System.out.println("Escolha uma Opção:");
                System.out.println("21- Editar Cliente");
                System.out.println("22 - Editar Modelo");
                System.out.println("23 - Editar Carro");
                System.out.println("24 - Editar Problema");
                System.out.println("25 - Adicionar Solução");
                System.out.println("9 - Voltar ao Menu");
                opc = Integer.parseInt(key.nextLine());
                
                }while (opc != 9);
            
            }
            
            if (opc == 3){
                atd.printAtendimento();
                
            }
        
            if (opc == 4){
               atd.exclui();
               
            }
                        
//                System.out.println("Deseja abrir novo atendimento? (-1 para Sim, 0 para não.)");
//                opc = Integer.parseInt(key.nextLine());
//                if (opc == -1){
//                    System.out.println(" --- -Oficina Mecânica ----");
//                    System.out.println("Escolha a Opção Desejada:");
//                    System.out.println("1 - Novo Atendimento.");
//                    System.out.println("2 - Editar Atendimento.");
//                    System.out.println("3 - Visualizar Atendimento.");
//                    System.out.println("4 - Remover Atendimento.");
//                    System.out.println("5 - Encerrar Atendimento.");

    
        System.out.println(" --- -Oficina Mecânica ----");
        System.out.println("Escolha a Opção Desejada:");
        System.out.println("1 - Novo Atendimento.");
        System.out.println("2 - Editar Atendimento.");
        System.out.println("3 - Visualizar Atendimento.");
        System.out.println("4 - Remover Atendimento.");
        opc = Integer.parseInt(key.nextLine());
        
        
        
        }while (opc!= 0);
            System.out.println("Atendimento Encerrado");        

        
        
        
    }
    
}
