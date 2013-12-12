/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcess;

import domainModel.Endereco;
import domainModel.Endereco;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Paulo
 */
public class EnderecoDAO {
   EntityManager ge = GerenciadorEntidade.getGerenciadorEntidade();

    public void adicionar(Endereco endereco) {
        ge.getTransaction().begin();
        ge.persist(endereco);
        ge.getTransaction().commit();
    }

    public void alterar(Endereco endereco) {
        ge.getTransaction().begin();
        ge.merge(endereco);
        ge.flush();
        ge.getTransaction().commit();
    }

    public void excluir(Endereco endereco) {
        ge.getTransaction().begin();
        ge.remove(endereco);
        ge.getTransaction().commit();
    }

    public List<Endereco> obterTodos() {
        Query query = ge.createQuery("SELECT c FROM Endereco c");
        return query.getResultList();
    }
}

