package com.java.edk4;

import java.util.Scanner;

public class PackageExample {

    public int subtract(int a , int b) {
        int result = a-b;
        return result;
    }

    public int addition(int a , int b) {
        int result = a+b;
        return result;
    }

    public int multiply(int a , int b) {
        int result = a*b;
        return result;
    }

    public int divide(int a , int b) {
        int result = a/b;
        return result;
    }
    public int factorial(int num) {
        int fact = 1;
        for (int i = num; i > 0; ) {
            fact = fact * i;
            i--;
        }
        return fact;
    }

    public String reverseDigits(int num) {
        String str = "";
        for (int div = num; div>=0; div--) {
            str = str+(num % 10);
            num = num/10;
            div=num;
        }
        return str;
    }

}
