/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.dto;

import java.io.Serializable;

/**
 *
 * @author Katica
 */
public class AdminDTO implements Serializable{
    private int id;
    private String password;
    private String username;
    private String ime;
    private String prezime;

    public AdminDTO() {
    }

    public AdminDTO(int id, String password, String username, String ime, String prezime) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    
    
}
