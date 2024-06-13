package br.unigran.view.cadastro;

import br.unigran.controllers.FuncionarioController;
import br.unigran.controllers.FuncionarioDto;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperViewer;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ListarFuncionarios extends ListagemAbs {

    @Override
    public void setupModel(DefaultTableModel modelo, JTable table) {
        modelo.addColumn("id");
        modelo.addColumn("CPF");
        modelo.addColumn("Nome");
        modelo.addColumn("Cargo");
    }

    @Override
    public void cadastrar() {
        new CadastroGenerico("Cadastrar Funcionáraio", new CadastroFuncionaro()).setVisible(true);
    }

    @Override
    public void excluir(DefaultTableModel modelo, JTable table, int row) {
        Long id = Long.parseLong(modelo.getValueAt(row, 0).toString());
        try {
            FuncionarioController.INSTANCE.remover(FuncionarioController.INSTANCE.buscar(id));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao remover funcionario", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void alterar(DefaultTableModel modelo, JTable table, int row) {
        Long id = Long.parseLong(modelo.getValueAt(row, 0).toString());
        try {
            new CadastroGenerico("Editar Funcionáraio", new CadastroFuncionaro(FuncionarioController.INSTANCE.buscar(id))).setVisible(true);
        } catch (Exception e) {

        }
    }

    @Override
    public void listar(DefaultTableModel modelo, JTable table, String nome, boolean asc) {
        try {
            modelo.setRowCount(0);

            for (FuncionarioDto funcDTO : FuncionarioController.INSTANCE.listarOrdenado(asc)) {
                modelo.addRow(new Object[]{
                        funcDTO.getId(),
                        funcDTO.getCpf(),
                        funcDTO.getNomeFuncionario(),
                        funcDTO.getCargo()
                });
            }

            FuncionarioController.INSTANCE.listarNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(ListarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void reportar() {
        try {
            JasperViewer.viewReport(Relatorio.relatorio("relatorios/funcionarios.jrxml",new HashMap<>()),false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro: %s".formatted(e.getMessage()));
        }
    }
}
