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
public class AssalariadosEComissionados extends Funcionario {
    
    private float salarioTotal;
    private float valorDeVendas;

    public AssalariadosEComissionados(String nome, float salarioBase, float valorDeVendas) {
        super(nome, salarioBase);
        this.valorDeVendas = valorDeVendas;
    }

    @Override
    public void calculaSalarioTotal() {
        salarioTotal = super.getSalarioBase() + (float) (valorDeVendas * 0.2);
        System.out.println("Salario Total de " + super.getNome()+ " = " + salarioTotal);
    }
    public void add10PorCento(){
        salarioTotal = (float) (salarioTotal + salarioTotal * 0.1);
        System.out.println("Salario Total de " + super.getNome()+ " + 10% = " + salarioTotal);
    }
    
}
