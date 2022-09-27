package com.example.ProyectoCiclo3.Controllers;


import com.example.ProyectoCiclo3.Entities.Profile;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

@Controller
public class HomeController extends BaseController {

    @GetMapping("inicio")
    public String inicio(Model data,@AuthenticationPrincipal OidcUser principal){

        Profile user = new Profile();
        user = seguridad();
        if(principal != null){
           Map<String,Object> Auth0Data = principal.getClaims();
           String username =(String) Auth0Data.get("username");
           user = this.service.selectByUserName(username);
        }
        else{

        }

        data.addAttribute("usuarioautenticado",user);
        return "home/inicio";
    }


}
