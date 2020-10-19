/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Kata
 */
@Entity
public class UserEntity implements Serializable{
    @Id
    private int id;
    private String email;
    private String ime;
    private String prezime;
    private String password;

    public UserEntity() {
    }

    public UserEntity(int id, String email, String ime, String prezime,String password) {
        this.id = id;
        this.email = email;
        this.ime = ime;
        this.prezime = prezime;
       
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.email);
        hash = 29 * hash + Objects.hashCode(this.ime);
        hash = 29 * hash + Objects.hashCode(this.prezime);
       
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserEntity other = (UserEntity) obj;
        if (this.id != other.id) {
            return false;
        }
       
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.prezime, other.prezime)) {
            return false;
        }
      
        return true;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

  

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    @Override
    public String toString() {
        return "ime: "+ime +" prezime: "+prezime;
    }
    
    
    
    
}
