/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Katica
 */
@Entity
@Table(name = "vest")
public class VestEntity implements Serializable{
    
    
    @Id
    private int idVest;
    private String naslov;
    private String tekst;
    private Date datum;
    private KategorijaEntity kategorija;
    private List<TagEntity> tagovi;

    public VestEntity() {
        tagovi = new ArrayList<>();
    }

    public VestEntity(int idVest, String naslov, String tekst, Date datum, KategorijaEntity kategorija) {
        this.idVest = idVest;
        this.naslov = naslov;
        this.tekst = tekst;
        this.datum = datum;
        this.kategorija = kategorija;
        this.tagovi = new ArrayList<>();
    }

    public int getIdVest() {
        return idVest;
    }

    public void setIdVest(int idVest) {
        this.idVest = idVest;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public KategorijaEntity getKategorija() {
        return kategorija;
    }

    public void setKategorija(KategorijaEntity kategorija) {
        this.kategorija = kategorija;
    }

    public List<TagEntity> getTagovi() {
        return tagovi;
    }

    public void setTagovi(List<TagEntity> tagovi) {
        this.tagovi = tagovi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.idVest;
        hash = 47 * hash + Objects.hashCode(this.naslov);
        hash = 47 * hash + Objects.hashCode(this.tekst);
        hash = 47 * hash + Objects.hashCode(this.datum);
        hash = 47 * hash + Objects.hashCode(this.kategorija);
        hash = 47 * hash + Objects.hashCode(this.tagovi);
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
        final VestEntity other = (VestEntity) obj;
        if (this.idVest != other.idVest) {
            return false;
        }
        if (!Objects.equals(this.naslov, other.naslov)) {
            return false;
        }
        if (!Objects.equals(this.tekst, other.tekst)) {
            return false;
        }
        if (!Objects.equals(this.datum, other.datum)) {
            return false;
        }
        if (!Objects.equals(this.kategorija, other.kategorija)) {
            return false;
        }
        if (!Objects.equals(this.tagovi, other.tagovi)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return naslov+" "+datum + " "+ tekst+" "+kategorija+" ";
    }
    
    
    
    
}
