/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce;

/**
 *
 * @author Lenin
 */
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

@ManagedBean
public class UserLoginView {

    private String username;

    private String password;

    int nivel_acceso;

    public int getNivel_acceso() {
        return nivel_acceso;
    }

    public void setNivel_acceso(int nivel_acceso) {
        this.nivel_acceso = nivel_acceso;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(ActionEvent event) throws IOException {
        try {
            ResumenDao resumen;
            List<entrar> lista1;
            resumen = new ResumenDao();
            lista1 = resumen.entrada();
            RequestContext context = RequestContext.getCurrentInstance();

            FacesMessage message = null;
            boolean loggedIn = false;
            //int nivel_acceso =0;
            OUTER:
            for (entrar nombre : lista1) {
                if (username != null && username.equals(nombre.getUsuario()) && password != null && password.equals(nombre.getClave())) {
                    loggedIn = true;
                    nivel_acceso = nombre.getNivel_acceso();
                    
                    switch (nivel_acceso) {
                        case 3:
                            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
                            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/index_estudiante.xhtml");
                            break OUTER;
                        case 2:
                            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
                            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/index_profesor.xhtml");
                            break OUTER;
                        default:
                            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
                            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/index_administrador.xhtml");
                            break OUTER;
                    }
                } else {
                    loggedIn = false;
                    message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
                }
            }
            FacesContext.getCurrentInstance().addMessage(null, message);
            context.addCallbackParam("loggedIn", loggedIn);

        } catch (SQLException ex) {
            Logger.getLogger(Resumen3Bean.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }

    }

    public String send() {

        return "faces/index_administrador.xhtml";
    }

}
