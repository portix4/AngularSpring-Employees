package com.employees.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;
    private String employeeName;
    private String employeePhoneNumber;
    private String employeeAddress;
    private String employeeGender;
    private String employeeDepartment;
    private String employeeSkills;

    public Employee(){

    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public String getEmployeeSkills() {
        return employeeSkills;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeSkills(String employeeSkills) {
        this.employeeSkills = employeeSkills;
    }
}
