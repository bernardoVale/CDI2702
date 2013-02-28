/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.edu.controller.ejb;

import br.utfpr.edu.model.bean.Usuario;
import javax.ejb.Local;

/**
 *
 * @author bernardo
 */
@Local
public interface UsuarioBeanLocal {
    
    public String efetuarLogin(Usuario usuario);
}
