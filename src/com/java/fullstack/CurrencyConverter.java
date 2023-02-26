package com.java.fullstack;

public class CurrencyConverter {

    /*
    int rupee = 63; //india
    int dirham = 3; // UAE
    int real = 3;   // brazilian
    int chilean_peso = 595; //chile
    int mexican_peso = 18; //mexico
    int _yen = 107; //japan
    int $australian = 2; //australia
    */

    double[] currencies = {63.0,3.0,3.0,595.0,18.0,107.0,2.0};

    void printCurrencies() {
        /*
        System.out.println(currency[0]);
        System.out.println(currency[1]);
        System.out.println(currency[2]);
        System.out.println(currency[3]);
        System.out.println(currency[4]);
        System.out.println(currency[5]);
        System.out.println(currency[6]);

        for (int i=0; i<currency.length; i++) {
            System.out.println(currency[i]);
        }
        */

        for(double currency:currencies) {
            System.out.println(currency);
        }

        System.out.println(currencies.length);
    }

    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
    }
}