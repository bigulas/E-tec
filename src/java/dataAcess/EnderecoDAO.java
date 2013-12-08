/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Endereco;
import javax.persistence.EntityManager;

/**
 *
 * @author Paulo
 */
public class EnderecoDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();
    
    public void adicionar(Endereco endereco){
        ge.getTransaction().begin();
        ge.persist(endereco);
        ge.getTransaction().commit();
    }
    
}
