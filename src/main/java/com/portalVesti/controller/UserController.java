/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Kata
 */
@Controller
@RequestMapping(path = {"registracija/user","registracija/registracija/user"})
public class UserController {
    
    
    @GetMapping
    public String user(){
        return "user";
    }
    
    @GetMapping(value = "/stariNalog")
    public String stariNalog(){
        return "stariNalog";
    }
    
    
    
    @GetMapping(path = "/noviNalog")
    public String noviNalog(){
        return "noviNalog";
    }
}
