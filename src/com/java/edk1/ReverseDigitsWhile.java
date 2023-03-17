package com.java.edk1;

import java.util.Scanner;

public class ReverseDigitsWhile {

    public static void main(String[] args) {
        int num;
        String str = "";

        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Reverse of the digits is : ");
        int div = num;
        while (div>=0) {
            str = str+(num % 10);
            num = num/10;
            div=num;
            div--;
        }
        System.out.println(str);
    }
}
