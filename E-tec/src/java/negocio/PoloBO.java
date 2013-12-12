/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dataAcess.PoloDAO;
import domainModel.Polo;
import domainModel.Polo;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class PoloBO {

    private PoloDAO poloDAO = new PoloDAO();

    public void adicionar(Polo polo) {

        if (polo.getCidade().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (polo.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        poloDAO.adicionar(polo);
    }

    public void alterar(Polo polo) {

        //Nem um campo pode ficar vazio
        if (polo.getCidade().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (polo.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        poloDAO.alterar(polo);
    }

    public void excluir(Polo polo) {
        poloDAO.excluir(polo);
    }

    public List<Polo> obterTodos() {
        return poloDAO.obterTodos();
    }
}
