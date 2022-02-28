package com.company.assessment2.Question10;

import com.company.assessment2.Question7.Product;
import com.company.day10.associationWithAnno.Person;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private int id;
    @Column(name = "store_name")
    private String name;
    @Column(name = "store_address")
    private String address;

    @OneToMany(mappedBy = "store", cascade = CascadeType.REMOVE)
    private Set<Product> products= new HashSet<>();

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Store() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
