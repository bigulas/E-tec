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

 private Aluno alunoCadastrar;

    public CadastroAlunoControler() {
    }
    
    
    
    //GETRS
    public Aluno getAlunoCadastrar() {
        return alunoCadastrar;
    }

    //SETRS
    public void setAlunoCadastrar(Aluno alunoCadastrar) {
        this.alunoCadastrar = alunoCadastrar;
    }
    
    
}
