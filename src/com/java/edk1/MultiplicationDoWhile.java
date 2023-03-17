package com.java.edk1;

import java.util.Scanner;

public class MultiplicationDoWhile {

    public static void main(String[] args) {
        int num;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Multiplication table for Number "+num+" : ");
        int i=1;
        do {
            System.out.println(num+" X "+i+" = "+(num*i));
            i++;
        } while(i<=10);
    }
}
