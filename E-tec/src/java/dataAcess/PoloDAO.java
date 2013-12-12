/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Polo;
import domainModel.Polo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Paulo
 */
public class PoloDAO {
   EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();

    public void adicionar(Polo polo) {
        ge.getTransaction().begin();
        ge.persist(polo);
        ge.getTransaction().commit();
    }

    public void alterar(Polo polo) {
        ge.getTransaction().begin();
        ge.merge(polo);
        ge.flush();
        ge.getTransaction().commit();
    }

    public void excluir(Polo polo) {
        ge.getTransaction().begin();
        ge.remove(polo);
        ge.getTransaction().commit();
    }

    public List<Polo> obterTodos() {
        Query query = ge.createQuery("SELECT c FROM Polo c");
        return query.getResultList();
    }
}

