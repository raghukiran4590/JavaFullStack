package com.java.fullstack;

public class MoneyTransferService {

    CurrencyConverter1 cc = new CurrencyConverter1();

    double computeTransferAmount(int countryIndex, double amount) {

        return cc.computeTransferAmount(countryIndex, amount);

    }

    double computeTransferFee(int countryIndex, double amount) {

        return 0.02 * computeTransferAmount(countryIndex, amount);

    }


    public static void main(String[] args) {

        MoneyTransferService transferService = new MoneyTransferService();

        double transferAmount = transferService.computeTransferAmount(0, 1000);

        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);

        System.out.println("Transfer Fee: " + transferFee);

    }

}
