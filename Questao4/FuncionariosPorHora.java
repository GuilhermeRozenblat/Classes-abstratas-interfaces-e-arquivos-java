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
public class FuncionariosPorHora extends Funcionario{
    
    private int numeroDeHorasExtras;
    private float pagamentoPorHora = (float) ((super.getSalarioBase()/40) * 1.5);
    private float salarioTotal;

    public FuncionariosPorHora(String nome, float salarioBase,int numeroDeHorasExtras) {
        super(nome, salarioBase);
        this.numeroDeHorasExtras = numeroDeHorasExtras;
    }

    
    @Override
    public void calculaSalarioTotal() {
        salarioTotal = super.getSalarioBase() + (pagamentoPorHora * numeroDeHorasExtras);
        System.out.println("Salario Total = " + salarioTotal);
    }
    
}
