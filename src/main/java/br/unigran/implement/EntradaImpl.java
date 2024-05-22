package br.unigran.implement;

import br.unigran.dao.EntradaDao;
import javax.persistence.NoResultException;
import br.unigran.entidades.Entrada;
import br.unigran.persistence.Dao;
import javax.persistence.TypedQuery;
import java.util.List;

public class EntradaImpl implements EntradaDao{
    @Override
    public Entrada listarId(Long aLong) throws NoResultException {
        TypedQuery<Entrada> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Entrada p where p.codProd = :id", Entrada.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }
    
    @Override
    public List<Entrada> listar() throws NoResultException {
         TypedQuery<Entrada> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Entrada e ", Entrada.class);
        return query.getResultList();
    }
}