/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domainModel.Polo;
import java.io.IOException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.PoloBO;

/**
 *
 * @author ACER
 */
@ManagedBean
@SessionScoped
public class PoloController {

    private PoloBO poloBO = new PoloBO();
    private Polo novoPolo = new Polo();
    private Polo poloSelecionadoEA = new Polo();
    private Polo poloAlterar = new Polo();
    private Polo poloSelecionado = new Polo();
    private List<Polo> polos;

    public PoloController() {
    }

    public void iniciarTela() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("./polo.xhtml");
        try {
            polos = poloBO.obterTodos();
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
        novoPolo = new Polo();
        try {
            polos = poloBO.obterTodos();
        } catch (Exception e) {
        }
    }

    public void adicionarPolo() {
        try {
            poloBO.adicionar(novoPolo);
            String nomePolo = novoPolo.getNome();
            novoPolo = new Polo();

            atualizarTabela();

            mensagemSucesso("Polo '" + nomePolo + "' adicionado com sucesso!");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

    public void excluirPolo() {
        try {
            String nomePolo = poloSelecionadoEA.getNome();

            poloBO.excluir(poloSelecionadoEA);

            atualizarTabela();

            mensagemSucesso("Polo '" + nomePolo + "' excluído com sucesso.");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

    public void alterarPolo() {
        try {
            poloBO.alterar(poloAlterar);

            atualizarTabela();

            mensagemSucesso("Polo alterado com sucesso!");
        } catch (Exception e) {
            mensagemErro(e.getMessage());
        }
    }

//GETTER
    public Polo getPoloCadastrar() {
        return novoPolo;
    }

    public Polo getNovoPolo() {
        return novoPolo;
    }

    public Polo getPoloSelecionadoEA() {
        return poloSelecionadoEA;
    }

    public Polo getPoloAlterar() {
        return poloAlterar;
    }

    public Polo getPoloSelecionado() {
        return poloSelecionado;
    }

    public List<Polo> getPolos() {
        return polos;
    }

    //SETTER
    public void setPoloCadastrar(Polo novoPolo) {
        this.novoPolo = novoPolo;
    }

    public void setNovoPolo(Polo novoPolo) {
        this.novoPolo = novoPolo;
    }

    public void setPoloSelecionadoEA(Polo poloSelecionadoEA) {
        this.poloSelecionadoEA = poloSelecionadoEA;
    }

    public void setPoloAlterar(Polo poloAlterar) {
        this.poloAlterar = poloAlterar;
    }

    public void setPoloSelecionado(Polo poloSelecionado) {
        this.poloSelecionado = poloSelecionado;
    }

    public void setPolos(List<Polo> polos) {
        this.polos = polos;
    }

}
