/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dataAcess.EnderecoDAO;
import domainModel.Endereco;
import domainModel.Endereco;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class EnderecoBO {
    private EnderecoDAO enderecoDAO = new EnderecoDAO();
    
    public void adicionar(Endereco endereco){
        // Campo rua não pode ficar vazio!
        if (endereco.getRua().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        // Campo bairro não pode ficar vazio!
        if (endereco.getBairro().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        // Campo cidade não pode ficar vazio!
        if (endereco.getCidade().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        // Campo cep não pode ficar vazio!
        if (endereco.getCep().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        enderecoDAO.adicionar(endereco);
    }
  public void alterar(Endereco endereco) {

        //Nem um campo pode ficar vazio
       if (endereco.getRua().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        // Campo bairro não pode ficar vazio!
        if (endereco.getBairro().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        // Campo cidade não pode ficar vazio!
        if (endereco.getCidade().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        // Campo cep não pode ficar vazio!
        if (endereco.getCep().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        enderecoDAO.alterar(endereco);
    }

    public void excluir(Endereco endereco) {
        enderecoDAO.excluir(endereco);
    }

    public List<Endereco> obterTodos() {
        return enderecoDAO.obterTodos();
    }
}