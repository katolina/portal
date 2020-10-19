/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.serviceImpl;

import com.portalVesti.model.TagEntity;
import com.portalVesti.repo.TagRepository;
import com.portalVesti.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kata
 */
public class TagServiceImpl implements TagService{
    
    @Autowired
    private TagRepository tagRepository;

    @Override
    public TagEntity save(TagEntity tag) {
        if(tagRepository.save(tag)!=null){
            return tagRepository.save(tag);
        }
        return null;
    }

    @Override
    public TagEntity findByNaziv(String naziv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
