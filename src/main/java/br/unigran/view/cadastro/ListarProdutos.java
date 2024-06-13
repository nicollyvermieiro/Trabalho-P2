/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.view.cadastro;

import br.unigran.controllers.ProdutoController;
import br.unigran.controllers.ProdutoDto;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperViewer;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author laboratorio
 */
public class ListarProdutos extends ListagemAbs {

    @Override
    public void setupModel(DefaultTableModel modelo, JTable table) {
        modelo.addColumn("id");
        modelo.addColumn("Categoria");
        modelo.addColumn("Validade");
        modelo.addColumn("Valor");
    }

    @Override
    public void listar(DefaultTableModel modelo, JTable table, String nome, boolean asc) {
        try {
            modelo.setRowCount(0);

            for (ProdutoDto prodDto : ProdutoController.INSTANCE.listarOrdenado(asc)) {
                modelo.addRow(new Object[]{
                        prodDto.getCodProd(),
                        prodDto.getCategoria(),
                        prodDto.getValidadeProd(),
                        prodDto.getValorProd()
                });
            }

            ProdutoController.INSTANCE.listarNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(ListarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cadastrar() {
        new CadastroGenerico("Cadastrar Produto", new CadastroProduto()).setVisible(true);
    }

    @Override
    public void excluir(DefaultTableModel modelo, JTable table, int row) {
        Long id = Long.parseLong(modelo.getValueAt(row, 0).toString());
        try {
            ProdutoController.INSTANCE.remover(ProdutoController.INSTANCE.buscar(id));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao remover produto", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void alterar(DefaultTableModel modelo, JTable table, int row) {
        Long id = Long.parseLong(modelo.getValueAt(row, 0).toString());
        try {
            new CadastroGenerico("Editar Produto", new CadastroProduto(ProdutoController.INSTANCE.buscar(id))).setVisible(true);
        } catch (Exception e) {

        }
    }
    public void reportar() {
        try {
            JasperViewer.viewReport(Relatorio.relatorio("relatorios/produto.jrxml",new HashMap<>()),false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro: %s".formatted(e.getMessage()));
        }
    }
}
