package com.jakemaxell.userdatabaseapi.domain;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EMPLOYEE_NAME")
    private String name;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @Column(name = "EMPLOYEE_SALARY")
    private Integer salary;

    @Column(name = "DEPARTMENT")
    private String department;

    @Embedded
    @Column(name = "ADDRESS")
    private Address address;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getSalary(){
        return salary;
    }

    public void setSalary(Integer salary){
        this.salary = salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getJobTitle(){ return jobTitle; }

    public void setJobTitle(String jobTitle){ this.jobTitle = jobTitle; }

    public Address getAddress(){ return address; }

    public void setAddress(Address address){ this.address = address; }

}
