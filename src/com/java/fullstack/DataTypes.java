package com.java.fullstack;
//Write programs to use all the data types and given arithmetic operations.
public class DataTypes {

    public static void main(String[] args) {

        byte a=1;
        short b=2;
        int c=10;

        float f=20.0f;
        double d=33.3;

        char ch='H';
        String s="String";

        //Addition
        System.out.println(a+b);
        System.out.println(b+c);
        System.out.println(c+d);
        System.out.println(f+d);
        System.out.println(ch+1);
        System.out.println(ch+'I');
        System.out.println(s+" Literal ");

        //Subtraction
        System.out.println(a-b);
        System.out.println(b-c);
        System.out.println(c-d);
        System.out.println(f-d);
        System.out.println(ch-1);
        System.out.println(ch-'I');
        System.out.println("***************************************");

        //Multiplication
        System.out.println(a*b);
        System.out.println(b*c);
        System.out.println(c*d);
        System.out.println(f*d);
        System.out.println(ch*1);
        System.out.println(ch*'I');
        System.out.println("***************************************");

        //Division
        System.out.println(a/b);
        System.out.println(b/c);
        System.out.println(c/d);
        System.out.println(f/d);
        System.out.println(ch/1);
        System.out.println(ch/'I');
        System.out.println("***************************************");

        //Increment
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(c++);
        System.out.println(++f);
        System.out.println(f++);
        System.out.println(++d);
        System.out.println(d++);
        System.out.println(++ch);
        System.out.println(ch++);
        System.out.println("***************************************");

        //Decrement
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(c--);
        System.out.println(--f);
        System.out.println(f--);
        System.out.println(--d);
        System.out.println(d--);
        System.out.println(--ch);
        System.out.println(ch--);
        System.out.println("***************************************");

    }
}
