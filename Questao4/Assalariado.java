/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

/**
 *
 * @author Guilherme
 */
public class Assalariado extends Funcionario {

    private float salarioTotal;

    public Assalariado(String nome, float salarioBase) {
        super(nome, salarioBase);
    }

    
    @Override
    public void calculaSalarioTotal() {
        
        salarioTotal = super.getSalarioBase();
        System.out.println("Salario Total de " + super.getNome() + " = " + salarioTotal);
    }
    
}
