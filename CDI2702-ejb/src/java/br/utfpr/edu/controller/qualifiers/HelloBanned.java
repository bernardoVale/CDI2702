/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.edu.controller.qualifiers;

import br.utfpr.edu.model.annotation.HelloQualifier;
import br.utfpr.edu.util.HelloType;
import javax.inject.Qualifier;

/**
 *
 * @author bernardo
 */
@HelloQualifier(type = HelloType.BANNED)
public class HelloBanned implements Hello{

    @Override
    public String sayHello() {
        return "Saia daqui seu verme!";
    }
    
}
