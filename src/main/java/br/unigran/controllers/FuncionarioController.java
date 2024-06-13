package br.unigran.controllers;

import br.unigran.dao.FuncionarioDao;
import br.unigran.implement.FuncionarioImpl;

import java.util.List;

public class FuncionarioController {

    public static final FuncionarioController INSTANCE = new FuncionarioController();

    private FuncionarioController(){

    }

    FuncionarioDao dao = new FuncionarioImpl();

    public void salvar(FuncionarioDto func) throws Exception {
        dao.salvar(func.builder());
    }

    public List<FuncionarioDto> listar() throws Exception {
        return dao.listar().stream().map(FuncionarioDto::new).toList();
    }

    public FuncionarioDto buscar(long id) throws Exception {
        return new FuncionarioDto(dao.listarId(id));
    }

    public void alterar(FuncionarioDto funcionarioDTO) throws Exception {
         dao.atualiza(funcionarioDTO.builder());
    }

    public List<FuncionarioDto> listarNome(String nome) throws Exception {
        return dao.listarNome(nome).stream().map(FuncionarioDto::new).toList();
    }
    
    public FuncionarioDto buscaPorEmailSenha(String email, String senha){
        return new FuncionarioDto(dao.buscarPorEmailSenha(email, senha));
    }

    public List<FuncionarioDto> listarOrdenado(boolean asc){
        return dao.listarOrd(asc).stream().map(FuncionarioDto::new).toList();
    }

    public void remover(FuncionarioDto toRemove){
        dao.remove(toRemove.builder());
    }
}
