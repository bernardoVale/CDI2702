/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.edu.controller.interceptors;

import br.utfpr.edu.model.annotation.LoginInterceptor;
import java.io.Serializable;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author bernardo
 */
@Interceptor
@LoginInterceptor
public class LoginInterceptorImpl implements Serializable{
    
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception{
        System.out.println("Interceptado");      
        return context.proceed();
    }
}
