package com.example.ProyectoCiclo3.Entities;

import javax.persistence.*;

@Entity
@Table (name = "Transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @UniqueConstraint()
    @Column (name = "concept")
    private String concept;

    @Column (name = "amount")
    private float amount;

    @Column (name = "user")
    private User user;

    @Column (name = "enterprise")
    private Enterprise enterprise;

    @Column (name = "createdAT")
    private data create;

    @Column (name = "upDateAT")
    private data upDatedAT;
}
