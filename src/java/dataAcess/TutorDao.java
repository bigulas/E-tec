/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Tutor;
import javax.persistence.EntityManager;

/**
 *
 * @author Paulo
 */
public class TutorDao {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();
    
    public void adicionar(Tutor tutor){
        ge.getTransaction().begin();
        ge.persist(tutor);
        ge.getTransaction().commit();
    }
    
}
