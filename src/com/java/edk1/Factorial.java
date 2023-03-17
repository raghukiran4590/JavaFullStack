package com.java.edk1;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int fact = 1,num;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=num;i>0;) {
            fact=fact*i;
            i--;
        }
            System.out.println("Factorial of the Number is : "+fact);
    }
}
