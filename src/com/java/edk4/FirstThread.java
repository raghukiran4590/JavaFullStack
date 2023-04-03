package com.java.edk4;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("========MyThread Started===========");
        System.out.println(Thread.currentThread().getName());
        for(int doc = 1; doc<=10; doc++) {
            System.out.println("Printing Doc #" + doc);
        }
        System.out.println("========MyThread Finished===========");
    }
}

public class FirstThread {

    public static void main(String[] args) {
        System.out.println("========Application Started===========");
        System.out.println(Thread.currentThread().getName());
        try {
            MyThread mt = new MyThread();
            mt.setName("MyThread");
            mt.start();
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("========Application Finished===========");
    }
}
