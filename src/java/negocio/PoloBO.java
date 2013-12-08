/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dataAcess.PoloDAO;
import domainModel.Polo;

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
}
