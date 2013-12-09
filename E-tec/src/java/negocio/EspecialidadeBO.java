/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dataAcess.EspecialidadeDAO;
import domainModel.Especialidade;

/**
 *
 * @author Paulo
 */
public class EspecialidadeBO {
    private EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
    
    public void adicionar(Especialidade especialidade){
        // Campo nome não pode ficar vazio!
        if (especialidade.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        especialidadeDAO.adicionar(especialidade);
    }
    
}
