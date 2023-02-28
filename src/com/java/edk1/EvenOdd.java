package com.java.edk1;
//Write a program to check given number is evenor odd

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num%2 ==0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
