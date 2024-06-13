/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.controllers;

import br.unigran.entidades.Estoque;

public class EstoqueDto {
    public Long estoqueAtual;
    public Long estoqueAnterior;

    public Estoque builder() {
        Estoque estoque = new Estoque();
        estoque.setEstoqueAtual(estoqueAtual);
        estoque.setEstoqueAnterior(estoqueAnterior);
        return estoque;
    }
    public EstoqueDto (Estoque estoque){
        this.estoqueAtual = estoque.getEstoqueAtual();
        this.estoqueAnterior = estoque.getEstoqueAnterior();
    }
}
