/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.repo;

import com.portalVesti.model.KategorijaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kata
 */
public interface KategorijaRepository extends JpaRepository<KategorijaEntity, Integer>{
   KategorijaEntity save(KategorijaEntity kategorija);
}
