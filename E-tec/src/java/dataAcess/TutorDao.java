/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Tutor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Paulo
 */
public class TutorDao {

    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();

    public void adicionar(Tutor tutor) {
        ge.getTransaction().begin();
        ge.persist(tutor);
        ge.getTransaction().commit();
    }

    public void alterar(Tutor tutor) {
        ge.getTransaction().begin();
        ge.merge(tutor);
        ge.flush();
        ge.getTransaction().commit();
    }

    public void excluir(Tutor tutor) {
        ge.getTransaction().begin();
        ge.remove(tutor);
        ge.getTransaction().commit();
    }

    public List<Tutor> obterTodos() {
        Query query = ge.createQuery("SELECT c FROM Tutor c");
        return query.getResultList();
    }
}
