package com.java.edk1;

import java.util.Scanner;

public class ReverseDigitsDoWhile {

    public static void main(String[] args) {
        int num;
        String str = "";

        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Reverse of the digits is : ");
        int div = num;
        do {
            str = str+(num % 10);
            num = num/10;
            div=num;
            div--;
        }
        while (div>=0);
        System.out.println(str);
    }
}
