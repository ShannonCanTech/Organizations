package com.company;

import java.util.ArrayList;

public class Organization {
    private String organizationName;

    private ArrayList<Employee> employees;

    public Organization() {
        this.employees = new ArrayList<>();
    }

    public Organization(String organizationName) {
        this.organizationName = organizationName;
        this.employees = new ArrayList<>();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

/*    public void addEmployee(Employee employee)
    {
        this.employees.add(employee);

    }*/

    public ArrayList<Employee> getTheEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);

    }
}
