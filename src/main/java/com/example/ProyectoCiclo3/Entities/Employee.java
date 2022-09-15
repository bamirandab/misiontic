package com.example.ProyectoCiclo3.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Employee")
public class Employee {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public long getProfile() {
        return profile;
    }

    public void setProfile(long profile) {
        this.profile = profile;
    }

    public EnumRole getRole() {
        return role;
    }

    public void setRole(EnumRole role) {
        this.role = role;
    }

    public long getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(long enterprise) {
        this.enterprise = enterprise;
    }

    public long[] getTransactions() {
        return transactions;
    }

    public void setTransactions(long[] transactions) {
        this.transactions = transactions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAT() {
        return updatedAT;
    }

    public void setUpdatedAT(Date updatedAT) {
        this.updatedAT = updatedAT;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "email")
    private String emails;

    @Column (name = "profile")
    private long profile;

    @Column (name = "role")
    private EnumRole role;

    @Column (name = "enterprise")
    private long enterprise;

    @Column (name = "transactions")
    private long[] transactions;

    @Column (name = "createdAT")
    private Date createdAt;

    @Column (name = "updatedAT")
    private Date updatedAT;

}
