/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dataAcess.AdministradorDAO;
import domainModel.Administrador;
import domainModel.Administrador;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class AdministradorBO {

    private AdministradorDAO administradorDAO = new AdministradorDAO();

    public void adicionar(Administrador administrador) {

        //Campo do nome não pode ser vazio!
        if (administrador.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        //Campo do login não pode ser vazio!
        if (administrador.getLogin().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        //Campo do senha não pode ser vazio!
        if (administrador.getSenha().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        administradorDAO.adicionar(administrador);
    }
 public void alterar(Administrador administrador) {

        //Nem um campo pode ficar vazio
         if (administrador.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        //Campo do login não pode ser vazio!
        if (administrador.getLogin().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        //Campo do senha não pode ser vazio!
        if (administrador.getSenha().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        administradorDAO.alterar(administrador);
    }

    public void excluir(Administrador administrador) {
        administradorDAO.excluir(administrador);
    }

    public List<Administrador> obterTodos() {
        return administradorDAO.obterTodos();
    }
}