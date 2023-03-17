package com.java.edk1;

import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        int num;
        String str = "";

        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Reverse of the digits is : ");

        for (int div = num; div>=0; div--) {

            str = str+(num % 10);
            num = num/10;
            div=num;
        }
        System.out.println(str);
    }

}
