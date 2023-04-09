package com.java.edk5;

import java.util.HashMap;
import java.util.Map;

//program to write 5 employee records using HashMap and display them
public class HashmapExample {

    public static void main(String[] args) {

        Map<Integer, Employee> empMap = new HashMap();
        System.out.println("Write 5 employee records using HashMap and display them");
        empMap.put(1, new Employee(1, "Raghu", 1234.56));
        empMap.put(2, new Employee(2, "Neetha", 23547.88));
        empMap.put(3, new Employee(3, "Vriha", 485983.9));
        empMap.put(4, new Employee(4, "Neelu", 15475.18));
        empMap.put(5, new Employee(5, "Esha", 56758.77));

        System.out.println("Size of the HashMap is : "+empMap.size());

        System.out.println("Contents of the HashMap is : ");

        for (Map.Entry<Integer, Employee> e : empMap.entrySet())
            System.out.println(" EmpID: " + e.getValue().getEmpId()
                    + " EmpName: " + e.getValue().getEmpName() + " EmpSalary: " + e.getValue().getEmpSalary());
    }

}
