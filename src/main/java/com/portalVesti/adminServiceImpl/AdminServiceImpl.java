/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.adminServiceImpl;

import com.portalVesti.adminServis.AdminService;
import com.portalVesti.repo.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


/**
 *
 * @author Katica
 */
//@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private  AdminRepository adminRepository;

    public AdminServiceImpl() {
    }

    @Override
    public boolean login(String username, String password) {
        if(adminRepository.findByUsernameAndPassword(username, password)!= null){
         return true;
        }
        return false;
    }

 
   
  
    
}
