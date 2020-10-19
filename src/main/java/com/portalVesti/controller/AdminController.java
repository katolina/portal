package com.portalVesti.controller;

import com.portalVesti.serviceImpl.AdminServiceImpl;
import com.portalVesti.service.AdminService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.AbstractController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Katica
 */
@Controller
@RequestMapping(path = "/registracija/admin")
public class AdminController {

//    @Autowired
//    private AdminService adminService;

    public AdminController() {
    }

    
    @GetMapping
    public String admin(){
        return "/admin";
    }
    
    @PostMapping(path = "/login")
    public String ulogovaniAdmin() {
       
        return "/WEB-INF/pages/login";
    }
}
