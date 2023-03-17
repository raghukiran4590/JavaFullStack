package com.java.edk1;

import java.util.Scanner;

public class FactorialDoWhile {

    public static void main(String[] args) {
        int fact = 1,num;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        do {
            fact=fact*num;
            num--;
        }
        while (num >0);
        System.out.println("Factorial of the Number is : "+fact);
    }
}
