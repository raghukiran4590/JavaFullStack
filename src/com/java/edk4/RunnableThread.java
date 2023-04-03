package com.java.edk4;

class YourThread implements Runnable {

    @Override
    public void run() {
        System.out.println("========YourThread Started===========");
        System.out.println(Thread.currentThread().getName());
        for(int doc = 1; doc<=10; doc++) {
            System.out.println("Printing Doc #" + doc);
        }
        System.out.println("========YourThread Finished===========");
    }
}

public class RunnableThread {

    public static void main(String[] args) {
        System.out.println("========Application Started===========");
        System.out.println(Thread.currentThread().getName());
        try {
            Runnable r = new YourThread();
            Thread th = new Thread(r);
            th.setName("YourThread");
            th.start();

        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("========Application Finished===========");
    }
}
