package com.example.ProyectoCiclo3.repository;

import com.example.ProyectoCiclo3.Entities.Employee;
import com.example.ProyectoCiclo3.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {

    @Query("SELECT u FROM Employee u WHERE u.id = :id")
    ArrayList<Employee> findEmployeeById(@Param("id") long id);

    @Query("SELECT u FROM Employee u ")
    ArrayList<Employee> findAll();


}
