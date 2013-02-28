/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.edu.util;

import br.utfpr.edu.model.bean.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bernardo
 */
public class BanList {

    private static List<String> bannedUsers;
    
    public BanList() {
        
    }
    /**
     * Costroi a lista de usuarios banidos
     * @return 
     */
    private static List<String> build(){
        bannedUsers = new ArrayList<String>();
        bannedUsers.add("joao@gmail.com");
        bannedUsers.add("joaozinhobonitinho@gmail.com");
        return bannedUsers;
    }
    /**
     * Retorna a lista de usuarios banidos
     * @return 
     */
    private static List<String> getBanList(){
        if(bannedUsers==null){
            build();
        }
        return bannedUsers;
    }
    /**
     * Verifica se um determinado usuario encontra-se
     * banido
     * @param email
     * @return 
     */
    public static boolean isBanned(String email){
        return getBanList().contains(email);
    }
}
