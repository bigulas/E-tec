/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dataAcess.AlunoDAO;
import domainModel.Aluno;
import domainModel.Aluno;
import java.util.Date;
import java.util.List;

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
        if (aluno.getEmail().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getEncinomedio().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getRgexpedicao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getRgnumero().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        //---- VERIFICA SE AS DATAS NÂO ESTA NO FUTURO -----
        Date nas = new Date();
        if (nas.before(aluno.getDatanascimento())) {
            throw new RuntimeException("A data de nascimento não pode ser posterior a data atual.");
        }
        Date hj = new Date();
        if (hj.before(aluno.getDataexpedicao())) {
            throw new RuntimeException("A data de nascimento não pode ser posterior a data atual.");
        }
        Date rg = new Date();
        if (rg.before(aluno.getRgdataexpedicao())) {
            throw new RuntimeException("A data de nascimento não pode ser posterior a data atual.");
        }
        Date ml = new Date();
        if (ml.before(aluno.getMilitardataemicao())) {
            throw new RuntimeException("A data de nascimento não pode ser posterior a data atual.");
        }
        //----- FIN VERIFICASÃO DE DATAS ----
        
        alunoDAO.adicionar(aluno);

    }
 public void alterar(Aluno aluno) {

        //Nem um campo pode ficar vazio
       if (aluno.getCpf().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getEmail().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getEncinomedio().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getNome().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getRgexpedicao().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        if (aluno.getRgnumero().trim().length() <= 0) {
            throw new RuntimeException("O nome não pode ser vazio.");
        }
        //---- VERIFICA SE AS DATAS NÂO ESTA NO FUTURO -----
        Date nas = new Date();
        if (nas.before(aluno.getDatanascimento())) {
            throw new RuntimeException("A data de nascimento não pode ser posterior a data atual.");
        }
        Date hj = new Date();
        if (hj.before(aluno.getDataexpedicao())) {
            throw new RuntimeException("A data de nascimento não pode ser posterior a data atual.");
        }
        Date rg = new Date();
        if (rg.before(aluno.getRgdataexpedicao())) {
            throw new RuntimeException("A data de nascimento não pode ser posterior a data atual.");
        }
        Date ml = new Date();
        if (ml.before(aluno.getMilitardataemicao())) {
            throw new RuntimeException("A data de nascimento não pode ser posterior a data atual.");
        }
        alunoDAO.alterar(aluno);
    }

    public void excluir(Aluno aluno) {
        alunoDAO.excluir(aluno);
    }

    public List<Aluno> obterTodos() {
        return alunoDAO.obterTodos();
    }
}
