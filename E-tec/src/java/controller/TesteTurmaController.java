/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dataAcess.TurmaDAO;
import domainModel.Turma;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import negocio.TurmaBO;

/**
 *
 * @author arnaldo
 */
@Named(value = "testeTurmaController")
@SessionScoped
public class TesteTurmaController implements Serializable {

    private Turma turma = new Turma();
    private TurmaBO turmaBO = new TurmaBO();
    
    public TesteTurmaController() {
    }
    
    //METODOS
    public void adicionarTurma(){          
            turmaBO.adicionar(turma);
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
