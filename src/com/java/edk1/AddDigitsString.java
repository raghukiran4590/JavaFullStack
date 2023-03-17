package com.java.edk1;

import java.util.Scanner;

public class AddDigitsString {

    public static void main(String[] args) {

        String s;
        char ch;
        int res=0;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();

        System.out.println(s);
        System.out.println("string length : " + s.length());

        for(int i=0; i<s.length();i++) {

            ch =  s.charAt(i);
            res=res+Character.getNumericValue(ch);
        }
        System.out.println("Addition of the digits is : "+res);
    }

}
