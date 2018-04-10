package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Organization anOrganization;
        Employee aEmployee;
        String employeeAnswer = "";
        String organizationAnswer = "";
        boolean employeeDone = false;
        boolean organizationDone = false;

        ArrayList<Organization> allOrganizations = new ArrayList<>();

//        do {
            System.out.print("Enter name of organization: ");
            anOrganization = new Organization(keyboard.nextLine());

            System.out.println("Your organization is called: " + anOrganization.getOrganizationName());

            do {

                aEmployee = new Employee();
                System.out.println("Enter employee's first name: ");
                aEmployee.setEmployeeFirstName(keyboard.nextLine());

                System.out.println("Enter employee's last name: ");
                aEmployee.setEmployeeLastName(keyboard.nextLine());

                System.out.println("Enter employee number: ");
                aEmployee.setEmployeeNumber(keyboard.nextLine());

                System.out.println("Employee details: Employee Name: " + aEmployee.getEmployeeName() + " Employee Number:" + aEmployee.getEmployeeNumber());

                anOrganization.addEmployee(aEmployee);

                System.out.println("Do you want to enter details for another employee?");
                employeeAnswer = keyboard.nextLine();

                if (employeeAnswer.equalsIgnoreCase("no") || employeeAnswer.equalsIgnoreCase("n")) {
                    employeeDone = true;
                } else {
                    employeeDone = false;
                }
            } while (!employeeDone);


            allOrganizations.add(anOrganization);

/*            System.out.println("Do you want to enter another organization?");
            organizationAnswer = keyboard.nextLine();
            if (organizationAnswer.equalsIgnoreCase("no") || organizationAnswer.equalsIgnoreCase("n")) {
                organizationDone = true;
            }
        } while (!organizationDone);*/


        for (Organization eachOrganization : allOrganizations) {
            System.out.println("These are employees for " + eachOrganization.getOrganizationName() + ": \n");
            for (Employee eachEmployee : eachOrganization.getTheEmployees()) {

                System.out.print("Name: \t" + eachEmployee.getEmployeeName() +"\t");
                System.out.print("Employee Number: \t" + eachEmployee.getEmployeeNumber() + "\n");
            }
            System.out.print("\n");
        }
    }
/*        for (Organization eachOrganization:allOrganizations) {
            System.out.println("These are employees for "+eachOrganization.getOrganizationName());
            for(Employee eachEmployee:eachOrganization.getTheEmployees())
            {
                System.out.println(" These are the details of the employee: Employee Number: "+eachEmployee.getEmployeeNumber()+" Name: "+eachEmployee.getEmployeeName());
            }
        }*/
    /**/

}