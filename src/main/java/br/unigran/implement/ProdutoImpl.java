package br.unigran.implement;

import br.unigran.dao.ProdutoDao;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import br.unigran.entidades.Produto;
import br.unigran.persistencia.Dao;
import java.util.List;

public class ProdutoImpl implements ProdutoDao{
    @Override
    public Produto listarId(Long aLong) throws NoResultException {
        TypedQuery<Produto> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Produto p where p.codProd = :id", Produto.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }

    @Override
    public List<Produto> listar() throws NoResultException {
         TypedQuery<Produto> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Produto p ", Produto.class);
        return query.getResultList();
    }
}