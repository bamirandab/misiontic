package com.example.ProyectoCiclo3.Controllers;

import com.example.ProyectoCiclo3.Services.Response;
import com.example.ProyectoCiclo3.Services.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("enterprises/{id{}")
public class TransactionController {
    public UserServices movimientos;


    @PostMapping("enterprises/{id{}")
    public int postUsers() {
        return movimientos.getCode(200);
    }

    @GetMapping("enterprises/{id{}")
    public int getUsers() {
        return movimientos.getCode(200);
    }

    @PatchMapping("enterprises/{id{}")
    public int patchUsers() {
        return movimientos.getCode(200);
    }

    @DeleteMapping("enterprises/{id{}")
    public int deleteUsers() {
        return movimientos.getCode(200);
    }



}



