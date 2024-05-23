package br.unigran.implement;

import br.unigran.dao.FuncionarioDao;
import javax.persistence.NoResultException;
import br.unigran.entidades.Funcionario;
import br.unigran.persistencia.Dao;
import javax.persistence.TypedQuery;
import java.util.List;

public class FuncionarioImpl implements FuncionarioDao{
    @Override
    public Funcionario listarId(Long aLong) throws NoResultException {
        TypedQuery<Funcionario> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Funcionario p where p.codProd = :id", Funcionario.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }
    
    @Override
    public List<Funcionario> listar() throws NoResultException {
         TypedQuery<Funcionario> query = Dao.getInstace().getEm()
                .createQuery("SELECT p FROM Funcionario f ", Funcionario.class);
        return query.getResultList();
    }
}