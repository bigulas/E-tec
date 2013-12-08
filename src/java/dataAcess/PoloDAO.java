/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Polo;
import javax.persistence.EntityManager;

/**
 *
 * @author Paulo
 */
public class PoloDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();
    
    public void adicionar(Polo polo){
        ge.getTransaction().begin();
        ge.persist(polo);
        ge.getTransaction().commit();
    }
    
}
