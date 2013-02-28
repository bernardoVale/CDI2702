/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.edu.controller.qualifiers;

import java.io.Serializable;
import javax.inject.Named;

/**
 *
 * @author bernardo
 */
@Named
public interface Hello extends Serializable{

    public String sayHello();
}
