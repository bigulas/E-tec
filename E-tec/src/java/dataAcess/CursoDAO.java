/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Curso;
import javax.persistence.EntityManager;

/**
 *
 * @author Paulo
 */
public class CursoDAO {
    EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();
    
    public void adicionar(Curso curso){
        ge.getTransaction().begin();
        ge.persist(curso);
        ge.getTransaction().commit();
    }
}
