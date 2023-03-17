package com.java.edk1;

import java.util.Scanner;

public class FactorialWhile {

    public static void main(String[] args) {
        int fact = 1,num;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num >0) {
            fact=fact*num;
            num--;
        }

        System.out.println("Factorial of the Number is : "+fact);
    }
}
