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
public class Main {
    public static void main(String[] args){
        Funcionario assalariado = new Assalariado("Joao",90);
        assalariado.calculaSalarioTotal();
        Funcionario porHora = new FuncionariosPorHora("Pedro",100,5);
        porHora.calculaSalarioTotal();
        Funcionario comissionado = new Comissionado("Maria", 500);
        comissionado.calculaSalarioTotal();
        Funcionario assalEComiss = new AssalariadosEComissionados("Guilherme", 30, 400);
        assalEComiss.calculaSalarioTotal();
    }
}
