package com.example.ProyectoCiclo3.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class LoginController {

//    private UserService service;
//    private TipoDocumentoService docService;
//
//    public LoginController(UserService service, TipoDocumentoService docService){
//        this.service = service ;
//        this.docService = docService;
//    }

    @GetMapping("/")
    public String root(){
        return "login/login";
    }
    @GetMapping("login")
    public String login(){
        return "login/login";
    }


}
