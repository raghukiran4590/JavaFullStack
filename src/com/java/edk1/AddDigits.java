package com.java.edk1;

import java.util.Scanner;

//add the digits of a number
public class AddDigits {

    public static void main(String[] args) {
        int num,res=0;
       String  s;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int div = num; div>=0; div--) {

            res = res + (num % 10);
            div = num / 10;
            num = div;
        }

        System.out.println("The addition of the digits is : "+res);
    }

}
