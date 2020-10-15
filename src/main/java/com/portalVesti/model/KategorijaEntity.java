/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Katica
 */
@Entity
@Table(name = "kategorija")
public class KategorijaEntity implements Serializable{
    @Id
    private int idKategorije;
    private String naziv;

    public KategorijaEntity() {
    }

    public KategorijaEntity(int idKategorije, String naziv) {
        this.idKategorije = idKategorije;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getIdKategorije() {
        return idKategorije;
    }

    public void setIdKategorije(int idKategorije) {
        this.idKategorije = idKategorije;
    }
    
    
    
}
