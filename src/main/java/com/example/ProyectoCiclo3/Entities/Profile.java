package com.example.ProyectoCiclo3.Entities;

import javax.persistence.*;

@Entity
@Table (name = "Profile")

public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column (name = "image")
    private String image;

    @Column (name = "phone")
    private String phone;

    @Column (name = "user")
    private User user;

    @Column (name = "image")
    private String image;

    @Column (name = "createdAT")
    private data create;

    @Column (name = "upDateAT")
    private data upDatedAT;



}
