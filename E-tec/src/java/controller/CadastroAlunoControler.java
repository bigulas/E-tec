/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domainModel.Aluno;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import negocio.AlunoBO;

/**
 *
 * @author Paulo
 */
@ManagedBean
@RequestScoped
public class CadastroAlunoControler {

    private Aluno alunoCadastrar = new Aluno();
    private AlunoBO alunoBO = new AlunoBO();

    public CadastroAlunoControler() {
    }

    //MEUS METODOS
    public void iniciarTela() throws IOException {
        this.alunoCadastrar = new Aluno();
        FacesContext.getCurrentInstance().getExternalContext().redirect("cadastroaluno.xhtml");
    }

    public void mensagemSucesso(String msg) {
        FacesContext fc = FacesContext.getCurrentInstance();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
        fc.addMessage(null, facesMessage);
    }
    
    public void mensagemErro(String msg) {
        FacesContext fc = FacesContext.getCurrentInstance();
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
        fc.addMessage(null, facesMessage);
    }

    
    public void salvar() {
        try {
            alunoBO.adicionar(alunoCadastrar);
            mensagemSucesso("Cadastrado com Sucesso!");
            FacesContext.getCurrentInstance().getExternalContext().redirect("sucesso.xhtml");       
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }

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
