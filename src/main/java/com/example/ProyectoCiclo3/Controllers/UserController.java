package com.example.ProyectoCiclo3.Controllers;

import com.example.ProyectoCiclo3.Services.Response;
import com.example.ProyectoCiclo3.Services.UserServices;
import org.springframework.web.bind.annotation.*;

@RequestMapping("users")
@RestController
public class UserController {


    public Response users;
    public UserController servicio;
    public UserServices servicios;


    @PostMapping("/users")
    public int postUsers() {
        return (200);
    }

    @GetMapping("/users")
    public int getUsers() {
       return users.getCode(200);
        }

    @GetMapping("/user/[id]")
    public int getIdUsers() {
        return users.getCode(200);
    }

    @PatchMapping("/users/[id]")
    public int patchUsers() {
        return users.getCode(200);
    }

    @DeleteMapping("/users/[id]")
    public int deleteUsers() {
        return users.getCode(200);
    }



}



