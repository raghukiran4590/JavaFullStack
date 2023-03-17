package com.java.edk1;

import java.util.Scanner;

public class MultiplicationWhile {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Multiplication table for Number "+num+" : ");
        int i=1;
        while(i<=10) {
            System.out.println(num+" X "+i+" = "+(num*i));
            i++;
        }
    }

}
