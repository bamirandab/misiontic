package com.example.ProyectoCiclo3.Entities;

import javax.persistence.*;

@Entity
@Table (name = "Enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @UniqueConstraint()
    @Column (name = "name")
    private String name;

    @UniqueConstraint()
    @Column (name = "document")
    private String document;

    @Column (name = "phone")
    private String phone;

    @Column (name = "address")
    private String address;

    @Column (name = "user")
    private User user;

    @Column (name = "transactions")
    private Transaction[] transactions;

    @Column (name = "createdAT")
    private data create;

    @Column (name = "upDateAT")
    private data upDatedAT;


}
