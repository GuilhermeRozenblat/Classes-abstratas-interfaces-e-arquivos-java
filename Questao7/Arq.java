/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao7;

/**
 *
 * @author Guilherme
 */
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Arq {
    public static void leitor(String arquivo){
        File file = new File(arquivo);
        
        try{
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while((i = bis.read()) != -1){
                System.out.print((char) i);

            }
        }
        catch (Exception e){  
        }
    }
    
    public static void escritor(String arquivo) {
        File file = new File(arquivo);
        
        try{
            FileOutputStream fos = new FileOutputStream(file, true);
            BufferedOutputStream bos= new BufferedOutputStream(fos);
            Scanner teclado = new Scanner(System.in);
            String linha = teclado.nextLine();
            bos.write(linha.getBytes());
            bos.write("\n".getBytes());
            bos.flush();
            bos.close();
            
        }
        catch (Exception e){
        }
    }
}
