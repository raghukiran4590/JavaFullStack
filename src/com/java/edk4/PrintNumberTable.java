package com.java.edk4;

class NumberTable extends Thread {
    @Override
    public void run() {
        System.out.println("========NumberTable Thread Started===========");
        System.out.println(Thread.currentThread().getName());
        for (int j = 1; j<=10; j++) {
            System.out.println("5 * "+ j + " = "+ (5*j));
        }
        System.out.println("========NumberTable Thread Finished===========");
    }
}

//Write a program to print tables of 5 by creating a new thread and display 20 even numbers as a task of main thread
public class PrintNumberTable {

    public static void main(String[] args) {
        System.out.println("========Main Thread Started===========");
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i<=40; i++) {
            //System.out.println("5 * "+ i + " = "+ (5*i));
            if (i%2==0){
                System.out.println(i);
            }
        }

        NumberTable nt = new NumberTable();
        nt.setName("NumberTable");
        nt.start();
        System.out.println("========Main Thread Finished===========");
    }
}
