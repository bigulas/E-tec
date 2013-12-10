/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author ACER
 */
@ManagedBean
@RequestScoped
public class InicioController {

    /**
     * Creates a new instance of InicioController
     */
    public InicioController() {
    }

    public void iniciarTela() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("inicio.xhtml");
    }
}
