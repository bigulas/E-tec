/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domainModel.Aluno;
import java.io.IOException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.AlunoBO;

/**
 *
 * @author ACER
 */
@ManagedBean
@SessionScoped
public class AlunoController {

    private AlunoBO alunoBO = new AlunoBO();
    private Aluno novoAluno = new Aluno();
    private Aluno alunoSelecionadoEA = new Aluno();
    private Aluno alunoAlterar = new Aluno();
    private Aluno alunoSelecionado = new Aluno();
    private List<Aluno> alunos;

    /**
     * Creates a new instance of cadastroAlunoController
     */
    public AlunoController() {
    }

    //Meus Metodos
    public void iniciarTela() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("./aluno.xhtml");
        try {
            alunos = alunoBO.obterTodos();
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
        novoAluno = new Aluno();
        try {
            alunos = alunoBO.obterTodos();
        } catch (Exception e) {
        }
    }

    public void adicionarAluno() {
        try {
            alunoBO.adicionar(novoAluno);
            String nomeAluno = novoAluno.getNome();
            novoAluno = new Aluno();

            atualizarTabela();

            mensagemSucesso("Aluno '" + nomeAluno + "' adicionado com sucesso!");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

    public void excluirAluno() {
        try {
            String nomeAluno = alunoSelecionadoEA.getNome();

            alunoBO.excluir(alunoSelecionadoEA);

            atualizarTabela();

            mensagemSucesso("Aluno '" + nomeAluno + "' excluído com sucesso.");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

    public void alterarAluno() {
        try {
            alunoBO.alterar(alunoAlterar);

            atualizarTabela();

            mensagemSucesso("Aluno alterado com sucesso!");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

//GETTER
    public Aluno getAlunoCadastrar() {
        return novoAluno;
    }

    public Aluno getNovoAluno() {
        return novoAluno;
    }

    public Aluno getAlunoSelecionadoEA() {
        return alunoSelecionadoEA;
    }

    public Aluno getAlunoAlterar() {
        return alunoAlterar;
    }

    public Aluno getAlunoSelecionado() {
        return alunoSelecionado;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    //SETTER
    public void setAlunoCadastrar(Aluno novoAluno) {
        this.novoAluno = novoAluno;
    }

    public void setNovoAluno(Aluno novoAluno) {
        this.novoAluno = novoAluno;
    }

    public void setAlunoSelecionadoEA(Aluno alunoSelecionadoEA) {
        this.alunoSelecionadoEA = alunoSelecionadoEA;
    }

    public void setAlunoAlterar(Aluno alunoAlterar) {
        this.alunoAlterar = alunoAlterar;
    }

    public void setAlunoSelecionado(Aluno alunoSelecionado) {
        this.alunoSelecionado = alunoSelecionado;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}
