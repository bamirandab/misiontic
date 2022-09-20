package com.example.ProyectoCiclo3.Controllers;

import com.example.ProyectoCiclo3.Entities.Employee;
import com.example.ProyectoCiclo3.Entities.Enterprise;
import com.example.ProyectoCiclo3.Services.Response;
import com.example.ProyectoCiclo3.Services.EnterpriseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EnterpriseController {

    public EnterpriseService enterpriseService;

    public EnterpriseController(EnterpriseService ser){
        this.enterpriseService = ser;
    }

    @RequestMapping ("enterprises")
    public ArrayList <Enterprise> getUsuarios(){
        return this.enterpriseService.selectAllEnterprise();
    }

    @PostMapping ("enterprises")
    public Response createEnterprise(@RequestBody Enterprise data){
        return this.enterpriseService.createEnterprise(data);
    }

    @RequestMapping ("enterprises/{id}")
    public Enterprise getUsuario(@PathVariable String id){
        long id_converter = Long.parseLong(id);
        return this.enterpriseService.selectById(id_converter);
    }

    @PatchMapping ("enterprises/{id}")
    public Response patchEnterprise(@RequestBody Enterprise data, @PathVariable String id) {
        long id_converter = Long.parseLong(id);
        return this.enterpriseService.upDateEnterprise(data, id_converter);
    }

    @DeleteMapping("enterprises/{id}")
    public Response deleteEnterpriseId(@PathVariable String id){
        long id_converter = Long.parseLong(id);
        return this.enterpriseService.deleteEnterprise(id_converter);
    }

}
