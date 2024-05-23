package br.unigran.controllers;


import br.unigran.dao.FuncionarioDao;
import br.unigran.implement.FuncionarioImpl;


public class FuncionarioController {
    FuncionarioDao dao = new FuncionarioImpl();
    public void salvar(FuncionarioDto funcionario) throws Exception {
        dao.salvar(funcionario.builder());
    }
    
    public void remove(FuncionarioDto funcionario) throws Exception {
        dao.remove(funcionario.builder());
    }
    
    public void atualiza(FuncionarioDto funcionario) throws Exception {
        dao.atualiza(funcionario.builder());
    }
    
     public void listar(FuncionarioDto funcionario) throws Exception {
        dao.listar();
    }

}