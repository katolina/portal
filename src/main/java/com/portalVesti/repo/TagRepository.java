/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.repo;

import com.portalVesti.model.TagEntity;
import javax.faces.view.facelets.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kata
 */
public interface TagRepository extends JpaRepository<TagEntity, Integer>{
    @Override
    TagEntity save(TagEntity tag);
    TagEntity findByNaziv(String naziv);
    
}
