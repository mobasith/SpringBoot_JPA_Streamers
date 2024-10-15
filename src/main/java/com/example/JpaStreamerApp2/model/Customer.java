package com.example.JpaStreamerApp2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "cid")

    private int id;

    @Column(name = "cname")
    private String name;

    @Column(name = "City")
    private String city;


    @Column(name = "Age")
    private int age;

    @Column(name = "Gender")
    private String gender;


    @Column(name = "product_bought")
    private String prod;

    @Column(name = "quantity")
    private int qty;

    @Column(name = "total_amount")
    private int amount;


}
