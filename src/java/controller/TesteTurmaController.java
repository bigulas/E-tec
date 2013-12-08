/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domainModel.Turma;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.ManagedBean;
import negocio.TurmaBO;

/**
 *
 * @author arnaldo
 */
@Named(value = "testeTurmaController")
@ManagedBean
@SessionScoped
public class TesteTurmaController implements Serializable {

    private Turma turma = new Turma();
    private TurmaBO turmaBO = new TurmaBO();
    
    public TesteTurmaController() {
    }
    
    //METODOS
    public void adicionarTurma(){
        try{
            turmaBO.adicionar(turma);
        }catch(Exception e){
        
        }
    }
    
    
    //SETTER
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    //GETTERS
    public Turma getTurma() {
        return turma;
    }

}
