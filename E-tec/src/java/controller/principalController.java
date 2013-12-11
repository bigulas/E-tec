/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author ACER
 */
@ManagedBean
@SessionScoped
public class principalController {

    /**
     * Creates a new instance of principalController
     */
    public principalController() {
    }
    
    public void iniciarTela() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("restrito/principal.xhtml");
    }
    
}
