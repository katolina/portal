/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.repo;

import com.portalVesti.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kata
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    @Override
    UserEntity save(UserEntity user);
    
    UserEntity findByEmailAndPAssword(String email,String password);
}
