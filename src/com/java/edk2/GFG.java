package com.java.edk2;

import java.util.HashSet;
import java.util.Set;

// Class 3
// Association between both the
// classes in main method
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");

        Set<Employee> employees = new HashSet<>();
        employees.add(emp);

        bank.setEmployees(employees);

        System.out.println(bank.getEmployees()+"are belongs to bank"+bank.getBankName());
    }
}
