package com.java.package2;
import com.java.edk4.*;

public class PackageImport {

    public static void main(String[] args) {
        int a = 50;
        int b = 25;
        int num = 10;

        PackageExample pck = new PackageExample();
        System.out.println("Subtraction of A and B is : "+pck.subtract(a,b));
        System.out.println("Additon of A and B is : "+pck.addition(a,b));
        System.out.println("Multiplication of A and B is : "+pck.multiply(a,b));
        System.out.println("Division of A and B is : "+pck.divide(a,b));
        System.out.println("Factorial of a number is : "+pck.factorial(num));
        System.out.println("Reverse of a number is : "+pck.reverseDigits(num));
    }
}
