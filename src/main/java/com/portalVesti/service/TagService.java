/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.service;

import com.portalVesti.model.TagEntity;

/**
 *
 * @author Kata
 */
public interface TagService {
    TagEntity save(TagEntity tag);
    TagEntity findByNaziv(String naziv);
}
