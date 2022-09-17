package com.example.ProyectoCiclo3.repository;

import com.example.ProyectoCiclo3.Entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface IEnterpriseRepository extends JpaRepository<Enterprise,Long> {

@Query("SELECT u FROM Enterprise u WHERE u.id = :id")
    Enterprise findEmployeeById(@Param("id") long id);

@Query("SELECT u FROM Enterprise u ")
    ArrayList<Enterprise> findAll();


}
