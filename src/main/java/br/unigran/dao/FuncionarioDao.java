package br.unigran.dao;

import br.unigran.entidades.Funcionario;
import br.unigran.persistencia.InterfaceDao;
import java.util.List;


public interface FuncionarioDao extends InterfaceDao<Long, Funcionario> {
    List<Funcionario> listarNome(String nome);

    List<Funcionario> listarOrd(boolean asc);
    
   Funcionario buscarPorEmailSenha(String email,String senha);
}