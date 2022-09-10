package com.example.ProyectoCiclo3.Controllers;

import com.example.ProyectoCiclo3.Entities.Enterprise;
import com.example.ProyectoCiclo3.Services.Response;
import com.example.ProyectoCiclo3.Services.EnterpriseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class EnterpriseController {

    private EnterpriseService enterpriseService;

    public EnterpriseController(EnterpriseService ser){
        this.enterpriseService = ser;
    }

    @RequestMapping ("getEnterprises")
    public ArrayList <Enterprise> getUsuarios(){
        return this.enterpriseService.selectAllEnterprise();
    }

    @PostMapping ("postEnterprises")
    public Response createEnterprise(@RequestBody Enterprise request){
        return this.createEnterprise(request);
    }

    @RequestMapping ("getEnterprises/{id}")
    public Enterprise getUsuario(@PathVariable int id){
        return this.enterpriseService.selectByIdEnterprise(id);
    }

    @PatchMapping ("patchEnterprises/{id}")
    public Response upDateEnterprise(@RequestBody Enterprise request){
        return this.enterpriseService.upDateEnterprise(request);
    }

    @DeleteMapping("deleteEnterprise/{id}")
    public Response deleteEnterpriseId(@PathVariable int id){
        return this.enterpriseService.deleteEnterprise(id);
    }

}
