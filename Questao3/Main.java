/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

import Questao2.*;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro("etanol", 10);
        Carro carro2 = new Carro("gasolina", 5);
        Bicicleta bike1 = new Bicicleta (10);
        Bicicleta bike2 = new Bicicleta (5);
        //Edificio construcao1 = new Edificio(1,false,50,true,10);
        //Edificio construcao2 = new Edificio(2,true,100,false,50);
        // --> Nao funciona, pois nao é possivel instanciar classes abstratas
        
        Edificio construcao1 = new Casa(1,false,50,true,10);
        Edificio construcao2 = new Escola(2,true,100,false,50);
        ArrayList<Carbonfootprint> listaCarbon = new ArrayList<>();
        listaCarbon.add(carro1);
        listaCarbon.add(carro2);
        listaCarbon.add(bike1);
        listaCarbon.add(bike2);
        listaCarbon.add(construcao1);
        listaCarbon.add(construcao2);
        listaCarbon.get(0).CalculaCarbonfootprint();
        listaCarbon.get(1).CalculaCarbonfootprint();
        listaCarbon.get(2).CalculaCarbonfootprint();
        listaCarbon.get(3).CalculaCarbonfootprint();
        listaCarbon.get(4).CalculaCarbonfootprint();
        listaCarbon.get(5).CalculaCarbonfootprint();
        
    }
        
}
