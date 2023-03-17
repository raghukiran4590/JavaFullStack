package com.java.edk1;
//generate tables of 10

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        int num;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Multiplication table for Number "+num+" : ");

        for (int i =1; i<=10; i++) {
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}
