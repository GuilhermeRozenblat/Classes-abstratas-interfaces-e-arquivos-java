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
public class Retangulo extends FormaGeometrica{
    
    private float lado1;
    private float lado2;

    public Retangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Retangulo(float lado1) {
        this.lado1 = lado1;
    }
    
    
    @Override
    public void calculaArea(){
        super.setArea(lado1 * lado2);
    }

    @Override
    public void calculaPerimetro() {
        super.setPerimetro(lado1*2 + lado2*2);
    }
      
    
    
}
