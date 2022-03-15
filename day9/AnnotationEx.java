package com.company.day9;

import jakarta.persistence.*;

@Entity
@Table(name="Person_Detail")
public class AnnotationEx {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_name", nullable = false, length = 200)
    private String name;
    private Boolean isHired = false;


    public Boolean getisHired() {
        return isHired;
    }

    public void setisHired(Boolean hired) {
        isHired = hired;
    }

    public AnnotationEx(String name, Boolean isHired) {
        this.name = name;
        this.isHired = isHired;
    }

    public AnnotationEx() {
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
}
