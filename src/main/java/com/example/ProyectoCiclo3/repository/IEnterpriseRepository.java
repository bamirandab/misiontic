package com.example.ProyectoCiclo3.repository;

import com.example.ProyectoCiclo3.Entities.Enterprise;

import java.util.ArrayList;

public interface IEnterpriseRepository {
    
    public default ArrayList<Enterprise> findAll(){
        ArrayList<Enterprise> enterprise_test = new ArrayList<Enterprise>();
        enterprise_test.add(new Enterprise());
        return enterprise_test;
    }

    public default Enterprise selectById(long id){
        Enterprise enterprise_test = new Enterprise();
        return enterprise_test;
    }


}