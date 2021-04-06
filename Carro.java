/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

/**
 *
 * @author Guilherme
 */
public class Carro implements Carbonfootprint {
    
    private String combustivel;
    private float cilindrada;
    private float pegada;
    
    
    public Carro(String combustivel, float cilindrada) {
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void CalculaCarbonfootprint() {
        if (combustivel.equals("gasolina")){
            pegada = cilindrada * 2223; 
            
        }
        if (combustivel.equals("etanol")){
            pegada = cilindrada * 417;
        }
    
        System.out.println(pegada + " gramas de CO2/litro");
    
    }
}
