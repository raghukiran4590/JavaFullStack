package com.java.edk1;

import java.util.Scanner;

public class AddDigitsDoWhile {

    public static void main(String[] args) {
        int num,res=0;
        String  s;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int div = num;
         do {
            res = res + (num % 10);
            div = num / 10;
            num = div;
            div--;
        } while(div>=0);

        System.out.println("The addition of the digits is : "+res);
    }
}
