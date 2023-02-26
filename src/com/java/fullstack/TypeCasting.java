package com.java.fullstack;

public class TypeCasting {

    static int a,c;
    static long b,d;
    static char x;

    static void typeCasting() {
        // Implicit Type-Casting
        // a is int; b is long
        // int is smaller datatype than long
        // so when we assign int to a long then implicit type casting occurs
        a =5;
        b=a;

        System.out.println("Value of a : " +a);
        System.out.println("Value of b : " +b);

        // Explicit Type-Casting
        // c is int; d is long
        // int is smaller datatype than long
        // so when we assign long to an int then explicit type casting occurs

        d=10;
        c= (int) d;

        System.out.println("Value of d : " +d);
        System.out.println("Value of c : " +c);

        //Implicit Type-Casting
        //char to int
        x= 'A';
        a=x;

        System.out.println("Value of x : " +x);
        System.out.println("Value of a : " +a);

        //Implicit Type-Casting
        //char to int
        a=70;
        x= (char) a;

        System.out.println("Value of a : " +a);
        System.out.println("Value of x : " +x);

    }

    public static void main(String[] args) {

        typeCasting();

    }
}
