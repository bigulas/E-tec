package dataAcess;

import domainModel.Turma;
import javax.persistence.EntityManager;

/**
 *
 * @author arnaldo
 */
public class TurmaDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();
    
    public void adicionar(Turma turma){
        ge.getTransaction().begin();
        ge.persist(turma);
        ge.getTransaction().commit();
    }
}
