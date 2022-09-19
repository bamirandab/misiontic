package com.example.ProyectoCiclo3.repository;

import com.example.ProyectoCiclo3.Entities.Employee;
import com.example.ProyectoCiclo3.Entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IProfileRepository extends JpaRepository<Profile,Long> {

    @Query("SELECT u FROM Profile u WHERE u.id = :id")
    Profile findProfileById(@Param("id") long id);

    @Query("SELECT u FROM Profile u ")
    ArrayList<Profile> findAll();
}
