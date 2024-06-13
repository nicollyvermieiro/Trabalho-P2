/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.view.cadastro;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class ListagemAbs {
    public abstract void setupModel(DefaultTableModel modelo, JTable table);
    public abstract void listar(DefaultTableModel modelo, JTable table, String busca, boolean asc);
    public abstract void cadastrar();
    public abstract void excluir(DefaultTableModel modelo, JTable table, int row);
    public abstract void alterar(DefaultTableModel modelo, JTable table, int row);
    public void reportar(){};
}
