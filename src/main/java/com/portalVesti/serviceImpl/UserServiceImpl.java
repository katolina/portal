/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.serviceImpl;

import com.portalVesti.model.UserEntity;
import com.portalVesti.repo.UserRepository;
import com.portalVesti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kata
 */
public class UserServiceImpl implements UserService{

    @Autowired
    public UserRepository userRepository;
    
    @Override
    public boolean save(UserEntity user) {
        if(userRepository.save(user)!= null){
            return true;
        }
        return false;
    }

    @Override
    public UserEntity findByEmailAndPassword(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
