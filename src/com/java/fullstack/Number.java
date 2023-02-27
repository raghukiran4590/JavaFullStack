package com.java.fullstack;

import java.util.Scanner;

//Write a program to check if the number is positive or negative.
//Extend the previous program to check whether the given number is positive, zero or negative.

public class Number {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num >0) {
            System.out.println("The number is positive");
        } else if (num ==0){
            System.out.println("The number is zero");
        } else {
            System.out.println("The number is zero");
        }

    }
}
