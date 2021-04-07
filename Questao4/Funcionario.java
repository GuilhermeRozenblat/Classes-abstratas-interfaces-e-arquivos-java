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
public abstract class Funcionario implements Pagamento {
    private String nome;
    private float salarioBase;

    public Funcionario(String nome, float salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
     public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalario(float salario) {
        this.salarioBase = salario;
    }
    
    
    
}
