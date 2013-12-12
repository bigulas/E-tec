/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Administrador;
import domainModel.Administrador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Paulo
 */
public class AdministradorDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();

    public void adicionar(Administrador administrador) {
        ge.getTransaction().begin();
        ge.persist(administrador);
        ge.getTransaction().commit();
    }

    public void alterar(Administrador administrador) {
        ge.getTransaction().begin();
        ge.merge(administrador);
        ge.flush();
        ge.getTransaction().commit();
    }

    public void excluir(Administrador administrador) {
        ge.getTransaction().begin();
        ge.remove(administrador);
        ge.getTransaction().commit();
    }

    public List<Administrador> obterTodos() {
        Query query = ge.createQuery("SELECT c FROM Administrador c");
        return query.getResultList();
    }
}

