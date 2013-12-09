/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import domainModel.Aluno;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Paulo
 */
@ManagedBean
@SessionScoped
public class CadastroAlunoControler {

 private Aluno aluno;

    public CadastroAlunoControler() {
    }
    
    //SETRS
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    //GETRS
    public Aluno getAluno() {
        return aluno;
    }
    
}
