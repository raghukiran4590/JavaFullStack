package com.java.edk1;

public class FebanocciWhile {

    public static void main(String[] args) {
        int sum=0,prev=0,nxt=1;

        System.out.println(prev+" ");//0
        System.out.println(nxt+" ");//1
        int i=2;
        while (i<10) {
            sum=prev+nxt;//1
            System.out.println(sum);
            prev=nxt;//1
            nxt=sum;//2
            i++;
        }
    }
}
