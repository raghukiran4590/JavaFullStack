package com.java.edk2;

/*Write a program to accept 5 employee IDs and the corresponding names and their salaries from the user and
store them in three arrays.Pass these arrays to a function display() as arguments.
This display() will display the content of the arrays in the following format*/

import java.util.Scanner;

public class DisplayArray1 {

    public static void display(int[] emplid, String[] empname, double[] empsal) {
        System.out.print("ID"+"   "+"Name"+"  "+"Salary");
        for (int k=0; k<5; k++) {
            System.out.println("");
            System.out.print(emplid[k]);
            System.out.print("    ");
            System.out.print(empname[k]);
            System.out.print("    ");
            System.out.print(empsal[k]);
        }
        System.out.println("");
    }

    public static void display(int[] emplid, String[] empnm) {
        System.out.print("ID"+"   "+"Name");
        for (int k=0; k<5; k++) {
            System.out.println("");
            System.out.print(emplid[k]);
            System.out.print("    ");
            System.out.print(empnm[k]);
            System.out.print("    ");
        }
        System.out.println("");
    }

    public static void display (String name, int regno[], String Empname[], double salary[]) {
        System.out.print("ID"+"   "+"Name"+"  "+"Salary");
        for (int m=0; m<5; m++) {
            if(Empname[m].equalsIgnoreCase(name)){
                System.out.println("");
                System.out.print(regno[m]);
                System.out.print("    ");
                System.out.print(Empname[m]);
                System.out.print("    ");
                System.out.print(salary[m]);
                System.out.print("    ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int[] empid = new int[5];
        String[] empname = new String[5];
        double[] empsal = new double[5];
        int j=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the employee details : ");
        for (int i=0; i<5; i++) {
            System.out.println("ID of the employee "+(i+1)+" : ");
            empid[i] = sc.nextInt();
            System.out.println("Name of the employee "+(i+1)+" : ");
            empname[i] = sc.next();
            System.out.println("Salary of the employee "+(i+1)+" : ");
            empsal[i] = sc.nextDouble() ;
        }
        display(empid,empname,empsal);
        display(empid,empname);
        display("vriha",empid,empname,empsal);
    }
}
