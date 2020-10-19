/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Kata
 */
@Controller
@RequestMapping(path = "/vest")
public class VestController {
    
    
    @GetMapping
    public String vest1(){
        return "";
    }
    
    
    @GetMapping( path = "/novaVest")
    public String vest(){
        return "/WEB-INF/pages/novaVest";
    }
    
}
