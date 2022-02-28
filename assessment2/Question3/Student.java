package com.company.assessment2.Question3;

import jakarta.persistence.*;
//Ans3.
//hbm.xml is the name of hibernate mapping file.

@Entity
@Table(name = "students")

public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "ROll No")
    private int roll_no;
    @Column(name = "university")
    private String university;

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

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    Student(){

    }

    public Student(String name, int roll_no, String university) {
        this.name = name;
        this.roll_no = roll_no;
        this.university = university;
    }
    public Student(String name) {
        this.name = name;
    }



}
