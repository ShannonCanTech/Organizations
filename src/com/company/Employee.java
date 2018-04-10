package com.company;

import java.util.ArrayList;

public class Employee {
    //Set up attributes of the employee class
    private String employeeNumber;
    private String employeeFirstName;
    private String employeeLastName;

    private ArrayList<Organization> organizations;

    public Employee() {
    }

    public String getEmployeeName() {
        return getEmployeeFirstName() + " " +getEmployeeLastName();
    }

    public Employee(String employeeNumber, String employeeFirstName, String employeeLastName) {
        this.employeeNumber = employeeNumber;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

}
