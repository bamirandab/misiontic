package com.example.ProyectoCiclo3.Services;

import org.springframework.stereotype.Service;

@Service
public class Response {

    private int code;
    private String message;


    public int getCode(int i) {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
