package br.unigran.implement;

import br.unigran.dao.EstoqueDao;
import javax.persistence.NoResultException;
import br.unigran.entidades.Estoque;
import br.unigran.persistencia.Dao;
import javax.persistence.TypedQuery;
import java.util.List;

public class EstoqueImpl implements EstoqueDao{
    @Override
    public Estoque listarId(Long aLong) throws NoResultException {
        TypedQuery<Estoque> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Estoque p where p.codProd = :id", Estoque.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }
    
    @Override
    public List<Estoque> listar() throws NoResultException {
         TypedQuery<Estoque> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Estoque e ", Estoque.class);
        return query.getResultList();
    }
}