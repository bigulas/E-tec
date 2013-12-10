/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dataAcess.TutorDao;
import domainModel.Tutor;

/**
 *
 * @author Paulo
 */
public class TutorBO {
    private TutorDao tutorDao = new TutorDao();
    
    public void adicionar(Tutor tutor){
        
        //Nem um campo pode ficar vazio
        if (tutor.getCelular().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (tutor.getCidade().trim().isEmpty()) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (tutor.getCpf().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (tutor.getEmail().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (tutor.getEndereco().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (tutor.getLogin().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (tutor.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (tutor.getRg().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (tutor.getSenha().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (tutor.getTelfixo().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        tutorDao.adicionar(tutor);
        
    }
    
}
