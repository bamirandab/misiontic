package com.example.ProyectoCiclo3.Controllers;

import com.example.ProyectoCiclo3.Services.Response;
import com.example.ProyectoCiclo3.Services.UserServices;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("users")
public class EmployeeController {


    public Response users;

    public UserServices servicios;


    @PostMapping("/users")
    public int postUsers() {
        return servicios.getCode(200);
    }

    @GetMapping("/users")
    public int getUsers() {
        return servicios.getCode(200);
    }

    @GetMapping("/user/[id]")
    public int getIdUsers() {
        return servicios.getCode(200);
    }

    @PatchMapping("/users/[id]")
    public int patchUsers() {
        return servicios.getCode(200);
    }

    @DeleteMapping("/users/[id]")
    public int deleteUsers() {
        return servicios.getCode(200);
    }



}



