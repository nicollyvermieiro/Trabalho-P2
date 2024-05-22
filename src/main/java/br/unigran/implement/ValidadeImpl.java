package br.unigran.implement;

import br.unigran.dao.ValidadeDao;
import br.unigran.entidades.Validade;
import br.unigran.persistence.Dao;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class ValidadeImpl implements ValidadeDao {

    @Override
    public Validade listarId(Long aLong) throws NoResultException {
        TypedQuery<Validade> query = Dao.getInstace().getEm()
                .createQuery("SELECT v FROM Validade v where v.id = :id", Validade.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }

    @Override
    public List listar() throws NoResultException {
        TypedQuery<Validade> query = Dao.getInstace().getEm()
                .createQuery("SELECT v FROM Validade v ", Validade.class);
        return query.getResultList();
    }
}