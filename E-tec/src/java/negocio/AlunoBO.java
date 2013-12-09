/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dataAcess.AlunoDAO;
import domainModel.Aluno;

/**
 *
 * @author Paulo
 */
public class AlunoBO {

    private AlunoDAO alunoDAO = new AlunoDAO();

    public void adicionar(Aluno aluno) {

        //Nem um campo pode ficar vazio!
        if (aluno.getCpf().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
       /* if (aluno.getDatanascimento().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }*/
        if (aluno.getEmail().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getEncinomedio().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getNecessidade().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getNecessidadequal().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        /*if (aluno.getNumatricula().trim().length() <= 0) {
         throw new RuntimeException("O nome não pode ser vazio.");
         }*/
        if (aluno.getProficao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getRgexpedicao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getRgnumero().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getSexo().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getModalidade().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }

        alunoDAO.adicionar(aluno);

    }
}
