package com.java.edk1;
//Write a program to print 10 even numbers and 10 odd numbers.

public class PrintEvenOdd {

    public static void main(String[] args) {
        System.out.println("Even Numbers : ");

        for (int i=1; i<=20; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
        System.out.println("Odd Numbers : ");
        for (int j=1; j<=20; j++) {
            if(j%2!=0) {
                System.out.println(j);
            }
        }
    }

}
