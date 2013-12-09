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
        if (aluno.getCidadenascimento().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getCpf().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getDataexpedicao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getDatanascimento().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getEmail().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getEncinomedio().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getEstadocivil().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getEstadonascimento().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getEtinia().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getFolhacertidao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getFormacaoano().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getFormacaocidade().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getFormacaoinstituicao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getFormacaoprevia().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getLivrocertidao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getMilitardataemicao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getMilitarnumero().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getModalidade().trim().length() <= 0) {
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
        if (aluno.getNomecartorio().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getNomemae().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getNomepai().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        /*if (aluno.getNumatricula().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }*/
        if (aluno.getNumcertidao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getProficao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getQtdpessoafamilia().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getRendafamiliar().trim().length() <= 0) {
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
        if (aluno.getTelcelular().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getTelfixo().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getTipocertidao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getTitulocidade().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getTitulonumero().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getTitulosecao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getTitulozona().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getTrabalha().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        alunoDAO.adicionar(aluno);

    }
}
