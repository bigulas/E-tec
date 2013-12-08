/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Administrador;
import javax.persistence.EntityManager;

/**
 *
 * @author Paulo
 */
public class AdministradorDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();
    
    public void adicionar(Administrador administrador){
        ge.getTransaction().begin();
        ge.persist(administrador);
        ge.getTransaction().commit();
    }
    
}
