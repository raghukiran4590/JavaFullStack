package com.java.edk1;

public class Febanocci {
    public static void main(String[] args) {
        int sum=0,prev=0,nxt=1;

        System.out.println(prev+" ");//0
        System.out.println(nxt+" ");//1

        for (int i=2;i<10;i++) {

            sum=prev+nxt;//1
            System.out.println(sum);
            prev=nxt;//1
            nxt=sum;//2

        }

    }
}