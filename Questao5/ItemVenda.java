/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao5;

/**
 *
 * @author Guilherme
 */
public class ItemVenda implements Recebivel{
    private String produto;
    private int quantidade;
    private double precoUnitario;
    private float total;

    public ItemVenda(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double totalozarReceita() {
        total = (float) (quantidade * precoUnitario);
        return total;
    }
    
}
