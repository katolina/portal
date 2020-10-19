/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.serviceImpl;

import com.portalVesti.model.KategorijaEntity;
import com.portalVesti.model.VestEntity;
import com.portalVesti.repo.VestRepository;
import com.portalVesti.service.VestService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kata
 */
//@Service
@Transactional
public class VestiServiceImpl implements VestService{

    @PersistenceContext
    EntityManager entityManager;
    
    @Autowired
    private VestRepository vestRepository;

    public VestiServiceImpl() {
    }
    
    @Override
    public boolean save(VestEntity vest) {
      if(vestRepository.save(vest)==null){
        return false;
    }
        return true;
    }

    @Override
    public VestEntity findByKategorija(KategorijaEntity kategorija) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
