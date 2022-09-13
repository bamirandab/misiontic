package com.example.ProyectoCiclo3.Entities;

import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table (name = "Enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column (name = "name")
    private String name;


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


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }
}
