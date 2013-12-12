/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Especialidade;
import domainModel.Especialidade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Paulo
 */
public class EspecialidadeDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();

    public void adicionar(Especialidade especialidade) {
        ge.getTransaction().begin();
        ge.persist(especialidade);
        ge.getTransaction().commit();
    }

    public void alterar(Especialidade especialidade) {
        ge.getTransaction().begin();
        ge.merge(especialidade);
        ge.flush();
        ge.getTransaction().commit();
    }

    public void excluir(Especialidade especialidade) {
        ge.getTransaction().begin();
        ge.remove(especialidade);
        ge.getTransaction().commit();
    }

    public List<Especialidade> obterTodos() {
        Query query = ge.createQuery("SELECT c FROM Especialidade c");
        return query.getResultList();
    }
}
