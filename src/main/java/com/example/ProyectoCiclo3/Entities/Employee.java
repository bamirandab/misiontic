package com.example.ProyectoCiclo3.Entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "employee")
public class Employee {
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
    private Long[] transactions;

    @Column (name = "createdat")
    private Date createdat;

    @Column (name = "updatedat")
    private Date updatedat;

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

    public Long[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Long[] transactions) {
        this.transactions = transactions;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getUpdatedAT() {
        return updatedat;
    }

    public void setUpdatedAT(Date updatedAT) {
        this.updatedat = updatedAT;
    }



}
