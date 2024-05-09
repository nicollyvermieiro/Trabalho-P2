/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author User
 */
public class Estoque {
    private Integer id;
    private Produto produtoEstoque;
    private Entrada entradaEstoque;
    private Saida saidaEstoque;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProdutoEstoque() {
        return produtoEstoque;
    }

    public void setProdutoEstoque(Produto produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }

    public Entrada getEntradaEstoque() {
        return entradaEstoque;
    }

    public void setEntradaEstoque(Entrada entradaEstoque) {
        this.entradaEstoque = entradaEstoque;
    }

    public Saida getSaidaEstoque() {
        return saidaEstoque;
    }

    public void setSaidaEstoque(Saida saidaEstoque) {
        this.saidaEstoque = saidaEstoque;
    }
    
}
