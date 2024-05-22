package br.unigran.implement;

import br.unigran.dao.SaidaDao;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import br.unigran.entidades.Saida;
import br.unigran.persistence.Dao;
import java.util.List;

public class SaidaImpl implements SaidaDao {
    @Override
    public Saida listarId(Long aLong) throws NoResultException {
        TypedQuery<Saida> query = Dao.getInstace().getEm()
                .createQuery("SELECT s FROM Saida s where s.id = :id", Saida.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }

    @Override
    public List<Saida> listar() throws NoResultException {
        TypedQuery<Saida> query = Dao.getInstace().getEm()
                .createQuery("SELECT s FROM Saida s ", Saida.class);
        return query.getResultList();
    }
}