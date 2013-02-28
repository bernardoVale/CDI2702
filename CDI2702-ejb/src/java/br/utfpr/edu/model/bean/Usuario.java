/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.utfpr.edu.model.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author bernardo
 */
@Named()
@SessionScoped
public class Usuario implements Serializable{

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private boolean bannedFlag;

    public Usuario() {
        this.bannedFlag = false;
    }

    public String getSenha() {
        return senha;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
        
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha +
                "flag="+bannedFlag+'}';
    }

    /**
     * @return the bannedFlag
     */
    public boolean isBannedFlag() {
        return bannedFlag;
    }
    public void setBannedFlag(boolean flag){
        this.bannedFlag = flag;
    }
    
}
