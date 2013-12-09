/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Aluno;
import javax.persistence.EntityManager;

/**
 *
 * @author Paulo
 */
public class AlunoDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();
    
    public void adicionar(Aluno aluno){
        ge.getTransaction().begin();
        ge.persist(aluno);
        ge.getTransaction().commit();
    }
}
