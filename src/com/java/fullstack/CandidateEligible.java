package com.java.fullstack;
//Write a program to check if acandidate is eligible for voting or not. (Hint: Check age)

import java.util.Scanner;

public class CandidateEligible {

    public static void main(String[] args) {

        int age;
        System.out.println("Please enter the age of the candidate : ");
        Scanner sc = new Scanner(System.in);
        age= sc.nextInt();

        System.out.println("Age is : "+age);

        if (age >=18) {
            System.out.println("Candidate is eligible for voting");
        } else {
            System.out.println("Candidate is not eligible for voting");
        }

    }
}
