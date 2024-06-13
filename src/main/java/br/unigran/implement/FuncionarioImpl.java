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
                .createQuery("SELECT f FROM Funcionario f where f.id = :id", Funcionario.class)
                .setParameter("id",aLong);
        return query.getSingleResult();
    }

    @Override
    public List<Funcionario> listar() throws NoResultException {
        TypedQuery<Funcionario> query = Dao.getInstace().getEm()
                .createQuery("SELECT f FROM Funcionario f ", Funcionario.class);
        return query.getResultList();
    }
    
    @Override
    public List<Funcionario> listarNome(String nome) {
       TypedQuery<Funcionario> query = Dao.getInstace().getEm()
               .createQuery("SELECT f FROM Funcionario f where f.nome = :name", Funcionario.class)
               .setParameter("name", "%"+nome+"%");
       
       return query.getResultList();
    }

    @Override
    public Funcionario buscarPorEmailSenha(String email, String senha) {
         TypedQuery<Funcionario> query = Dao.getInstace().getEm()
               .createQuery("SELECT f FROM Funcionario f where f.email = :email and f.senha = :senha", Funcionario.class)
               .setParameter("email", email)
               .setParameter("senha", senha);
         
         return query.getSingleResult();
    }
    @Override
    public List<Funcionario> listarOrd(boolean asc) {
        TypedQuery<Funcionario> query = Dao.getInstace().getEm()
                .createQuery("SELECT f FROM Funcionario f order by f.nome " + (asc ? "asc" : "desc"), Funcionario.class);
        return query.getResultList();
    }

}

