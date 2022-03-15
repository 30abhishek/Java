package com.company.day9;

public class Department {
    private Integer id;
    private String department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepId() {
        return department;
    }

    public void setDepId(String department) {
        this.department = department;
    }

    public Department(){
    }
    public Department(Integer id, String department) {
        this.id = id;
        this.department = department;
    }
}
