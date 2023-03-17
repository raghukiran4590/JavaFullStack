package com.java.edk1;

public class PrintEvenOddDoWhile {

    public static void main(String[] args) {
        int i=1,j=1;
        System.out.println("Even Numbers : ");

         do{
            if(i%2==0) {
                System.out.println(i);
            }
            i+=1;
        }
        while(i<=20);

        System.out.println("Odd Numbers : ");

        do {
            if(j%2!=0) {
                System.out.println(j);
            }
            j+=1;
        }
        while(j<=20);
    }
}
