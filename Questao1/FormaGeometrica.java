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
public abstract class FormaGeometrica implements Formas {
    private float area;
    private float perimetro;

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    
        
}
