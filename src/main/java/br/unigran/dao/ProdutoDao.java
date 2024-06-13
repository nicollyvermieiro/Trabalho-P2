package br.unigran.dao;

import br.unigran.entidades.Produto;
import br.unigran.persistencia.InterfaceDao;
import java.util.List;


public interface ProdutoDao extends InterfaceDao<Long, Produto> {
    List<Produto> listarNome(String nome);

    List<Produto> listarOrd(boolean asc);
}


