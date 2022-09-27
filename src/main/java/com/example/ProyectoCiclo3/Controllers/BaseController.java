package com.example.ProyectoCiclo3.Controllers;

import com.example.ProyectoCiclo3.Entities.Profile;
import com.example.ProyectoCiclo3.Services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

    @Autowired
    protected ProfileService service;


    protected Profile seguridad(){
        Profile user;
        //ingreso a la información de spring security
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //Tomo el correo electronico que nos guardo spring securiy
        String currentPrincipalName = authentication.getName();
        user = this.service.selectByUserName(currentPrincipalName);
        return user;
    }
}
