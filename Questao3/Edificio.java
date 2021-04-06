/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

import Questao2.Carbonfootprint;

/**
 *
 * @author Guilherme
 */

public abstract class Edificio implements Carbonfootprint{
    private int numPessoas;
    private boolean energiaRenovavel;
    private int numLampadas;
    private boolean arcondicionado;
    private int horasDiarias;
    private float pegada;
    
    public Edificio(int numPessoas, boolean energiaRenovavel, int numLampadas, boolean arcondicionado, int horasDiarias) {
        this.numPessoas = numPessoas;
        this.energiaRenovavel = energiaRenovavel;
        this.numLampadas = numLampadas;
        this.arcondicionado = arcondicionado;
        this.horasDiarias = horasDiarias;
    }

    @Override
    public void CalculaCarbonfootprint() {
        if (energiaRenovavel == true){
            if(arcondicionado == false){
                pegada = (numLampadas * 10) + (numPessoas*50);
                
            }
            if(arcondicionado == true){
                pegada = (numLampadas * 10) + (numPessoas*50) + (1000 * horasDiarias);
            } 
        }
        else{
            if(arcondicionado == false){
                pegada = (numLampadas * 1000) + (numPessoas*5000);
            }
            if(arcondicionado == true){
                pegada = (numLampadas * 1000) + (numPessoas*5000) + (50000 * horasDiarias);
            } 
            
        }
        
        System.out.println(pegada + " gramas de CO2/dia");
    }
}

