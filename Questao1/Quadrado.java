/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

/**
 *
 * @author Guilherme
 */
public class Quadrado extends Retangulo{
    
    private float lado;
    
    
    public Quadrado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public void calculaArea(){
        super.setArea(lado * lado);
    }

    @Override
    public void calculaPerimetro() {
        super.setPerimetro(lado * 4);
    }
      
    
}
