package com.example.ProyectoCiclo3.Entities;

import javax.persistence.*;

@Entity
@Table (name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @UniqueConstraint()
    @Column (name = "email")
    private String email;

    @Column (name = "profile")
    private Profile profile;

    @Column (name = "role")
    private Enum_RoleName role;

    @Column (name = "enterprise")
    private Enterprise enterprise;

    @Column (name = "transactions")
    private Transaction[] transactions;

    @Column (name = "createdAT")
    private data create;

    @Column (name = "upDateAT")
    private data upDatedAT;

}
