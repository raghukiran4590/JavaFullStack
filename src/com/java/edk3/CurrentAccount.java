package com.java.edk3;

public final class CurrentAccount extends Account{

private double totalBalance;

    public CurrentAccount(String customerName, long accountNumber) {
        super();

        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.totalBalance = this.totalBalance + minBalance;

        System.out.println("Welcome to your Current Bank Account : " + this.customerName);
        System.out.println();
        System.out.println("Your Account Number is : "+ this.accountNumber);
        System.out.println();
        System.out.println("Your Total Account Balance is : " + this.totalBalance);
        System.out.println();
    }

    public void depositAmount(long account, double amount) {
        this.totalBalance = this.totalBalance + amount;
        System.out.println("Total Amount Deposited Rs : "+amount);
        System.out.println("Total Funds available in the current account : " +this.totalBalance);
        System.out.println("*****************************************************************");
        System.out.println();
    }

    public void withdrawAmount(long account, double amount) {
        this.totalBalance = this.totalBalance - amount;
        System.out.println("Total Amount Withdrawn Rs : "+amount);
        System.out.println("Total Funds available in the current account : " +this.totalBalance);
        System.out.println("*****************************************************************");
        System.out.println();
    }

}
