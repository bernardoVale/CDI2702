/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import br.utfpr.edu.controller.ejb.UsuarioBeanLocal;
import br.utfpr.edu.controller.ejb.UsuarioBeanLocal;
import br.utfpr.edu.controller.qualifiers.Hello;
import br.utfpr.edu.model.annotation.HelloQualifier;
import br.utfpr.edu.model.bean.Usuario;
import br.utfpr.edu.util.HelloType;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author bernardo
 */
@ManagedBean
@SessionScoped
public class UsuarioHandler implements Serializable{

    @Inject
    private Usuario usuario;
    @Inject @HelloQualifier(type= HelloType.COOLGUY)
    private Hello hello;
    @EJB
    UsuarioBeanLocal userEJB;
    
    public String login(){
        usuario.setId(2L);
        return userEJB.efetuarLogin(usuario);
    }
    
    /**
     * Creates a new instance of UsuarioHandler
     */
    public UsuarioHandler() {
    }

    public Hello getHello(){
        return hello;
    }
    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
