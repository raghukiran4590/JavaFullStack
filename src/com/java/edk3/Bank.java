package com.java.edk3;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        System.out.println("Hello "+args[0] + "!!!");
        System.out.println("*****************************************************************");
        System.out.println();
        System.out.println();
        System.out.print("Which type of account you want to create [1-Current,2-Savings] : ");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        switch(sc.nextInt()) {
            case 1 :
                Account currAccount = new CurrentAccount(args[0], 123456);

                currAccount.depositAmount(123456, 250.0);

                currAccount.withdrawAmount(123456, 150.0);
                break;

            case 2:
                Account savAccount = new SavingsAccount(args[0], 654321);

                savAccount.depositAmount(654321, 2250.0);

                savAccount.withdrawAmount(654321, 1500.0);
                break;
            default:
                System.out.println("Invalid Selection");
                System.exit(0);

        }

        System.out.println("Thanks for Visiting!!!");

    }
}


