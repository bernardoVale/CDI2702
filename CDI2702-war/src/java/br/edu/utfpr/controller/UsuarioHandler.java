/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.controller;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author bernardo
 */
@Named(value = "usuarioHandler")
@RequestScoped
public class UsuarioHandler implements Serializable{

    
    /**
     * Creates a new instance of UsuarioHandler
     */
    public UsuarioHandler() {
    }
}
