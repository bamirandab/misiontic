package com.example.ProyectoCiclo3.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Employee")
public class Employee {

    public Employee() {
    }

    public Employee(int id) {this.id = id;
    }

    private long id;
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
    private Date createdAt;

    @Column (name = "updateAT")
    private Date updatedAT;

//    public long getId() {
//        return id;
//    }
//
//    public void setId(int id) {this.id = id; }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {this.id = id; }
//
//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }
}
