/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.edu.controller.interceptors;

import br.utfpr.edu.model.annotation.LoginInterceptor;
import br.utfpr.edu.model.bean.Usuario;
import br.utfpr.edu.util.BanList;
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
        Object [] obj= context.getParameters();
        Usuario u = (Usuario) obj[0];
        if(BanList.isBanned(u.getEmail())){
            u.setBannedFlag(true);
        }else{
            u.setBannedFlag(false);
        }
        context.setParameters(obj);
        System.out.println(u.toString());
        return context.proceed();
    }
}
