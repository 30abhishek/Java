package com.company.assessment2.Question3;

import jakarta.persistence.*;

public class StudentWithoutAnnotation {
    private int id;
    private String name;
    private int roll_no;
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

    StudentWithoutAnnotation(){

    }

    public StudentWithoutAnnotation(String name, int roll_no, String university) {
        this.name = name;
        this.roll_no = roll_no;
        this.university = university;
    }



}
