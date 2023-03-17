package com.java.edk3;

public abstract class Account {

    String customerName;
    long accountNumber;
    final double minBalance = 1250;

    public abstract void depositAmount(long account, double amount);

    public abstract void withdrawAmount(long account, double amount);

}
