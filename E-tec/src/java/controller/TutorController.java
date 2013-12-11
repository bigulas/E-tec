/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domainModel.Tutor;
import java.io.IOException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.TutorBO;

/**
 *
 * @author ACER
 */
@ManagedBean
@SessionScoped
public class TutorController {

    private TutorBO tutorBO = new TutorBO();
    private Tutor novoTutor = new Tutor();
    private Tutor tutorSelecionadoEA = new Tutor();
    private Tutor tutorAlterar = new Tutor();
    private Tutor tutorSelecionado = new Tutor();
    private List<Tutor> tutores;

    /**
     * Creates a new instance of cadastroTutorController
     */
    public TutorController() {
    }

    //Meus Metodos
    public void iniciarTela() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("./tutor.xhtml");
        try {
            tutores = tutorBO.obterTodos();
        } catch (Exception e) {
        }
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

    public void atualizarTabela() {
        novoTutor = new Tutor();
        try {
            tutores = tutorBO.obterTodos();
        } catch (Exception e) {
        }
    }

    public void adicionarTutor() {
        try {
            tutorBO.adicionar(novoTutor);
            String nomeTutor = novoTutor.getNome();
            novoTutor = new Tutor();

            atualizarTabela();

            mensagemSucesso("Tutor '" + nomeTutor + "' adicionado com sucesso!");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

    public void excluirTutor() {
        try {
            String nomeTutor = tutorSelecionadoEA.getNome();

            tutorBO.excluir(tutorSelecionadoEA);

            atualizarTabela();

            mensagemSucesso("Tutor '" + nomeTutor + "' excluído com sucesso.");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

    public void alterarTutor() {
        try {
            tutorBO.alterar(tutorAlterar);

            atualizarTabela();

            mensagemSucesso("Tutor alterado com sucesso!");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

//GETTER
    public Tutor getTutorCadastrar() {
        return novoTutor;
    }

    public Tutor getNovoTutor() {
        return novoTutor;
    }

    public Tutor getTutorSelecionadoEA() {
        return tutorSelecionadoEA;
    }

    public Tutor getTutorAlterar() {
        return tutorAlterar;
    }

    public Tutor getTutorSelecionado() {
        return tutorSelecionado;
    }

    public List<Tutor> getTutores() {
        return tutores;
    }
    

    //SETTER
    public void setTutorCadastrar(Tutor novoTutor) {
        this.novoTutor = novoTutor;
    }

    public void setNovoTutor(Tutor novoTutor) {
        this.novoTutor = novoTutor;
    }

    public void setTutorSelecionadoEA(Tutor tutorSelecionadoEA) {
        this.tutorSelecionadoEA = tutorSelecionadoEA;
    }

    public void setTutorAlterar(Tutor tutorAlterar) {
        this.tutorAlterar = tutorAlterar;
    }

    public void setTutorSelecionado(Tutor tutorSelecionado) {
        this.tutorSelecionado = tutorSelecionado;
    }

    public void setTutores(List<Tutor> tutores) {
        this.tutores = tutores;
    }

    
}
