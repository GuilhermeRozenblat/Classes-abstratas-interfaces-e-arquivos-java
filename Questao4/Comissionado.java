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
public class Comissionado extends Funcionario{
    
    private float salarioTotal;
    private float valorDeVendas;

    public Comissionado(String nome,float valorDeVendas) {
        super(nome);
        this.valorDeVendas = valorDeVendas;
    }
    
    @Override
    public void calculaSalarioTotal() {
        salarioTotal = (float) (valorDeVendas * 0.2);
        System.out.println("Salario Total de " + super.getNome()+ " = " + salarioTotal);
    }
}
