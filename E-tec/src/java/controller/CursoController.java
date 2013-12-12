/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domainModel.Curso;
import java.io.IOException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.CursoBO;

/**
 *
 * @author ACER
 */
@ManagedBean
@SessionScoped
public class CursoController {

    private CursoBO cursoBO = new CursoBO();
    private Curso novoCurso = new Curso();
    private Curso cursoSelecionadoEA = new Curso();
    private Curso cursoAlterar = new Curso();
    private Curso cursoSelecionado = new Curso();
    private List<Curso> cursos;

    public CursoController() {
    }

    //Meus Metodos
    public void iniciarTela() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("./curso.xhtml");
        try {
            cursos = cursoBO.obterTodos();
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
        novoCurso = new Curso();
        try {
            cursos = cursoBO.obterTodos();
        } catch (Exception e) {
        }
    }

    public void adicionarCurso() {
        try {
            cursoBO.adicionar(novoCurso);
            String nomeCurso = novoCurso.getNome();
            novoCurso = new Curso();

            atualizarTabela();

            mensagemSucesso("Curso '" + nomeCurso + "' adicionado com sucesso!");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

    public void excluirCurso() {
        try {
            String nomeCurso = cursoSelecionadoEA.getNome();

            cursoBO.excluir(cursoSelecionadoEA);

            atualizarTabela();

            mensagemSucesso("Curso '" + nomeCurso + "' excluído com sucesso.");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

    public void alterarCurso() {
        try {
            cursoBO.alterar(cursoAlterar);

            atualizarTabela();

            mensagemSucesso("Curso alterado com sucesso!");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

//GETTER
    public Curso getCursoCadastrar() {
        return novoCurso;
    }

    public Curso getNovoCurso() {
        return novoCurso;
    }

    public Curso getCursoSelecionadoEA() {
        return cursoSelecionadoEA;
    }

    public Curso getCursoAlterar() {
        return cursoAlterar;
    }

    public Curso getCursoSelecionado() {
        return cursoSelecionado;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    //SETTER
    public void setCursoCadastrar(Curso novoCurso) {
        this.novoCurso = novoCurso;
    }

    public void setNovoCurso(Curso novoCurso) {
        this.novoCurso = novoCurso;
    }

    public void setCursoSelecionadoEA(Curso cursoSelecionadoEA) {
        this.cursoSelecionadoEA = cursoSelecionadoEA;
    }

    public void setCursoAlterar(Curso cursoAlterar) {
        this.cursoAlterar = cursoAlterar;
    }

    public void setCursoSelecionado(Curso cursoSelecionado) {
        this.cursoSelecionado = cursoSelecionado;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

}
