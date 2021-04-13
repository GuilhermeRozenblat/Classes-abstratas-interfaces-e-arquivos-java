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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class addEntradas {
    public static void escrever(String arquivo){
        File file = new File(arquivo);
        
        try{
            Scanner teclado = new Scanner(System.in);
            String linha = teclado.nextLine();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(linha);
            bw.flush();
            bw.close();
        } 
        catch (Exception e) {
            
        }
    }
        
}
