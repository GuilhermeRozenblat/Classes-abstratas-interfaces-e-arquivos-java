/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao6;

/**
 *
 * @author Guilherme
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArquivosInfos {
    public static void infos(String arquivo) {
        
        
        try{
            File file = new File(arquivo);
            String str = null;
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            while((str = br.readLine()) != null){
                String[] linha = str.split(", ");
                System.out.println("Dia: " + linha[0] + "Min: " +linha[1]+ "Max: " +linha[2]+ "Indice: " + linha[3]);
            }
            br.close();
        }
        catch(Exception e){
            
        }
    }
}
