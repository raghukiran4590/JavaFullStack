package com.java.edk3;

public class Daughter extends Father{

    public Daughter() {
        super();
        System.out.println("In the daughter class");
    }

    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.getAge();
    }
}
