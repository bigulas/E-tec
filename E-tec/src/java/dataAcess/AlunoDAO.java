/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Aluno;
import domainModel.Aluno;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Paulo
 */
public class AlunoDAO {
   EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();

    public void adicionar(Aluno aluno) {
        ge.getTransaction().begin();
        ge.persist(aluno);
        ge.getTransaction().commit();
    }

    public void alterar(Aluno aluno) {
        ge.getTransaction().begin();
        ge.merge(aluno);
        ge.flush();
        ge.getTransaction().commit();
    }

    public void excluir(Aluno aluno) {
        ge.getTransaction().begin();
        ge.remove(aluno);
        ge.getTransaction().commit();
    }

    public List<Aluno> obterTodos() {
        Query query = ge.createQuery("SELECT c FROM Aluno c");
        return query.getResultList();
    }
}
