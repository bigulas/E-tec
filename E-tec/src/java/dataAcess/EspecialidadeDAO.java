/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Especialidade;
import javax.persistence.EntityManager;

/**
 *
 * @author Paulo
 */
public class EspecialidadeDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();
    
    public void adicionar(Especialidade especialidade){
        ge.getTransaction().begin();
        ge.persist(especialidade);
        ge.getTransaction().commit();
    }
}
