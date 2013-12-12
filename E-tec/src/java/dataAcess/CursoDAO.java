/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Curso;
import domainModel.Curso;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Paulo
 */
public class CursoDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();

    public void adicionar(Curso curso) {
        ge.getTransaction().begin();
        ge.persist(curso);
        ge.getTransaction().commit();
    }

    public void alterar(Curso curso) {
        ge.getTransaction().begin();
        ge.merge(curso);
        ge.flush();
        ge.getTransaction().commit();
    }

    public void excluir(Curso curso) {
        ge.getTransaction().begin();
        ge.remove(curso);
        ge.getTransaction().commit();
    }

    public List<Curso> obterTodos() {
        Query query = ge.createQuery("SELECT c FROM Curso c");
        return query.getResultList();
    }
}

