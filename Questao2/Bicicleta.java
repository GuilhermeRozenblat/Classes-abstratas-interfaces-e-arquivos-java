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
public class Bicicleta implements Carbonfootprint {
    private float km;
    private float pegada;

    public Bicicleta(float calorias) {
        this.km = calorias;
    }

    @Override
    public void CalculaCarbonfootprint() {
        pegada = km * 16;
        System.out.println(pegada + " gramas de CO2");
    }
}
