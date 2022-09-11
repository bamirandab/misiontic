package com.example.ProyectoCiclo3.Entities;

import javax.persistence.*;

@Entity
@Table (name = "Employee")
public class Employee {

    public Employee() {
    }

    public Employee(int id) {this.id = id;
    }

    private int id;
    private String name;

    private String email;

    public String getEmail() {
        return email;


    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ids;

    @Id
    @Column (name = "email")
    private String emails;

    @Column (name = "profile")
    private Profile profile;

    @Column (name = "role")
    private EnumRole role;

    @Column (name = "enterprise")
    private Enterprise enterprise;

    @Column (name = "transactions")
    private Transaction[] transactions;

    @Column (name = "createdAT")
    private data create;

    @Column (name = "upDateAT")
    private data upDatedAT;

    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
