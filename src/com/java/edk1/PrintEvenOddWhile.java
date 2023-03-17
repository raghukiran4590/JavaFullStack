package com.java.edk1;

public class PrintEvenOddWhile {

    public static void main(String[] args) {
        int i=1,j=1;
        System.out.println("Even Numbers : ");

        while(i<=20) {
            if(i%2==0) {
                System.out.println(i);
            }
            i+=1;
        }
        System.out.println("Odd Numbers : ");
        while(j<=20) {
            if(j%2!=0) {
                System.out.println(j);
            }
            j+=1;
        }
    }
}
