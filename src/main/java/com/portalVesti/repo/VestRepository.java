/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.repo;

import com.portalVesti.model.KategorijaEntity;
import com.portalVesti.model.VestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Katica
 */
//@Repository
public interface VestRepository extends JpaRepository<VestEntity, Integer>{
    
    VestEntity save(VestEntity vest);
    VestEntity findByKategorija(KategorijaEntity kategorija);
}
