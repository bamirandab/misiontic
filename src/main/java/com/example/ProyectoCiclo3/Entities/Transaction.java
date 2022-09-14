package com.example.ProyectoCiclo3.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "concept")
    private String concept;

    @Column (name = "amount")
    private float amount;

    @Column (name = "employee")
    private long employee;

    @Column (name = "enterprise")
    private long enterprise;

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

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public long getEmployee() {
        return employee;
    }


    public long getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(long enterprise) {
        this.enterprise = enterprise;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdAT) {
        this.createdat = createdAT;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date upDatedAT) {
        this.updatedat = upDatedAT;
    }




}
