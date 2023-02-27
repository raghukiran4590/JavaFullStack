package com.java.fullstack;
//Write a program to find largest of two numbers.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        num1=sc1.nextInt();
        System.out.println("Enter Number 2 : ");
        num2= sc2.nextInt();

        if (num1>num2) {
            System.out.println(num1 +" is the largest");
        } else {
            System.out.println(num2 +" is the largest");
        }
    }
}
