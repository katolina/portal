/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.service;

import com.portalVesti.model.UserEntity;

/**
 *
 * @author Kata
 */
public interface UserService {
    boolean save(UserEntity user);
    UserEntity findByEmailAndPassword(String email,String password);
}
