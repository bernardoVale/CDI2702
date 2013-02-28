/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.edu.controller.ejb;

import br.utfpr.edu.model.annotation.LoginInterceptor;
import br.utfpr.edu.model.bean.Usuario;
import javax.ejb.Local;
import javax.ejb.Stateful;

/**
 *
 * @author bernardo
 */
@Stateful
@Local(UsuarioBeanLocal.class)
public class UsuarioBean implements UsuarioBeanLocal {

    @Override
    @LoginInterceptor
    public String efetuarLogin(Usuario usuario) {
       return "index.xhtml";
    }

   

}
