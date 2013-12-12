package dataAcess;

import domainModel.Turma;
import domainModel.Turma;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Paulo
 */
public class TurmaDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();

    public void adicionar(Turma turma) {
        ge.getTransaction().begin();
        ge.persist(turma);
        ge.getTransaction().commit();
    }

    public void alterar(Turma turma) {
        ge.getTransaction().begin();
        ge.merge(turma);
        ge.flush();
        ge.getTransaction().commit();
    }

    public void excluir(Turma turma) {
        ge.getTransaction().begin();
        ge.remove(turma);
        ge.getTransaction().commit();
    }

    public List<Turma> obterTodos() {
        Query query = ge.createQuery("SELECT c FROM Turma c");
        return query.getResultList();
    }
}
