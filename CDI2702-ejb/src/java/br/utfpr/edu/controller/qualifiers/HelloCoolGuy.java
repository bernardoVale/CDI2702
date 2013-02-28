/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.edu.controller.qualifiers;

import br.utfpr.edu.model.annotation.HelloQualifier;
import br.utfpr.edu.util.HelloType;

/**
 *
 * @author bernardo
 */
@HelloQualifier(type = HelloType.COOLGUY)
public class HelloCoolGuy implements Hello{

    @Override
    public String sayHello() {
        return "Seja bem vindo";
    }
    
}
