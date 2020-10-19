/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.serviceImpl;

import com.portalVesti.model.KategorijaEntity;
import com.portalVesti.repo.KategorijaRepository;
import com.portalVesti.service.KategorijaService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kata
 */
public class KategorijaServiceImpl implements KategorijaService{

    
    
    @Autowired
    private KategorijaRepository kategorijaRepository;
    
    
    @Override
    public boolean save(KategorijaEntity kategorija) {
        if(kategorijaRepository.save(kategorija)!=null){
        return true;
        }
        return false;
    }
    
}
