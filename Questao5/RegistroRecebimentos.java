/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao5;


/**
 *
 * @author Guilherme
 */
import java.util.ArrayList;
public class RegistroRecebimentos {
    public static void main(String[] args){
        ArrayList<Recebivel> registros = new ArrayList<>();
        ItemVenda item1 = new ItemVenda("a",50,1.2);
        registros.add(item1);
        Servico servico1 = new Servico("b",10,2.5);
        registros.add(servico1);
        double receitaTotal = 0;
        for (int i = 0;i < registros.size(); i++){
            receitaTotal += registros.get(i).totalozarReceita();
            System.out.println("Recebido:"  + registros.get(i).totalozarReceita());
        }
        System.out.println("Total:" + receitaTotal);
        
        
    }
    
    
    
    
    
   
}
